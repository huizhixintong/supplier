package com.huizhi.supplier.service.common;

import com.huizhi.supplier.db.dao.CommonMapper;
import com.huizhi.supplier.db.model.TCpyAssetsLiabilities;
import com.huizhi.supplier.db.model.TCpyCashFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Title: CommonService
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/30 0030 13:46
 */

public abstract class CommonService<D extends CommonMapper<T>,T> {

    @Autowired
    private D d;

    public T findById(String id){

        return d.selectByPrimaryKey(id);
    }

    public List<T> findByCompanyId(String companyId) {

        if(StringUtils.isEmpty(companyId)){
            return null;
        }


        return d.selectByCompanyId(companyId);
    }


    public T findByCompanyIdAndYear(String companyId, String year) {
        return d.selectByCompanyIdAndYear(companyId,year);
    }


    public T getById(String id) {

        return d.selectByPrimaryKey(id);
    }


    public int save(T t) {

        return d.insert(t);
    }


    public int update(T t) {
        return 0;
    }
}
