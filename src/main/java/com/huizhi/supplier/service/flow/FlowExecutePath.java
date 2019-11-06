package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecutePath;
import com.huizhi.supplier.db.model.TFlowExecutePoint;

public interface FlowExecutePath {
    int addFlowExecutePath(TFlowExecutePath flowExecuteStatus);
    int delFlowExecutePath(int id);
    int updateFlowExecutePath(TFlowExecutePath flowExecuteStatus);
    int updateFlowPoint(TFlowExecutePath flowExecutePath);
    int queryExecutePath(TFlowExecutePoint executePoint, String relationId);
    TFlowExecutePath queryExecutePath(int flowId, String executeCode, String flowCode);
    int updateFlowPoint(String executeCode, String flowCode, int pointId,String relationId);
}
