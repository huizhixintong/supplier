package com.huizhi.supplier.service.performance.imp;

import com.huizhi.supplier.db.dao.TPerSubjectTitleInfoMapper;
import com.huizhi.supplier.db.model.TPerSubjectTitleInfo;
import com.huizhi.supplier.service.performance.PerSubjectTitle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service("perSubjectTitle")
public class PerSubjectTitleImp implements PerSubjectTitle {

    @Resource
    private TPerSubjectTitleInfoMapper tPerSubjectTitleInfoMapper;

    @Override
    public int addSubjectTitle(TPerSubjectTitleInfo info) {
        return tPerSubjectTitleInfoMapper.insert(info);
    }

    @Override
    public int editSubjectTitle(TPerSubjectTitleInfo info) {
        return tPerSubjectTitleInfoMapper.updateByPrimaryKeySelective(info);
    }

    @Override
    public List<TPerSubjectTitleInfo> querySubjectTitle(String code) {
        return tPerSubjectTitleInfoMapper.querySubjectTitle(code);
    }

    @Override
    public List<TPerSubjectTitleInfo> queryAllSubjectTitle() {
        return tPerSubjectTitleInfoMapper.queryAllSubjectTitle();
    }
}
