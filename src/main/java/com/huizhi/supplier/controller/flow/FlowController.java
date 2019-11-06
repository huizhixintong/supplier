package com.huizhi.supplier.controller.flow;

import com.alibaba.fastjson.JSONObject;
import com.huizhi.supplier.constant.Constants;
import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.model.TFlowModel;
import com.huizhi.supplier.db.model.TFlowPointOperatePersonnel;
import com.huizhi.supplier.db.model.TFlowStepDefine;
import com.huizhi.supplier.model.FlowPrivilege;
import com.huizhi.supplier.service.flow.FlowGenerate;
import com.huizhi.supplier.service.flow.FlowModel;
import com.huizhi.supplier.service.flow.FlowPoint;
import com.huizhi.supplier.service.flow.FlowStep;
import com.huizhi.supplier.util.RespUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RequestMapping("/flow/")
@RestController
@Slf4j
public class FlowController {

    @Resource
    private FlowModel flowModel;

    @Resource
    private FlowStep flowStep;

    @Resource
    private FlowGenerate flowGenerate;

    @Resource
    private FlowPoint flowPoint;

    @ResponseBody
    @RequestMapping("/model/add")
    public Object addFlowMode(HttpServletRequest request,
                              @RequestParam("name") String flowName,
                              @RequestParam("status") int status,
                              @RequestParam("flowType") int flowType){
        int iRet = -1;
        TFlowModel model = getModel(flowName,status,request.getHeader("userName"),(short)flowType);
        if ((iRet = flowModel.addModel(model))== Constants.CONT_RECORDER_EXITS){
            log.info("数据插入成功",model);
            return RespUtil.getResponse(ErrCode.CONT_SUCCESS);
        }else {
            log.error(ErrCode.getErrMsg(iRet),model);
            return RespUtil.getResponse(iRet);
        }
    }

    @ResponseBody
    @RequestMapping("/model/edit")
    public Object editFlowMode(HttpServletRequest request,
                               @RequestParam("name") String flowName,
                               @RequestParam("code") String flowcode,
                               @RequestParam("id") int id,
                               @RequestParam("status") int status,
                               @RequestParam("flowType") short flowType){

        int iRet = -1;
        TFlowModel model = getModel(flowcode,flowName,status,request.getHeader("userName"),id,flowType);
        if ((iRet = flowModel.updateModel(model))== Constants.CONT_RECORDER_EXITS){
            log.info("数据更新成功",model);
            return RespUtil.getResponse(ErrCode.CONT_SUCCESS);
        }else {
            log.error(ErrCode.getErrMsg(iRet),model);
            return RespUtil.getResponse(iRet);
        }

    }

    @ResponseBody
    @RequestMapping("/model/point/add")
    public Object addFlowPoint(HttpServletRequest request,
                              @RequestBody() String requestBody){
        int iRet;
        TFlowStepDefine tFlowStepDefine = JSONObject.parseObject(requestBody,TFlowStepDefine.class);
        if (tFlowStepDefine == null){
            return RespUtil.getResponse(ErrCode.ERR_FLOW_PARAMETER_NULL);
        }

        if ((iRet = getStepModel(tFlowStepDefine)) != ErrCode.CONT_SUCCESS){
            log.error(ErrCode.getErrMsg(ErrCode.ERR_POINT_CLASS_UNKNOWN),tFlowStepDefine);
            return RespUtil.getResponse(iRet);
        }

        iRet = flowStep.addStep(tFlowStepDefine);
        return returnRecordUpdate(iRet, tFlowStepDefine,"数据插入成功");
    }

    @ResponseBody
    @RequestMapping("/model/point/edit")
    public Object editFlowPoint(HttpServletRequest request,
                               @RequestBody() String requestBody){
        int iRet;
        TFlowStepDefine tFlowStepDefine = JSONObject.parseObject(requestBody,TFlowStepDefine.class);
        if (tFlowStepDefine == null){
            return RespUtil.getResponse(ErrCode.ERR_FLOW_PARAMETER_NULL);
        }

        iRet = flowStep.updateStep(tFlowStepDefine);
        return returnRecordUpdate(iRet, tFlowStepDefine,"数据更新成功");
    }


