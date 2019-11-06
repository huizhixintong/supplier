package com.huizhi.supplier.service.performance.imp;

import com.huizhi.supplier.db.dao.TPerSubjectInfoMapper;
import com.huizhi.supplier.db.model.TPerSubjectInfo;
import com.huizhi.supplier.service.performance.PerSubject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("perSubject")
public class PerSubjectImp implements PerSubject {

    @Resource
    TPerSubjectInfoMapper tPerSubjectInfoMapper;

    @Override
    public int addSubjectInfo(TPerSubjectInfo info) {

        if (querySubjectInfo(info.getCode()) == null){
            return tPerSubjectInfoMapper.insert(info);
        }else{
            return editSubjectInfo(info);
        }
    }

    @Override
    public int editSubjectInfo(TPerSubjectInfo info) {
        return tPerSubjectInfoMapper.updateByPrimaryKeySelective(info);
    }

    @Override
    public TPerSubjectInfo querySubjectInfo(String code) {
        return tPerSubjectInfoMapper.querySubjectInfo(code);
    }

}
