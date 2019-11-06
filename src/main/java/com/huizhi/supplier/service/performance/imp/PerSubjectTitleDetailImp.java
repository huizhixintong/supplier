package com.huizhi.supplier.service.performance.imp;

import com.huizhi.supplier.db.dao.TPerSubjectDetailInfoMapper;
import com.huizhi.supplier.db.model.TPerSubjectDetailInfo;
import com.huizhi.supplier.service.performance.PerSubjectTitleDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service("perSubjectTitleDetail")
public class PerSubjectTitleDetailImp implements PerSubjectTitleDetail {

    @Resource
    private TPerSubjectDetailInfoMapper tPerSubjectDetailInfoMapper;

    @Override
    public int addTitleDetail(TPerSubjectDetailInfo info) {
        return tPerSubjectDetailInfoMapper.insert(info);
    }

    @Override
    public int editTitleDetail(TPerSubjectDetailInfo info) {
        return tPerSubjectDetailInfoMapper.updateByPrimaryKeySelective(info);
    }

    @Override
    public List<TPerSubjectDetailInfo> queryTitleDetail(String titleCode) {
        return tPerSubjectDetailInfoMapper.queryTitleDetail(titleCode);
    }
}