    @ResponseBody
    @RequestMapping("/model/point/query")
    public String queryFlowPoint(HttpServletRequest request,
                              @RequestParam("flowName") String flowName,
                              @RequestParam("pointName") String pointName ){

//        flowStep.queryStepInfo(flowName,pointName);
        return null;
    }


    @ResponseBody
    @RequestMapping("/operator/add")
    public Object addFlowPointOperator(HttpServletRequest request,
                                 @RequestParam("pointId") int pointId,
                                 @RequestParam("operatortype") int operatorType ){
        TFlowPointOperatePersonnel personnel = getPointPersonnelModel(pointId,operatorType,request.getHeader("userName"));
        int iRet = flowPoint.addFlowPoint(personnel);
        return returnRecordUpdate(iRet, personnel,"数据插入成功");

    }

    @ResponseBody
    @RequestMapping("/operator/edit")
    public Object editFlowPointOperator(HttpServletRequest request,
                                       @RequestParam("pointId") int pointId,
                                       @RequestParam("operatortype") int operatorType ){
        TFlowPointOperatePersonnel personnel = getPointPersonnelModel(pointId,operatorType,request.getHeader("userName"));
        int iRet = flowPoint.addFlowPoint(personnel);
        return returnRecordUpdate(iRet, personnel,"数据插入成功");
    }

    @ResponseBody
    @RequestMapping("point/privilege")
    public Object getFlowPointPrivilege(HttpServletRequest request,
                                        @RequestParam("flowCode") String flowCode,
                                        @RequestParam("pointId") int pointId ){
        TFlowStepDefine stepInfo = flowStep.queryStepInfo(flowCode,pointId);
        if (stepInfo == null){
            return RespUtil.getResponse(ErrCode.ERR_FLOW_POINT_NOT_EXITS);
        }

        FlowPrivilege flowPrivilege = new FlowPrivilege();
        flowPrivilege.setPrivilege(stepInfo.getOperateContent());
        flowPrivilege.setFlowCode(stepInfo.getFlowCode());
        flowPrivilege.setPointId(pointId);
        flowPrivilege.new ParsePrivilege().parsePrivilege();

        return RespUtil.getResponse(ErrCode.CONT_SUCCESS,flowPrivilege);




    }


    private TFlowModel getModel(String name, int status, String userName,short flowType){
        String flowCode = flowGenerate.createFlowCode();
        return getModel(flowCode,name,status,userName,0,flowType);
    }

    private TFlowModel getModel(String code,String name, int status, String userName,int id, short flowType){
        TFlowModel model = new TFlowModel();
        model.setFlowCode(code);
        model.setFlowName(name);
        model.setFlowStatus(""+status);
        model.setCreateDate(LocalDateTime.now());
        model.setCreateUser(userName);
        model.setFlowType(flowType);
        if (id>0) {
            model.setId(id);
        }
        return model;
    }

    private TFlowPointOperatePersonnel getPointPersonnelModel(int pointId, int personType, String userName){
        return getPointPersonnelModel(pointId,personType,0,userName);
    }

    private TFlowPointOperatePersonnel getPointPersonnelModel(int pointId, int personType, int id,String userName){
        TFlowPointOperatePersonnel personnel = new TFlowPointOperatePersonnel();
        personnel.setPersonnelType(personType);
        personnel.setCreateUser(userName);
        personnel.setPointId(pointId);
        if (id>0) {
            personnel.setId(id);
        }
        return personnel;
    }

    private int getStepModel(TFlowStepDefine define){

        int pointId = -1;
        int superiorPointId = -1;
        switch (Integer.parseInt(define.getPointClass())){
            case Constants.CONT_POINT_CLASS_START:
                pointId = Constants.CONT_EXECUTE_POINT_START;
                superiorPointId = Constants.CONT_EXECUTE_POINT_START;
                break;
            case Constants.CONT_POINT_CLASS_MID:
                pointId = flowGenerate.createPointId();
                superiorPointId = define.getSuperiorPoint();
                break;
            case Constants.CONT_POINT_CLASS_END:
                pointId = Constants.CONT_EXECUTE_POINT_END;
                superiorPointId = define.getSuperiorPoint();
                break;
            default:

                return ErrCode.ERR_POINT_CLASS_UNKNOWN;

        }

        define.setSuperiorPoint(superiorPointId);
        define.setPointId(pointId);

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
