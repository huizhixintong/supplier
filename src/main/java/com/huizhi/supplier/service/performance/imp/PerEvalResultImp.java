package com.huizhi.supplier.service.performance.imp;

import com.huizhi.supplier.db.dao.TPerEvalResultMapper;
import com.huizhi.supplier.db.model.TPerEvalResult;
import com.huizhi.supplier.service.performance.PerEvalResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("perEvalResult")
public class PerEvalResultImp implements PerEvalResult {

    @Resource
    private TPerEvalResultMapper tPerEvalResultMapper;
    @Override
    public int addEvalResult(TPerEvalResult result) {
        return tPerEvalResultMapper.insert(result);
    }

    @Override
    public int editEvalResult(TPerEvalResult result) {
        return tPerEvalResultMapper.updateByPrimaryKey(result);
    }

    @Override
    public TPerEvalResult queryEvalResult(String contCode) {
        return tPerEvalResultMapper.queryEvalResult(contCode);
    }
}
