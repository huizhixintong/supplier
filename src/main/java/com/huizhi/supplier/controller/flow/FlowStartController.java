package com.huizhi.supplier.controller.flow;

import com.alibaba.fastjson.JSON;
import com.huizhi.supplier.constant.Constants;
import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.model.TFlowExecute;
import com.huizhi.supplier.db.model.TFlowExecutePath;
import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecuteStatusLog;
import com.huizhi.supplier.service.flow.*;
import com.huizhi.supplier.util.RespUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/flow/start")
public class FlowStartController {
    @Resource
    private FlowStep flowStep;

    @Resource
    private FlowStart flowStart;

    @Resource
    private FlowExecutePoint flowExecutePoint;

    @Resource
    private FlowExecutePath flowExecutePath;

    @Resource
    private FlowExecute flowExecute;

    @ResponseBody
    @RequestMapping("/start")
    public Object startFlow(HttpServletRequest request,
                            @RequestParam("exeuteCode") String executeCode,
                            @RequestParam("flowCode") String flowCode,
                            @RequestParam("relationId") String relationId){
        TFlowExecutePoint point = flowExecutePoint.queryExecutePointInfo(executeCode,flowCode, Constants.CONT_EXECUTE_POINT_START);
        if (point == null){
            return RespUtil.getResponse(ErrCode.ERR_FLOW_NOT_EXITS);
        }
        int iRet = flowStart.startFlow(point,relationId);
        return returnRecordUpdate(iRet,point,"流程已经开始");
    }

    @ResponseBody
    @RequestMapping("/examine")
    public Object examineFlow(HttpServletRequest request,
                              @RequestBody() String requestBody){
        int iRet = -1;
        TFlowExecuteStatusLog statusLog = JSON.parseObject(requestBody,TFlowExecuteStatusLog.class);
        TFlowExecutePath point = getFlowExecutePath(statusLog,request.getHeader("username"),statusLog.getFlowId());
        if (point == null){
            return RespUtil.getResponse(ErrCode.ERR_FLOW_POINT_NOT_EXITS,requestBody);
        }

        iRet = flowStart.stepFlow(point,Integer.parseInt(statusLog.getOperateType()));

        return returnRecordUpdate(iRet,statusLog,"审核日志插入成功");
    }


    @RequestMapping("/executelist")
    @ResponseBody
    public Object queryExecuteList(HttpServletRequest request){
        List<TFlowExecute> list = flowExecute.queryExecuteList();
        return RespUtil.getResponse(ErrCode.CONT_SUCCESS,list);
    }


//    private int getFlowExecutePath(TFlowExecutePoint point, String userName){
//        if (StringUtils.isEmpty(point) || StringUtils.isEmpty(point.getFlowCode())){
//            return ErrCode.ERR_FLOW_PARAMETER_NULL;
//        }
//
//        if (flowStep.queryStepInfo(point.getFlowCode(),point.getPointId()) == null){
//            return ErrCode.ERR_FLOW_NOT_EXITS;
//        }
//
//        point.setCreateDate(LocalDateTime.now());
//        point.setCreateUser(userName);
//
//        return ErrCode.CONT_SUCCESS;
//    }

    private Object returnRecordUpdate(int iRet, Object obj, String msg){
        if ( iRet== Constants.CONT_RECORDER_EXITS){
            log.info(msg,obj);
            return RespUtil.getResponse(ErrCode.CONT_SUCCESS);
        }else {
            log.error(ErrCode.getErrMsg(iRet),obj);
            return RespUtil.getResponse(iRet);
        }
    }

    private TFlowExecutePath getFlowExecutePath(TFlowExecuteStatusLog statusLog, String userName, int flowId){
        statusLog.setCreateUser(userName);
        statusLog.setCreateDate(LocalDateTime.now());
        return flowExecutePath.queryExecutePath(flowId,statusLog.getExecuteCode(),statusLog.getFlowCode());

    }
}
