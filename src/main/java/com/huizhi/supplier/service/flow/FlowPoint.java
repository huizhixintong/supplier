package com.huizhi.supplier.service.flow;

import com.huizhi.supplier.db.model.TFlowPointOperatePersonnel;

public interface FlowPoint {
    int addFlowPoint(TFlowPointOperatePersonnel operatePersonnel);
    int delFlowPoint(int id);
    int updateFlowPoint(TFlowPointOperatePersonnel operatePersonnel);
}
