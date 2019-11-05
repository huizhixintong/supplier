package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecutePath;
import com.huizhi.supplier.db.model.TFlowExecutePoint;

public interface FlowStart {
    int stepFlow(TFlowExecutePath executePath, int act);

    int startFlow(TFlowExecutePoint executePoint, String relationId);
}
