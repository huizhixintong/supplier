package com.huizhi.supplier.service.credit.impl;

import com.huizhi.supplier.db.dao.CreditValueMapMapper;
import com.huizhi.supplier.db.dao.TCreditValueMapMapper;
import com.huizhi.supplier.db.model.CreditValueMap;
import com.huizhi.supplier.db.model.TCreditValueMap;
import com.huizhi.supplier.service.credit.CommonCreditService;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: CommonCreditServiceImpl
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/25 0025 16:33
 */
@Service
public class CommonCreditServiceImpl implements CommonCreditService {

    @Autowired
    private TCreditValueMapMapper creditValueMapMapper;

    @Override
    public List<TCreditValueMap> findByIndustry(String industry) {

        return creditValueMapMapper.selectByIndustry(industry);
    }
}
