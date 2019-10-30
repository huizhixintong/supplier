package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecutePoint;

public interface FlowStart {
    int stepFlow(TFlowExecutePoint executePoint, int act);

    int startFlow(TFlowExecutePoint executePoint);
}
