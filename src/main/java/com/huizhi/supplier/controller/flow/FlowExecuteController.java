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
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RequestMapping("/flow/execute/")
@Slf4j
@RestController
public class FlowExecuteController {

    @Resource
    private FlowExecute flowExecute;

    @Resource
    private FlowGenerate flowGenerate;

    @Resource
    private FlowModel flowModel;

    @Resource
    private FlowStep flowStep;


    @Resource
    private FlowExecutePoint flowExecutePoint;


    @Resource
    private FlowExecutePath flowExecutePath;

    @ResponseBody
    @RequestMapping("/add")
    public Object addFlowExecute(HttpServletRequest request,
                                       @RequestBody() String requestBody){
        int iRet = -1;
        TFlowExecute execute = JSON.parseObject(requestBody,TFlowExecute.class);
        if (execute == null){
            return RespUtil.getResponse(ErrCode.ERR_FLOW_PARAMETER_NULL);
        }

        if ((iRet = getFlowExecute(execute,request.getHeader("username"))) != ErrCode.CONT_SUCCESS){
            return RespUtil.getResponse(iRet);
        }

        iRet = flowExecute.addFlowExecute(execute);
        return returnRecordUpdate(iRet, execute,"数据插入成功");
    }

    @ResponseBody
    @RequestMapping("/edit")
    public Object editFlowExecute(HttpServletRequest request,
                                       @RequestBody() String requestBody){
        int iRet = -1;
        TFlowExecute execute = JSON.parseObject(requestBody,TFlowExecute.class);
        if (execute == null){
            return RespUtil.getResponse(ErrCode.ERR_FLOW_PARAMETER_NULL);
        }

        if ((iRet = getFlowExecute(execute,request.getHeader("username"))) != ErrCode.CONT_SUCCESS){
            return RespUtil.getResponse(iRet);
        }

        iRet = flowExecute.updateFlowExecute(execute);
        return returnRecordUpdate(iRet, execute,"数据更新成功");

    }

    @ResponseBody
    @RequestMapping("/point/addExecutor")
    public Object addFlowPointExecutor(HttpServletRequest request,
                                       @RequestBody() String requestBody){
        int iRet = -1;
        TFlowExecutePoint point = JSON.parseObject(requestBody,TFlowExecutePoint.class);
        if ((iRet = getFlowExecutePath(point,request.getHeader("username"))) != ErrCode.CONT_SUCCESS){
            return RespUtil.getResponse(iRet);
        }

        iRet = flowExecutePoint.addFlowExecutePoint(point);
        return returnRecordUpdate(iRet, point,"数据插入成功");

    }

    @ResponseBody
    @RequestMapping("/point/editExecutor")
    public Object editFlowPointExecutor(HttpServletRequest request,
                                       @RequestBody() String requestBody){
        int iRet = -1;
        TFlowExecutePoint point = JSON.parseObject(requestBody,TFlowExecutePoint.class);
        if ((iRet = getFlowExecutePath(point,request.getHeader("username"))) != ErrCode.CONT_SUCCESS){
            return RespUtil.getResponse(iRet);
        }

        iRet = flowExecutePoint.updateFlowExecutePoint(point);
        return returnRecordUpdate(iRet, point,"数据更新成功");
    }

    private int getFlowExecutePath(TFlowExecutePoint point, String userName){
        if (StringUtils.isEmpty(point) || StringUtils.isEmpty(point.getFlowCode())){
            return ErrCode.ERR_FLOW_PARAMETER_NULL;
        }

        if (flowStep.queryStepInfo(point.getFlowCode(),point.getPointId()) == null){
            return ErrCode.ERR_FLOW_NOT_EXITS;
        }

        point.setCreateDate(LocalDateTime.now());
        point.setCreateUser(userName);

        return ErrCode.CONT_SUCCESS;
    }




    private TFlowExecutePath getFlowExecutePath(TFlowExecuteStatusLog statusLog, String userName, int flowId){
        statusLog.setCreateUser(userName);
        statusLog.setCreateDate(LocalDateTime.now());
        return flowExecutePath.queryExecutePath(flowId,statusLog.getExecuteCode(),statusLog.getFlowCode());

    }

    private int getFlowExecute(TFlowExecute execute, String userName){

        if (StringUtils.isEmpty(execute) || StringUtils.isEmpty(execute.getFlowCode())){
            return ErrCode.ERR_FLOW_PARAMETER_NULL;
        }

        /*应该验让flowcode是否存在*/
        if (flowModel.queryFlowCode(execute.getFlowCode()) == null){
            return ErrCode.ERR_FLOW_NOT_EXITS;
        }

        String code = flowGenerate.createFlowExecuteCode(execute.getFlowCode());
        execute.setExecuteCode(code);
        execute.setCreateDate(LocalDateTime.now());

        return ErrCode.CONT_SUCCESS;
    }

    private Object returnRecordUpdate(int iRet, Object obj, String msg){
        if ( iRet== Constants.CONT_RECORDER_EXITS){
            log.info(msg,obj);
            return RespUtil.getResponse(ErrCode.CONT_SUCCESS);
        }else {
            log.error(ErrCode.getErrMsg(iRet),obj);
            return RespUtil.getResponse(iRet);
        }
    }
}
