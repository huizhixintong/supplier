package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecuteStatus;
import com.huizhi.supplier.service.flow.FlowExecuteStatus;
import org.springframework.stereotype.Service;

@Service("flowExecuteStatus")
public class FlowExecuteStatusImp implements FlowExecuteStatus {
    @Override
    public int addFlowExecuteStatus(TFlowExecuteStatus flowExecuteStatus) {
        return 0;
    }

    @Override
    public int delFlowExecuteStatus(int id) {
        return 0;
    }

    @Override
    public int updateFlowExecuteStatus(TFlowExecuteStatus flowExecuteStatus, int id) {
        return 0;
    }

    @Override
    public int updateFlowPoint(TFlowExecutePoint flowExecutePoint) {
        return 0;
    }

    @Override
    public int queryExecuteStatus(TFlowExecutePoint executePoint) {
        return 0;
    }

    @Override
    public int updateFlowPoint(String executeCode, String flowCode) {
        return 0;
    }


}
