package com.huizhi.supplier.service.finance.impl;

import com.huizhi.supplier.db.dao.TCpyMainFinancialRateMapper;
import com.huizhi.supplier.db.model.TCpyMainFinancialRate;
import com.huizhi.supplier.service.finance.MainFinancialRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Title: MainFinancialRateServiceImpl
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/25 0025 13:44
 */
@Service
public class MainFinancialRateServiceImpl implements MainFinancialRateService {

    @Autowired
    private TCpyMainFinancialRateMapper tCpyMainFinancialRateMapper;

    @Override
    public List<TCpyMainFinancialRate> findByCompanyId(String companyId) {
        return null;
    }

    @Override
    public TCpyMainFinancialRate findByCompanyIdAndYear(String companyId, String year) {
        return tCpyMainFinancialRateMapper.selectByCompanyIdAndYear(companyId,year);

    }

    @Override
    public TCpyMainFinancialRate getById(String id) {
        return null;
    }

    @Override
    public int save(TCpyMainFinancialRate mainFinancialRate) {


        return tCpyMainFinancialRateMapper.insert(mainFinancialRate);
    }

    @Override
    public int update(TCpyMainFinancialRate mainFinancialRate) {
        return 0;
    }
}
