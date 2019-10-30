package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecuteStatusLog;
import com.huizhi.supplier.service.flow.FlowExecuteStatusLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("flowExecuteStatusLog")
public class FlowExecuteStatusLogImpl implements FlowExecuteStatusLog {
    @Override
    public int addExecuteStatusLog(TFlowExecuteStatusLog statusLog) {
        return 0;
    }

    @Override
    public int delExecuteStatusLog(long id) {
        return 0;
    }

    @Override
    public int updateExecuteStatusLog(TFlowExecuteStatusLog statusLog, long id) {
        return 0;
    }

    @Override
    public int updateStatusLog(TFlowExecuteStatusLog statusLog) {
        return 0;
    }

    @Override
    public TFlowExecuteStatusLog queryExecuteStatusLog(TFlowExecutePoint executePoint) {
        return null;
    }
}
