package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerEvalInfo;

public interface PerEval {

    int addEval(TPerEvalInfo info);
    int editEval(TPerEvalInfo info);
    int queryEval(String contCode);
}
