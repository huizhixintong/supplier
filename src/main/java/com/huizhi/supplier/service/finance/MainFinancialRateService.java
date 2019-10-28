package com.huizhi.supplier.service.finance;

import com.huizhi.supplier.db.model.TCpyMainFinancialRate;

import java.util.List;

/**
 * @Title: MainFinancialRateService
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/25 0025 13:42
 */
public interface MainFinancialRateService {

    List<TCpyMainFinancialRate> findByCompanyId(String companyId);

    TCpyMainFinancialRate findByCompanyIdAndYear(String companyId, String year);

    TCpyMainFinancialRate getById(String id);

    int save(TCpyMainFinancialRate mainFinancialRate);

    int update(TCpyMainFinancialRate mainFinancialRate);

}
