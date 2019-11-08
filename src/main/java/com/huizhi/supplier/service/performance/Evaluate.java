package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerEvalInfo;
import com.huizhi.supplier.db.model.TPerEvalResult;

import java.util.List;

public interface Evaluate {
    void saveEval(List<TPerEvalInfo> list);

//    int saveTotalScope(List<TPerEvalInfo> list);
    List<TPerEvalInfo> queryEvalInfo(String contCode);
    TPerEvalResult queryEvalResult(String contCode);
}
