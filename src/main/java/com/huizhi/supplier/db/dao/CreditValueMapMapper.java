package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.CreditValueMap;

import java.util.List;

/**
 * @Title: CreditValueMapMapper
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/25 0025 16:34
 */
public interface CreditValueMapMapper {


    List<CreditValueMap> selectByIndustry(String industry);
}
