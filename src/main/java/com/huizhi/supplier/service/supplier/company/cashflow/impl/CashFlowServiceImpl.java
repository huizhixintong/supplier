package com.huizhi.supplier.service.supplier.company.cashflow.impl;

import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.dao.TCpyCashFlowMapper;
import com.huizhi.supplier.db.model.TCpyCashFlow;
import com.huizhi.supplier.db.model.TCpyProfitLoss;
import com.huizhi.supplier.service.supplier.Supplier;
import com.huizhi.supplier.service.supplier.company.cashflow.CashFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: CashFlowServiceImpl
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/24 0024 15:56
 */
public class CashFlowServiceImpl implements CashFlowService {


    @Resource
    private TCpyCashFlowMapper tCpyCashFlowMapper;

    @Resource
    private Supplier supplier;

    @Override
    public List<TCpyCashFlow> findByCompanyId(String companyId) {
        if (StringUtils.isEmpty(companyId)){
            return null;
        }

        return tCpyCashFlowMapper.selectByCompanyId(companyId);

    }

    @Override
    public TCpyCashFlow findByCompanyIdAndYear(String companyId, String year) {
        if (StringUtils.isEmpty(companyId) || StringUtils.isEmpty(year)){

            return null;
        }


        return tCpyCashFlowMapper.selectByCompanyIdAndYear(companyId,year);
    }

    @Override
    public TCpyCashFlow getById(String id) {
        return null;
    }

    @Override
    public int save(TCpyCashFlow cashFlow) {
        int ret;

        if (StringUtils.isEmpty(cashFlow)){
            return ErrCode.ERR_PARAMETER_NULL;
        }

        if ((ret = validBaseInfo(cashFlow)) != ErrCode.ERR_SUCCESS){
            return ret;
        }

        /*查询供应商信息是否存在*/
        if ((ret = supplier.querySupplierById(cashFlow.getCompanyId())) != 1){
            return ret;
        }
        /*查询当前利润表信息是否在存*/
        if (getById(cashFlow.getId()) != null){
            return update(cashFlow);
        }

        return tCpyCashFlowMapper.insertSelective(cashFlow);
    }

    @Override
    public int update(TCpyCashFlow cashFlow) {

        int ret;

        if((ret = validBaseInfo(cashFlow)) != ErrCode.ERR_SUCCESS){
            return ret;
        }

        return  tCpyCashFlowMapper.updateByCompanyIdAndYear(cashFlow);
    }


    private int validBaseInfo(TCpyCashFlow cashFlow){

        if(cashFlow.getCompanyId() == null){
            return ErrCode.ERR_FOREIGN_KEY_NULL;
        }


        return ErrCode.ERR_SUCCESS;
    }
}
