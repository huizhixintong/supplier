package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.dao.TFlowExecuteMapper;
import com.huizhi.supplier.db.model.TFlowExecute;
import com.huizhi.supplier.service.flow.FlowExecute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("flowExecute")
public class FlowExecuteImp implements FlowExecute {

    @Resource
    TFlowExecuteMapper tFlowExecuteMapper;

    @Override
    public int addFlowExecute(TFlowExecute flowExecute) {

        return 0;
    }

    @Override
    public int updateFlowExecute(TFlowExecute flowExecute, int id) {
        return 0;
    }

    @Override
    public int delFlowExecute(int id) {
        return 0;
    }
}
