package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.service.flow.FlowExecutePoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("flowExecutePoint")
public class FlowExecutePointImp implements FlowExecutePoint {
    @Override
    public int addFlowExecutePoint(TFlowExecutePoint flowExecutePoint) {
        return 0;
    }

    @Override
    public int delFlowEXecutePoint(int id) {
        return 0;
    }

    @Override
    public int delFlowExecutePoint(int pointId) {
        return 0;
    }

    @Override
    public int updateFlowExecutePoint(TFlowExecutePoint flowExecutePoint, int id) {
        return 0;
    }

    @Override
    public boolean queryIsFullFlow(TFlowExecutePoint executePoint) {
        return true;
    }

    @Override
    public TFlowExecutePoint queryExecutePointInfo(String executeCode, String flowCode, int point) {
        return null;
    }
}
