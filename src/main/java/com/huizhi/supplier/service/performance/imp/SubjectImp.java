package com.huizhi.supplier.service.performance.imp;

import com.huizhi.supplier.db.dao.TPerSubjectDetailInfoMapper;
import com.huizhi.supplier.db.dao.TPerSubjectInfoMapper;
import com.huizhi.supplier.db.dao.TPerSubjectTitleInfoMapper;
import com.huizhi.supplier.db.model.TPerSubjectDetailInfo;
import com.huizhi.supplier.db.model.TPerSubjectInfo;
import com.huizhi.supplier.db.model.TPerSubjectTitleInfo;
import com.huizhi.supplier.service.performance.PerGenerate;
import com.huizhi.supplier.service.performance.Subject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service("subject")
public class SubjectImp implements Subject {

    @Resource
    private PerGenerate perGenerate;

    @Resource
    private TPerSubjectInfoMapper tPerSubjectInfoMapper;

    @Resource
    private TPerSubjectTitleInfoMapper tPerSubjectTitleInfoMapper;

    @Resource
    private TPerSubjectDetailInfoMapper tPerSubjectDetailInfoMapper;

    @Override
    public int addSubject(TPerSubjectInfo info) {
        info.setPerDynamicEvalCode(perGenerate.createSubjectCode());
        info.setCreateDate(LocalDateTime.now());
        return tPerSubjectInfoMapper.insert(info);
    }

    @Override
    public int editSubject(TPerSubjectInfo info) {
        return tPerSubjectInfoMapper.updateByPrimaryKeySelective(info);
    }

    @Override
    public List<TPerSubjectInfo> querySubject(String code) {
        return tPerSubjectInfoMapper.querySubjectInfo(code);
    }

    @Override
    public int addTitle(TPerSubjectTitleInfo info) {
        info.setCreateDate(LocalDateTime.now());
        info.setTitleCode(perGenerate.createTitleCode());

        return tPerSubjectTitleInfoMapper.insert(info);
    }

    @Override
    public int editTitle(TPerSubjectTitleInfo info) {
        return tPerSubjectTitleInfoMapper.updateByPrimaryKeySelective(info);
    }

    @Override
    public List<TPerSubjectTitleInfo> queryTitle(String code) {
        return tPerSubjectTitleInfoMapper.querySubjectTitle(code);
    }

    @Override
    public int addContent(TPerSubjectDetailInfo info) {
        return tPerSubjectDetailInfoMapper.insert(info);
    }

    @Override
    public int editContent(TPerSubjectDetailInfo info) {
        return tPerSubjectDetailInfoMapper.updateByPrimaryKeySelective(info);
    }

    @Override
    public List<TPerSubjectDetailInfo> queryDetail(String titleCode) {
        return tPerSubjectDetailInfoMapper.queryTitleDetail(titleCode);
    }
}
