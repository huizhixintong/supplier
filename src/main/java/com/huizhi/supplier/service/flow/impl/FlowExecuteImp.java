package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.dao.TFlowExecuteMapper;
import com.huizhi.supplier.db.model.TFlowExecute;
import com.huizhi.supplier.service.flow.FlowExecute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service("flowExecute")
public class FlowExecuteImp implements FlowExecute {

    @Resource
    TFlowExecuteMapper tFlowExecuteMapper;

    @Override
    public int addFlowExecute(TFlowExecute flowExecute) {
        if (flowExecute == null){
            return ErrCode.ERR_FLOW_PARAMETER_NULL;
        }
        return tFlowExecuteMapper.insert(flowExecute);
    }

    @Override
    public int updateFlowExecute(TFlowExecute flowExecute) {
        return tFlowExecuteMapper.updateByPrimaryKeySelective(flowExecute);
    }

    @Override
    public int delFlowExecute(int id) {
        return 0;
    }

    @Override
    public List<TFlowExecute> queryExecuteList() {
        return tFlowExecuteMapper.queryExecute();
    }
}
