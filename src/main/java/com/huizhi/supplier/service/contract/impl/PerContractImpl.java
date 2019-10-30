package com.huizhi.supplier.service.contract.impl;

import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.dao.TPerContractMapper;
import com.huizhi.supplier.db.model.TPerContract;
import com.huizhi.supplier.service.contract.PerContract;
import com.huizhi.supplier.service.supplier.Supplier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;

@Service("perContract")
public class PerContractImpl implements PerContract {

    @Resource
    private TPerContractMapper perContractMapper;

    @Resource
    private Supplier supplier;

    public int addContract(TPerContract contract) {
        int ret;

        if (StringUtils.isEmpty(contract)){
            return ErrCode.ERR_PARAMETER_NULL;
        }

        if ((ret = validBaseInfo(contract)) != ErrCode.CONT_SUCCESS){
            return ret;
        }


        /*查询供应商信息是否存在*/
        if ((ret = supplier.querySupplierByName(contract.getSupplierName())) != 1){
            return ret;
        }
        /*查询当前合同信息是否在存*/
        if (queryContractInfoByContId(contract.getCode()) != null){
            return ErrCode.ERR_CONT_EXITS;
        }

        return perContractMapper.insertSelective(contract);
    }

    public int updateContract(TPerContract contract) {
        if (!StringUtils.isEmpty(contract)){
            if (!StringUtils.isEmpty(contract.getId())){
                return ErrCode.ERR_ID_NULL;
            }else{
                return perContractMapper.updateByPrimaryKeySelective(contract);
            }
        }
        return ErrCode.ERR_PARAMETER_NULL;
    }

    public int delContract(TPerContract contract) {
        return 0;
    }

    public Object queryContractInfoByContId(String contID) {
        return null;
    }

    public Object queryContractInfoByContName(String name) {
        return null;
    }

    public Object queryContractInfoByDate(Date queryDate) {
        return null;
    }

    public Object queryContrnactInfo(String contId, String name, String queryDate) {
        return null;
    }


    private int validBaseInfo(TPerContract perContract){
        return ErrCode.CONT_SUCCESS;
    }
}
