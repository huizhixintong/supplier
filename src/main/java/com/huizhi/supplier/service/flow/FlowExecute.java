package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowExecute;

import java.util.List;

public interface FlowExecute {

    int addFlowExecute(TFlowExecute flowExecute);
    int updateFlowExecute(TFlowExecute flowExecute);
    int delFlowExecute(int id);
    List<TFlowExecute> queryExecuteList();
}
