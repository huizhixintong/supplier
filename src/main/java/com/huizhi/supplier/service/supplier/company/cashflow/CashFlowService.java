package com.huizhi.supplier.service.supplier.company.cashflow;

import com.huizhi.supplier.db.model.TCpyCashFlow;
import com.huizhi.supplier.db.model.TCpyProfitLoss;

import java.util.List;

/**
 * @Title: CashFlowService  现金流量表
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/24 0024 15:52
 */
public interface CashFlowService<D,T> {

    List<TCpyCashFlow> findByCompanyId(String companyId);


    TCpyCashFlow findByCompanyIdAndYear(String companyId, String year);

    TCpyCashFlow getById(String id);



    int save(TCpyCashFlow cashFlow);

    int update(TCpyCashFlow cashFlow);


}
