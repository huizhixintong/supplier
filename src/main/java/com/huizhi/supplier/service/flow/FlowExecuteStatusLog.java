package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecuteStatusLog;

public interface FlowExecuteStatusLog {

    int addExecuteStatusLog(TFlowExecuteStatusLog statusLog);
    int delExecuteStatusLog(long id);
    int updateExecuteStatusLog(TFlowExecuteStatusLog statusLog, long id);
    int updateStatusLog(TFlowExecuteStatusLog statusLog);
    TFlowExecuteStatusLog queryExecuteStatusLog(TFlowExecutePoint executePoint);
}
