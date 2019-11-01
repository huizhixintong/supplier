package com.huizhi.supplier.service.flow;

public interface FlowGenerate {

    String createFlowCode();
    String createFlowExecuteCode(String flowCode);
    int createPointId();
}
