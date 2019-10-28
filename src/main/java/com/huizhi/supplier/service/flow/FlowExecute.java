package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecute;

public interface FlowExecute {

    int addFlowExecute(TFlowExecute flowExecute);
    int updateFlowExecute(TFlowExecute flowExecute, int id);
    int delFlowExecute(int id);
}
