package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowStepDefine;

public interface FlowStep {
    int addStep(TFlowStepDefine stepDefine);
    int updateStep(TFlowStepDefine stepDefine, int id);
    int delStep(int id);

}

