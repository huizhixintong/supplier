package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecutePath;

public interface FlowExecutePath {
    int addFlowExecuteStatus(TFlowExecutePath flowExecuteStatus);
    int delFlowExecuteStatus(int id);
    int updateFlowExecuteStatus(TFlowExecutePath flowExecuteStatus);
    int updateFlowPoint(TFlowExecutePoint flowExecutePoint);
    int queryExecuteStatus(TFlowExecutePoint executePoint, String relationId);

    int updateFlowPoint(String executeCode, String flowCode, int pointId);
}
