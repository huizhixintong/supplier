package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.model.TFlowModel;
import com.huizhi.supplier.service.flow.FlowModel;
import org.springframework.stereotype.Service;

@Service("flowModel")
public class FlowModelImp implements FlowModel {
    @Override
    public int addModel(TFlowModel model) {
        return 0;
    }

    @Override
    public int updateModel(TFlowModel model, int id) {
        return 0;
    }

    @Override
    public int deleteModel(int id) {
        return 0;
    }
}
