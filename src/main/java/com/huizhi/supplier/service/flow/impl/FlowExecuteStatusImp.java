package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.dao.TFlowExecuteStatusMapper;
import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecuteStatus;
import com.huizhi.supplier.service.flow.FlowExecuteStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("flowExecuteStatus")
public class FlowExecuteStatusImp implements FlowExecuteStatus {

    @Resource
    private TFlowExecuteStatusMapper tFlowExecuteStatusMapper;

    @Override
    public int addFlowExecuteStatus(TFlowExecuteStatus flowExecuteStatus) {
        return tFlowExecuteStatusMapper.insert(flowExecuteStatus);
    }

    @Override
    public int delFlowExecuteStatus(int id) {
        return 0;
    }

    @Override
    public int updateFlowExecuteStatus(TFlowExecuteStatus flowExecuteStatus) {
        return  tFlowExecuteStatusMapper.updateByPrimaryKeySelective(flowExecuteStatus);
    }

    @Override
    public int updateFlowPoint(TFlowExecutePoint flowExecutePoint) {
        return tFlowExecuteStatusMapper.updateFlowPoint(flowExecutePoint);
    }

    @Override
    public int queryExecuteStatus(TFlowExecutePoint executePoint) {
        return tFlowExecuteStatusMapper.queryExecuteStatus(executePoint);
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
