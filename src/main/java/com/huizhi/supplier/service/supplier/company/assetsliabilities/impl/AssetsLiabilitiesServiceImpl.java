package com.huizhi.supplier.service.supplier.company.assetsliabilities.impl;

import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.dao.TCpyAssetsLiabilitiesMapper;
import com.huizhi.supplier.db.dao.TCpyCashFlowMapper;
import com.huizhi.supplier.db.model.TCpyAssetsLiabilities;
import com.huizhi.supplier.db.model.TCpyCashFlow;
import com.huizhi.supplier.service.supplier.Supplier;
import com.huizhi.supplier.service.supplier.company.assetsliabilities.AssetsLiabilitiesService;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: AssetsLiabilitiesServiceImpl
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/24 0024 15:59
 */
public class AssetsLiabilitiesServiceImpl implements AssetsLiabilitiesService {

    @Resource
    private TCpyAssetsLiabilitiesMapper tCpyAssetsLiabilitiesMapper;

    @Resource
    private Supplier supplier;


    @Override
    public List<TCpyAssetsLiabilities> findByCompanyId(String companyId) {

        if (StringUtils.isEmpty(companyId)){
            return null;
        }

        return tCpyAssetsLiabilitiesMapper.selectByCompanyId(companyId);

    }

    @Override
    public TCpyAssetsLiabilities findByCompanyIdAndYear(String companyId, String year) {
        if (StringUtils.isEmpty(companyId) || StringUtils.isEmpty(year)){

            return null;
        }


        return tCpyAssetsLiabilitiesMapper.selectByCompanyIdAndYear(companyId,year);
    }

    @Override
    public TCpyAssetsLiabilities getById(String id) {
        return null;
    }

    @Override
    public int save(TCpyAssetsLiabilities assetsLiabilities) {
        int ret;

        if (StringUtils.isEmpty(assetsLiabilities)){
            return ErrCode.ERR_PARAMETER_NULL;
        }

        if ((ret = validBaseInfo(assetsLiabilities)) != ErrCode.ERR_SUCCESS){
            return ret;
        }
        /*查询供应商信息是否存在*/
        if ((ret = supplier.querySupplierById(assetsLiabilities.getCompanyId())) != 1){
            return ret;
        }
        /*查询当前信息是否在存*/
        if (getById(assetsLiabilities.getId()) != null){
            return update(assetsLiabilities);
        }

        return tCpyAssetsLiabilitiesMapper.insertSelective(assetsLiabilities);
    }

    @Override
    public int update(TCpyAssetsLiabilities assetsLiabilities) {
        int ret;

        if((ret = validBaseInfo(assetsLiabilities)) != ErrCode.ERR_SUCCESS){
            return ret;
        }

        return  tCpyAssetsLiabilitiesMapper.updateByCompanyIdAndYear(assetsLiabilities);

    }

    private int validBaseInfo(TCpyAssetsLiabilities assetsLiabilities){

        if(assetsLiabilities.getCompanyId() == null){
            return ErrCode.ERR_FOREIGN_KEY_NULL;
        }


        return ErrCode.ERR_SUCCESS;
    }
}
