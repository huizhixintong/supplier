package com.huizhi.supplier.service.supplier.company.assetsliabilities;

import com.huizhi.supplier.db.model.TCpyAssetsLiabilities;
import com.huizhi.supplier.db.model.TCpyCashFlow;

import java.util.List;

/**
 * @Title: AssetsLiabilitiesService
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/24 0024 15:58
 */
public interface AssetsLiabilitiesService {

    List<TCpyAssetsLiabilities> findByCompanyId(String companyId);

    TCpyAssetsLiabilities findByCompanyIdAndYear(String companyId, String year);

    TCpyAssetsLiabilities getById(String id);

    int save(TCpyAssetsLiabilities assetsLiabilities);

    int update(TCpyAssetsLiabilities assetsLiabilities);


}
