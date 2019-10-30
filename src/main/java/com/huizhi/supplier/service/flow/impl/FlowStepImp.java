package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.dao.TFlowStepDefineMapper;
import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowStepDefine;
import com.huizhi.supplier.service.flow.FlowStep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Slf4j
@Service("flowStep")
public class FlowStepImp implements FlowStep {

    @Resource
    private TFlowStepDefineMapper flowStepDefineMapper;

    @Override
    public int addStep(TFlowStepDefine stepDefine) {
        return 0;
    }

    @Override
    public int updateStep(TFlowStepDefine stepDefine, int id) {
        return 0;
    }

    @Override
    public int delStep(int id) {
        return 0;
    }

    @Override
    public TFlowStepDefine queryStepInfo(String flowCode, int pointId) {
        return null;
    }

    @Override
    public TFlowStepDefine queryNextStepInfo(TFlowExecutePoint executePoint){
        if (StringUtils.isEmpty(executePoint)){
            return null;
        }

        return flowStepDefineMapper.queryNextStepInfo(executePoint.getFlowCode(),executePoint.getPointId());
    }
}
