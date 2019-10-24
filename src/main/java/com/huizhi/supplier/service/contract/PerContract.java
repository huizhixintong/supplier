package com.huizhi.supplier.service.contract;

import com.huizhi.supplier.db.model.TPerContract;

import java.util.Date;

public interface PerContract {

    int addContract(TPerContract contract);
    int updateContract(TPerContract contract);
    int delContract(TPerContract contract);
    Object queryContractInfoByContId(String contID);
    Object queryContractInfoByContName(String name);
    Object queryContractInfoByDate(Date queryDate);
    Object queryContrnactInfo(String contId, String name, String queryDate);
}
