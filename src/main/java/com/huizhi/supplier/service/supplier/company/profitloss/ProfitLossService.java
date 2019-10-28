package com.huizhi.supplier.service.supplier.company.profitloss;

import com.huizhi.supplier.db.model.TCpyProfitLoss;

import java.util.Date;
import java.util.List;

/**
 * @Title: ProfitLossService  利润表
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/24 0024 11:40
 */
public interface ProfitLossService {


    List<TCpyProfitLoss> findByCompanyId(String companyId);


    TCpyProfitLoss findByCompanyIdAndYear(String companyId, String year);


    TCpyProfitLoss getById(String id);

    int save(TCpyProfitLoss profitLoss);

    int update(TCpyProfitLoss profitLoss);

    int delete(TCpyProfitLoss profitLoss);



}
