package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.constant.Constants;
import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.model.*;
import com.huizhi.supplier.model.NotifyInfo;
import com.huizhi.supplier.service.flow.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service("flowStart")
@Slf4j
public class FlowStartImp implements FlowStart {

    @Resource
    private FlowExecutePath flowExecutePath;

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
        int flowId = 0;
        if (executePoint.getPointId() != Constants.CONT_EXECUTE_POINT_START){
            return ErrCode.CONT_SUCCESS;
        }

        /*验证流程有效性*/
        if ((iRet = validFlow(executePoint,relationId)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        /*初始化流程状态*/
        TFlowExecutePoint nextPoint = getNextFlowPoint(executePoint);

        /*第一步流程提交，直接完成*/
        if ((flowId=initFlowPointPath(nextPoint,relationId)) <=0){
            log.error("初始化审核流程失败!",executePoint);
        }

        /*初始化流程日志*/
        if (initFlowPointStatusLog(nextPoint,Constants.CONT_FLOW_STATUS_COMMIT,flowId) != Constants.CONT_RECORDER_EXITS){
            log.error("初始化审核流程日志失败！",executePoint);
        }

        /*获取提交后的流程*/
        nextPoint = getNextFlowPoint(nextPoint);
        TFlowExecutePath nextPath = getExecutePath(nextPoint,relationId);
        if ((iRet = updateFlowPoint(nextPath)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        /*初始化流程日志*/
        if (initFlowPointStatusLog(nextPoint,flowId) != Constants.CONT_RECORDER_EXITS){
            log.error("初始化审核流程日志失败！",executePoint);
        }

        /*根据通知类型进行消息通知*/
        notifyInfo(nextPoint,Constants.CONT_FLOW_STATUS_WAIT,relationId);

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


    private int endFlow(TFlowExecutePath executePath){
        int iRet = -1;
//        TFlowExecutePoint point = new TFlowExecutePoint();
//        BeanUtils.copyProperties(executePath,point);
        TFlowExecutePoint nextPoint = getNextFlowPoint(executePath);
        if (StringUtils.isEmpty(nextPoint)){
            return ErrCode.ERR_FLOW_POINT_NOT_EXITS;
        }

        if (executePath.getPointId() != Constants.CONT_EXECUTE_POINT_END){
            return ErrCode.CONT_SUCCESS;
        }

        /*验证流程是否已经结束*/
        if ((iRet = validMidFlow(executePath)) == ErrCode.ERR_FLOW_POINT_FINISHED){
            return ErrCode.ERR_FLOW_POINT_FINISHED;
        }

        /*更新流程日志，设置流程结束标志*/
        if ((iRet = updateFlowStatusLog(executePath,Constants.CONT_FLOW_STATUS_FINISH)) != Constants.CONT_RECORDER_EXITS){
            log.error(ErrCode.getErrMsg(iRet),executePath);
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

        TFlowExecutePath nextPath = getNextExecutePath(nextPoint,executePath.getReleationId());


        if ((iRet = updateFlowPoint(nextPath)) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        if ((iRet = initFlowPointStatusLog(nextPoint,Constants.CONT_FLOW_STATUS_WAIT,nextPath.getId())) != ErrCode.CONT_SUCCESS){
            return iRet;
        }

        notifyInfo(nextPoint,Constants.CONT_FLOW_STATUS_WAIT,executePath.getReleationId());
        return ErrCode.CONT_SUCCESS;
    }

    private TFlowExecutePath getNextExecutePath(TFlowExecutePoint point, String releationId){
        TFlowExecutePath nextPath = new TFlowExecutePath();
        BeanUtils.copyProperties(point,nextPath);
        nextPath.setReleationId(releationId);

        return nextPath;
    }

    private int nextAct(TFlowExecutePath executePath ,int act){
        if (act == Constants.CONT_FLOW_STATUS_REFUSE){
            return ErrCode.ERR_FLOW_POINT_FINISHED;
        }

        if (act == Constants.CONT_FLOW_STATUS_REJECT){
            /*获取第二步流程*/
            TFlowExecutePoint point = getSecondPoint(executePath);
            notifyInfo(point,Constants.CONT_FLOW_STATUS_REJECT,executePath.getReleationId());
            resetFlowPoint(point,executePath.getReleationId());
            initFlowPointStatusLog(point,Constants.CONT_FLOW_STATUS_WAIT,executePath.getId());
            return ErrCode.ERR_FLOW_POINT_FINISHED;
        }

        return ErrCode.CONT_SUCCESS;

    }

    private TFlowExecutePoint getSecondPoint(TFlowExecutePath path){
        TFlowExecutePath executePath = new TFlowExecutePath();
        BeanUtils.copyProperties(path,executePath);
        executePath.setPointId(Constants.CONT_EXECUTE_POINT_START);
        return getNextFlowPoint(executePath);
    }

    private int resetFlowPoint(TFlowExecutePoint executePoint,String relationId){
        return flowExecutePath.updateFlowPoint(executePoint.getExecuteCode(),executePoint.getFlowCode(),Constants.CONT_EXECUTE_POINT_START,relationId);
    }


    private int updateFlowPoint(TFlowExecutePath executePath){

        return flowExecutePath.updateFlowPoint(executePath);
    }

    private int updateFlowStatusLog(TFlowExecutePath executePath, int act){
        TFlowExecutePoint point = flowExecutePoint.queryExecutePointInfo(executePath.getExecuteCode(),executePath.getFlowCode(),executePath.getPointId());
        return flowExecuteStatusLog.updateStatusLog(getExecuteStatusLog(point,act));
    }

    private int initFlowPointStatusLog(TFlowExecutePoint executePoint, int act, int flowId){
        return flowExecuteStatusLog.addExecuteStatusLog(getExecuteStatusLog(executePoint,act,flowId));
    }

    private int initFlowPointStatusLog(TFlowExecutePoint executePoint,int flowId){
        return initFlowPointStatusLog(executePoint,Constants.CONT_FLOW_STATUS_DEFUALT,flowId);
    }

    private TFlowExecutePoint getNextFlowPoint(TFlowExecutePoint point){
        TFlowStepDefine stepDefine = flowStep.queryNextStepInfo(point);
        if (stepDefine == null){
            return  null;
        }

        return flowExecutePoint.queryExecutePointInfo(point.getExecuteCode(),stepDefine.getFlowCode(),stepDefine.getPointId());
    }

    private TFlowExecutePoint getNextFlowPoint(TFlowExecutePath executePath){
        TFlowExecutePoint point = new TFlowExecutePoint();
        BeanUtils.copyProperties(executePath,point);
        return getNextFlowPoint(point);
//        if (nextPoint == null){
//            return  null;
//        }
//        TFlowExecutePath path = new TFlowExecutePath();
//        BeanUtils.copyProperties(nextPoint,path);
//        path.setReleationId(executePath.getReleationId());
//
//        return path;
    }

    private int validStartFlow(TFlowExecutePoint executePoint,String relationId){
        if (flowExecutePath.queryExecutePath(executePoint, relationId) == Constants.CONT_RECORDER_EXITS){
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

    private int initFlowPointPath(TFlowExecutePoint executePoint, String relationId){
        /*插入流程数据*/
        return flowExecutePath.addFlowExecutePath(getExecutePath(executePoint,relationId));
    }




    private TFlowExecutePath getExecutePath(TFlowExecutePoint executePoint, String relationId){
        TFlowExecutePath status = new TFlowExecutePath();
        status.setExecuteCode(executePoint.getExecuteCode());
        status.setFlowCode(executePoint.getFlowCode());
        status.setPointId(executePoint.getPointId());
        status.setReleationId(relationId);
        return status;
    }

    private TFlowExecuteStatusLog getExecuteStatusLog(TFlowExecutePoint executePoint,int flowId){
        return getExecuteStatusLog(executePoint,Constants.CONT_FLOW_STATUS_DEFUALT,flowId);
    }

    private TFlowExecuteStatusLog getExecuteStatusLog(TFlowExecutePoint executePoint, int act, int flowId){
        TFlowExecuteStatusLog statusLog = new TFlowExecuteStatusLog();
        statusLog.setExecuteCode(executePoint.getExecuteCode());
        statusLog.setOperateName(executePoint.getExecutor());
        statusLog.setOperateType(""+act);
        statusLog.setOperateName(Constants.getFlowStatusDetail(act));
        statusLog.setFlowCode(executePoint.getFlowCode());
        statusLog.setPointId(executePoint.getPointId());
        statusLog.setFlowId(flowId);

        return statusLog;
    }

    private void notifyInfo(TFlowExecutePoint executePoint,int act,String relationId){
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
