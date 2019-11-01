package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.dao.TFlowPointOperatePersonnelMapper;
import com.huizhi.supplier.db.model.TFlowPointOperatePersonnel;
import com.huizhi.supplier.service.flow.FlowPoint;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("flowPoint")
public class FlowPointImp implements FlowPoint {

    @Resource
    private TFlowPointOperatePersonnelMapper tFlowPointOperatePersonnelMapper;

    @Override
    public int addFlowPoint(TFlowPointOperatePersonnel operatePersonnel) {
        return tFlowPointOperatePersonnelMapper.insert(operatePersonnel);
    }

    @Override
    public int delFlowPoint(int id) {
        return 0;
    }

    @Override
    public int updateFlowPoint(TFlowPointOperatePersonnel operatePersonnel) {
        return tFlowPointOperatePersonnelMapper.updateByPrimaryKeySelective(operatePersonnel);
    }
}
