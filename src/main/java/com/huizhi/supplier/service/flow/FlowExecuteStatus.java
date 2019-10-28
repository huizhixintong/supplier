package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecuteStatus;

public interface FlowExecuteStatus {
    int addFlowExecuteStatus(TFlowExecuteStatus flowExecuteStatus);
    int delFlowExecuteStatus(int id);
    int updateFlowExcuteStatus(TFlowExecuteStatus flowExecuteStatus, int id);

}
