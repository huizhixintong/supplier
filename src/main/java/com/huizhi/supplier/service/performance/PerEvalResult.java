package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerEvalResult;

public interface PerEvalResult {
    int addEvalResult(TPerEvalResult result);
    int editEvalResult(TPerEvalResult result);
    TPerEvalResult queryEvalResult(String contCode);
}
