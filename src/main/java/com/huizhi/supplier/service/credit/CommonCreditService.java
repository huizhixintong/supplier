package com.huizhi.supplier.service.credit;

import com.huizhi.supplier.db.model.CreditValueMap;
import com.huizhi.supplier.db.model.TCreditValueMap;

import java.util.List;

/**
 * @Title: CommonCreditService
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/25 0025 14:51
 */
public interface CommonCreditService {

    //根据行业ID  查询 映射类

    List<TCreditValueMap> findByIndustry(String industry);


}
