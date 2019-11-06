package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.dao.TFlowExecutePathMapper;
import com.huizhi.supplier.db.model.TFlowExecutePath;
import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.service.flow.FlowExecutePath;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("flowExecutePath")
public class FlowExecutePathImp implements FlowExecutePath {

    @Resource
    private TFlowExecutePathMapper tFlowExecutePathMapper;

    @Override
    public int addFlowExecutePath(TFlowExecutePath flowExecutePath) {
        tFlowExecutePathMapper.insertSelective(flowExecutePath);
        return  flowExecutePath.getId();
    }

    @Override
    public int delFlowExecutePath(int id) {
        return 0;
    }

    @Override
    public int updateFlowExecutePath(TFlowExecutePath flowExecuteStatus) {
        return  tFlowExecutePathMapper.updateByPrimaryKeySelective(flowExecuteStatus);
    }

    @Override
    public int updateFlowPoint(TFlowExecutePath flowExecutePath) {
        return tFlowExecutePathMapper.updateFlowPoint(flowExecutePath);
    }

    @Override
    public int queryExecutePath(TFlowExecutePoint executePoint, String relationId) {
        TFlowExecutePath status = new TFlowExecutePath();
        BeanUtils.copyProperties(executePoint,status);
        status.setReleationId(relationId);
        return tFlowExecutePathMapper.queryExecuteStatus(status);
    }

    @Override
    public TFlowExecutePath queryExecutePath(int flowId, String executeCode, String flowCode) {
        return tFlowExecutePathMapper.queryExecutePath(flowId,executeCode,flowCode);
    }

    @Override
    public int updateFlowPoint(String executeCode, String flowCode, int pointId,String relationId) {
        TFlowExecutePath pointPath =  new TFlowExecutePath();
        pointPath.setExecuteCode(executeCode);
        pointPath.setFlowCode(flowCode);
        pointPath.setPointId(pointId);
        pointPath.setReleationId(relationId);

        return tFlowExecutePathMapper.updateFlowPoint(pointPath);
    }


}
