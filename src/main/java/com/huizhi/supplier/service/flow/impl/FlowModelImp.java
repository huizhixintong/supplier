package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.dao.TFlowModelMapper;
import com.huizhi.supplier.db.model.TFlowModel;
import com.huizhi.supplier.service.flow.FlowModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service("flowModel")
public class FlowModelImp implements FlowModel {

    @Resource
    private TFlowModelMapper tFlowModelMapper;

    @Override
    public int addModel(TFlowModel model) {
        if (StringUtils.isEmpty(model)){
            return ErrCode.ERR_PARAMETER_NULL;
        }

        if (StringUtils.isEmpty(model.getFlowCode()) || StringUtils.isEmpty(model.getFlowName())){
            return ErrCode.ERR_FLOW_PARAMETER_NULL;
        }

        return tFlowModelMapper.insert(model);

    }

    @Override
    public int updateModel(TFlowModel model) {

        return tFlowModelMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int deleteModel(int id) {
        return 0;
    }

    @Override
    public TFlowModel queryFlowCode(String flowCode) {
        return tFlowModelMapper.queryRecordByFlowCode(flowCode);
    }
}
