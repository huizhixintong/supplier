package com.huizhi.supplier.service.supplier.company.profitloss.impl;

import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.dao.TCpyProfitLossMapper;
import com.huizhi.supplier.db.model.TCpyProfitLoss;
import com.huizhi.supplier.db.model.TPerContract;
import com.huizhi.supplier.service.supplier.Supplier;
import com.huizhi.supplier.service.supplier.company.profitloss.ProfitLossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Title: ProfitLossServiceImpl
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/24 0024 11:54
 */
@Service("profitLossService")
public class ProfitLossServiceImpl implements ProfitLossService {

    @Resource
    private TCpyProfitLossMapper tCpyProfitLossMapper;

    @Resource
    private Supplier supplier;

    @Override
    public List<TCpyProfitLoss> findByCompanyId(String companyId) {
        if (StringUtils.isEmpty(companyId)){
            return null;
        }

        return tCpyProfitLossMapper.selectByCompanyId(companyId);
    }



    @Override
    public TCpyProfitLoss findByCompanyIdAndYear(String companyId, String year) {

        if (StringUtils.isEmpty(companyId) || StringUtils.isEmpty(year)){

            return null;
        }


        return tCpyProfitLossMapper.selectByCompanyIdAndYear(companyId,year);
    }

    @Override
    public TCpyProfitLoss getById(String id) {
        return null;
    }

    @Override
    public int save(TCpyProfitLoss profitLoss) {
        int ret;

        if (StringUtils.isEmpty(profitLoss)){
            return ErrCode.ERR_PARAMETER_NULL;
        }

        if ((ret = validBaseInfo(profitLoss)) != ErrCode.ERR_SUCCESS){
            return ret;
        }

//        /*查询供应商信息是否存在*/
//        if ((ret = supplier.querySupplierById(profitLoss.getCompanyId())) != 1){
//            return ret;
//        }
//        /*查询当前利润表信息是否在存*/
//        if (getById(profitLoss.getId()) != null){
//            return update(profitLoss);
//        }

        return tCpyProfitLossMapper.insertSelective(profitLoss);
    }

    @Override
    public int update(TCpyProfitLoss profitLoss) {
        int ret;

        if((ret = validBaseInfo(profitLoss)) != ErrCode.ERR_SUCCESS){
            return ret;
        }

        return  tCpyProfitLossMapper.updateByCompanyIdAndYear(profitLoss);
    }


    @Override
    public int delete(TCpyProfitLoss profitLoss) {
        return 0;
    }

    private int validBaseInfo(TCpyProfitLoss profitLoss){

        if(profitLoss.getCompanyId() == null){
            return ErrCode.ERR_FOREIGN_KEY_NULL;
        }


        return ErrCode.ERR_SUCCESS;
    }
}
