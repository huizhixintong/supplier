package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyAssetsLiabilities;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Title: CommonMapper
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/30 0030 13:51
 */
public interface CommonMapper<T> {

    int insert(T t);

    int updateByPrimaryKey(T record);

    T selectByPrimaryKey(String id);

    List<T> selectByCompanyId(@Param("companyId") String companyId);

    T selectByCompanyIdAndYear(@Param("companyId") String companyId, @Param("year") String year);

    int updateByCompanyIdAndYear(T t);
}
