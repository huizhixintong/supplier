package com.huizhi.supplier.service.performance.imp;

import com.huizhi.supplier.db.dao.TPerEvalInfoMapper;
import com.huizhi.supplier.db.model.TPerEvalInfo;
import com.huizhi.supplier.service.performance.PerEval;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("perEval")
@Slf4j
public class PerEvalImp implements PerEval {

    @Resource
    private TPerEvalInfoMapper tPerEvalInfoMapper;

    @Override
    public int addEval(TPerEvalInfo info) {
        return tPerEvalInfoMapper.insert(info);
    }

    @Override
    public int editEval(TPerEvalInfo info) {
        return tPerEvalInfoMapper.updateByPrimaryKeySelective(info);
    }

    @Override
    public List<TPerEvalInfo> queryEval(String contCode) {
        return tPerEvalInfoMapper.queryEval(contCode);
    }
}
