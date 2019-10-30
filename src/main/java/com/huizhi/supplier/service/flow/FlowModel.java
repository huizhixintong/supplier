package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowModel;

public interface FlowModel {

    int addModel(TFlowModel model);
    int updateModel(TFlowModel model, int id);
    int deleteModel(int id);

}
