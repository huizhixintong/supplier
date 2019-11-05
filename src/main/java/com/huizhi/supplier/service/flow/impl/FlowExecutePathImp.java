package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.dao.TFlowExecutePathMapper;
import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecutePath;
import com.huizhi.supplier.service.flow.FlowExecutePath;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("flowExecuteStatus")
public class FlowExecutePathImp implements FlowExecutePath {

    @Resource
    private TFlowExecutePathMapper tFlowExecuteStatusMapper;

    @Override
    public int addFlowExecuteStatus(TFlowExecutePath flowExecuteStatus) {
        return tFlowExecuteStatusMapper.insert(flowExecuteStatus);
    }

    @Override
    public int delFlowExecuteStatus(int id) {
        return 0;
    }

    @Override
    public int updateFlowExecuteStatus(TFlowExecutePath flowExecuteStatus) {
        return  tFlowExecuteStatusMapper.updateByPrimaryKeySelective(flowExecuteStatus);
    }

    @Override
    public int updateFlowPoint(TFlowExecutePoint flowExecutePoint) {
        return tFlowExecuteStatusMapper.updateFlowPoint(flowExecutePoint);
    }

    @Override
    public int queryExecuteStatus(TFlowExecutePoint executePoint,String relationId) {
        TFlowExecutePath status = new TFlowExecutePath();
        BeanUtils.copyProperties(executePoint,status);
        status.setReleationId(relationId);
        return tFlowExecuteStatusMapper.queryExecuteStatus(status);
    }

    @Override
    public int updateFlowPoint(String executeCode, String flowCode, int pointId) {
        TFlowExecutePoint point =  new TFlowExecutePoint();
        point.setExecuteCode(executeCode);
        point.setFlowCode(flowCode);
        point.setPointId(pointId);

        return tFlowExecuteStatusMapper.updateFlowPoint(point);
    }


}
