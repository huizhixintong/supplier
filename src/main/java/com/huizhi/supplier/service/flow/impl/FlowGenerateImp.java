package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.db.dao.TNextvalMapper;
import com.huizhi.supplier.db.model.TNextval;
import com.huizhi.supplier.service.flow.FlowGenerate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.ThreadLocalRandom;

@Service("flowGenerate")
public class FlowGenerateImp implements FlowGenerate {

    @Resource
    private TNextvalMapper tNextvalMapper;

    @Override
    public String createFlowCode() {

        String tmp =  getTimestamp(6) + getRandom();
        return tmp;
    }

    @Override
    public String createFlowExecuteCode(String flowCode) {
        return flowCode+getTimestamp(0) + getRandom();
    }

    @Override
    public int createPointId() {
        TNextval record = new TNextval();

        tNextvalMapper.insertSelective(record);
        return record.getId();
    }


    private String getRandom(){
        return String.format("%04d",ThreadLocalRandom.current().nextInt(9999));
    }

    private String getTimestamp(int length){
        String timeStamp = String.valueOf(System.currentTimeMillis());
//        System.out.println("time:" + timeStamp);
        if (length <=0){
            length = timeStamp.length();
        }
        return timeStamp.substring(timeStamp.length()-length,timeStamp.length());
    }
}
