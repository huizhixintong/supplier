package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerEvalInfo;

import java.util.List;

public interface PerEval {

    int addEval(TPerEvalInfo info);
    int editEval(TPerEvalInfo info);
    List<TPerEvalInfo> queryEval(String contCode);
}
