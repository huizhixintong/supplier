package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.dao.TFlowExecuteStatusLogMapper;
import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecuteStatusLog;
import com.huizhi.supplier.service.flow.FlowExecuteStatusLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("flowExecuteStatusLog")
public class FlowExecuteStatusLogImpl implements FlowExecuteStatusLog {

    @Resource
    private TFlowExecuteStatusLogMapper tFlowExecuteStatusLogMapper;

    @Override
    public int addExecuteStatusLog(TFlowExecuteStatusLog statusLog) {
        return tFlowExecuteStatusLogMapper.insert(statusLog);
    }

    @Override
    public int delExecuteStatusLog(long id) {
        return 0;
    }



    @Override
    public int updateStatusLog(TFlowExecuteStatusLog statusLog) {
        return tFlowExecuteStatusLogMapper.updateByPrimaryKeySelective(statusLog);
    }

    @Override
    public TFlowExecuteStatusLog queryExecuteStatusLog(TFlowExecutePoint executePoint) {
//        return tFlowExecuteStatusLogMapper.queryStatusLog(executePoint);
        return null;
    }
}
