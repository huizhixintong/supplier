package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.dao.TFlowExecutePointMapper;
import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.service.flow.FlowExecutePoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("flowExecutePoint")
public class FlowExecutePointImp implements FlowExecutePoint {

    @Resource
    private TFlowExecutePointMapper tFlowExecutePointMapper;

    @Override
    public int addFlowExecutePoint(TFlowExecutePoint flowExecutePoint) {
        return tFlowExecutePointMapper.insert(flowExecutePoint);
    }

    @Override
    public int delFlowEXecutePoint(int id) {
        return 0;
    }

    @Override
    public int delFlowExecutePoint(int pointId) {
        return 0;
    }

    @Override
    public int updateFlowExecutePoint(TFlowExecutePoint flowExecutePoint) {
        return tFlowExecutePointMapper.updateByPrimaryKeySelective(flowExecutePoint);
    }

    @Override
    public boolean queryIncompleteFlow(TFlowExecutePoint executePoint) {
        int count = tFlowExecutePointMapper.queryIncompleteFlow(executePoint);
        if (count == 2) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public TFlowExecutePoint queryExecutePointInfo(String executeCode, String flowCode, int point) {
        return null;
    }
}
