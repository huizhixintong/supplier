package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecuteStatus;

public interface FlowExecuteStatus {
    int addFlowExecuteStatus(TFlowExecuteStatus flowExecuteStatus);
    int delFlowExecuteStatus(int id);
    int updateFlowExecuteStatus(TFlowExecuteStatus flowExecuteStatus, int id);
    int updateFlowPoint(TFlowExecutePoint flowExecutePoint);
    int queryExecuteStatus(TFlowExecutePoint executePoint);

    int updateFlowPoint(String executeCode, String flowCode);
}
