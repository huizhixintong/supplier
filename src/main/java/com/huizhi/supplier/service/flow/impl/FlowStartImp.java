package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.constant.Constants;
import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.model.*;
import com.huizhi.supplier.model.NotifyInfo;
import com.huizhi.supplier.service.flow.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service("flowStart")
@Slf4j
public class FlowStartImp implements FlowStart {

    @Resource
    private FlowExecutePath flowExecuteStatus;

    @Resource
    private FlowExecuteStatusLog flowExecuteStatusLog;

    @Resource
    private FlowStep flowStep;

    @Resource
    private FlowExecutePoint flowExecutePoint;


    @Override
    public int stepFlow(TFlowExecutePath executePath,int act) {
        int iRet = -1;
        /*中间审核*/

        if ((iRet = midFlow(executePath,act)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }
        /*流程结束*/
        return endFlow(executePath);
    }

    public int startFlow(TFlowExecutePoint executePoint, String relationId){
        int iRet = -1;
        if (executePoint.getPointId() != Constants.CONT_EXECUTE_POINT_START){
            return ErrCode.CONT_SUCCESS;
        }

        /*验证流程有效性*/
        if ((iRet = validFlow(executePoint,relationId)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        /*初始化流程状态*/
        if (initFlowPointStatus(executePoint,relationId) != Constants.CONT_RECORDER_EXITS){
            log.error("初始化审核流程失败!",executePoint);
        }

        /*初始化流程日志*/
        if (initFlowPointStatusLog(executePoint) != Constants.CONT_RECORDER_EXITS){
            log.error("初始化审核流程日志失败！",executePoint);
        }

        /*根据通知类型进行消息通知*/
        notifyInfo(executePoint);

        return ErrCode.CONT_SUCCESS;
    }


    private int validFlow(TFlowExecutePoint executePoint,String relationId){

        int iRet = -1;
        if (StringUtils.isEmpty(relationId)){
            return ErrCode.ERR_FLOW_RELATION_NULL;
        }

        /*验证新创建的流程是否完整理*/
        if ((iRet = verifyIncompleteFlow(executePoint)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        /*验证流程是否已经开始*/
        if ((iRet = validStartFlow(executePoint,relationId)) != ErrCode.ERR_FLOW_EXITS){
            return iRet;
        }

        return ErrCode.CONT_SUCCESS;
    }

    private int verifyIncompleteFlow(TFlowExecutePoint executePoint){
        if (flowExecutePoint.queryIncompleteFlow(executePoint) == true){
            return ErrCode.CONT_SUCCESS;
        }else {
            return ErrCode.ERR_FLOW_INCOMPLETE;
        }
    }


    private int endFlow(TFlowExecutePoint executePoint){
        int iRet = -1;
        TFlowExecutePoint nextPoint = getNextFlowPoint(executePoint);
        if (StringUtils.isEmpty(nextPoint)){
            return ErrCode.ERR_FLOW_POINT_NOT_EXITS;
        }

        if (executePoint.getPointId() != Constants.CONT_EXECUTE_POINT_END){
            return ErrCode.CONT_SUCCESS;
        }

        /*验证流程是否已经结束*/
        if ((iRet = validMidFlow(executePoint)) == ErrCode.ERR_FLOW_POINT_FINISHED){
            return ErrCode.ERR_FLOW_POINT_FINISHED;
        }

        /*更新流程日志，设置流程结束标志*/
        if ((iRet = updateFlowStatusLog(executePoint,Constants.CONT_FLOW_STATUS_FINISH)) != Constants.CONT_RECORDER_EXITS){
            log.error(ErrCode.getErrMsg(iRet),executePoint);
            return iRet;
        }

        return ErrCode.CONT_SUCCESS;
    }

    private int midFlow(TFlowExecutePath executePath, int act){
        int iRet;

        if (executePath.getPointId() == Constants.CONT_EXECUTE_POINT_END){
            return ErrCode.CONT_SUCCESS;
        }

        /*验证当前流程是否已经执行完毕*/
        if ((iRet = validMidFlow(executePath)) != ErrCode.ERR_FLOW_POINT_UNFINISHED){
            return iRet;
        }

        /*审批动作:1 更新流程节点 2 更新日志， 3 初始化下一步流程日志*/
        if ((iRet = updateFlowStatusLog(executePath,act)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        /*如果流程被驳回，返回流程第二步*/
        if ((iRet = nextAct(executePath,act)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        TFlowExecutePoint nextPoint = getNextFlowPoint(executePath);
        if (!StringUtils.isEmpty(nextPoint)){
            return ErrCode.ERR_FLOW_NEXT_POINT;
        }

        if ((iRet = updateFlowPoint(nextPoint)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        if ((iRet = initFlowPointStatusLog(nextPoint,Constants.CONT_FLOW_STATUS_WAIT)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        notifyInfo(nextPoint);
        return ErrCode.CONT_SUCCESS;
    }

    private int nextAct(TFlowExecutePoint executePoint ,int act){
        if (act == Constants.CONT_FLOW_STATUS_REFUSE){
            return ErrCode.ERR_FLOW_POINT_FINISHED;
        }

        if (act == Constants.CONT_FLOW_STATUS_REJECT){
            /*获取第二步流程*/
            notifyInfo(executePoint);
            resetFlowPoint(executePoint);
            return ErrCode.ERR_FLOW_POINT_FINISHED;
        }

        return ErrCode.CONT_SUCCESS;

    }


    private int resetFlowPoint(TFlowExecutePoint executePoint){
        return flowExecuteStatus.updateFlowPoint(executePoint.getExecuteCode(),executePoint.getFlowCode(),Constants.CONT_EXECUTE_POINT_START);
    }


    private int updateFlowPoint(TFlowExecutePoint executePoint){

        return flowExecuteStatus.updateFlowPoint(executePoint);
    }

    private int updateFlowStatusLog(TFlowExecutePoint executePoint, int act){
        return flowExecuteStatusLog.updateStatusLog(getExecuteStatusLog(executePoint,act));
    }

    private int initFlowPointStatusLog(TFlowExecutePoint executePoint, int act){
        return flowExecuteStatusLog.addExecuteStatusLog(getExecuteStatusLog(executePoint,act));
    }

    private TFlowExecutePoint getNextFlowPoint(TFlowExecutePoint executePoint){

        TFlowStepDefine stepDefine = flowStep.queryNextStepInfo(executePoint);
        if (stepDefine == null){
            return  null;
        }

        return flowExecutePoint.queryExecutePointInfo(executePoint.getExecuteCode(),stepDefine.getFlowCode(),stepDefine.getPointId());

    }

    private int validStartFlow(TFlowExecutePoint executePoint,String relationId){
        if (flowExecuteStatus.queryExecuteStatus(executePoint, relationId) == Constants.CONT_RECORDER_EXITS){
            return ErrCode.ERR_FLOW_EXITS;
        }else {
            return ErrCode.ERR_FLOW_NOT_EXITS;
        }
    }

    private int validMidFlow(TFlowExecutePath executePath){
        TFlowExecuteStatusLog statusLog = flowExecuteStatusLog.queryExecuteStatusLog(executePath);
        if (statusLog == null){
            return ErrCode.ERR_FLOW_POINT_NOT_EXITS;
        }

        if (Integer.valueOf(statusLog.getOperateType()) != Constants.CONT_FLOW_STATUS_DEFUALT){
            log.info(ErrCode.getErrMsg(ErrCode.ERR_FLOW_POINT_FINISHED),executePath);
            return ErrCode.ERR_FLOW_POINT_FINISHED;
        }

        return ErrCode.ERR_FLOW_POINT_UNFINISHED;
    }

    private int initFlowPointStatus(TFlowExecutePoint executePoint, String relationId){
        /*插入流程数据*/

        return flowExecuteStatus.addFlowExecuteStatus(getExecuteStatus(executePoint,relationId));
    }


    private int initFlowPointStatusLog(TFlowExecutePoint executePoint){
        return initFlowPointStatusLog(executePoint,Constants.CONT_FLOW_STATUS_DEFUALT);
    }

    private TFlowExecutePath getExecuteStatus(TFlowExecutePoint executePoint, String relationId){
        TFlowExecutePath status = new TFlowExecutePath();
        status.setExecuteCode(executePoint.getExecuteCode());
        status.setFlowCode(executePoint.getFlowCode());
        status.setPointId(executePoint.getPointId());
        status.setReleationId(relationId);
        return status;
    }

    private TFlowExecuteStatusLog getExecuteStatusLog(TFlowExecutePoint executePoint){
        return getExecuteStatusLog(executePoint,Constants.CONT_FLOW_STATUS_DEFUALT);
    }

    private TFlowExecuteStatusLog getExecuteStatusLog(TFlowExecutePoint executePoint, int act){
        TFlowExecuteStatusLog statusLog = new TFlowExecuteStatusLog();
        statusLog.setExecuteCode(executePoint.getExecuteCode());
        statusLog.setOperateName(executePoint.getExecutor());
        statusLog.setOperateType(""+act);
        statusLog.setOperateName(Constants.getFlowStatusDetail(act));
        statusLog.setFlowCode(executePoint.getFlowCode());
        statusLog.setPointId(executePoint.getPointId());

        return statusLog;
    }

    private void notifyInfo(TFlowExecutePoint executePoint){
        TFlowStepDefine stepDefine = flowStep.queryStepInfo(executePoint.getFlowCode(),executePoint.getPointId());
        if (stepDefine == null){
            log.error("查询流程节点信息异常！",executePoint);
            return;
        }

        switch (Integer.valueOf(stepDefine.getExecuteMovement())){
            case Constants.CONT_NOTIFY_TYPE_MAIL:
                break;
            case Constants.CONT_NOTIFY_TYPE_SMS:
                break;
            default:
        }
    }

    private void sendMail(NotifyInfo info){
        return;
    }

    private void sendSms(NotifyInfo info){
        return;
    }

    private NotifyInfo getNotifyInfo(TFlowStepDefine stepDefine, TFlowExecutePoint executePoint, TFlowExecute execute,Object userInfo){
        return null;
    }
}
