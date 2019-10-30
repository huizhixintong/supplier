package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecutePoint;

public interface FlowExecutePoint {

    int addFlowExecutePoint(TFlowExecutePoint flowExecutePoint);
    int delFlowEXecutePoint(int id);
    int delFlowExecutePoint(int pointId);
    int updateFlowExecutePoint(TFlowExecutePoint flowExecutePoint,int id);
    boolean queryIsFullFlow(TFlowExecutePoint executePoint);
    TFlowExecutePoint queryExecutePointInfo(String executeCode, String flowCode, int point);
}
