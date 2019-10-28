package com.huizhi.supplier.service.flow.impl;

import com.huizhi.supplier.service.flow.FlowGenerate;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service("flowGenerate")
public class FlowGenerateImp implements FlowGenerate {
    @Override
    public String createFlowCode() {

        String tmp =  getTimestamp() + getRandom();
        System.out.println("tmp:" + tmp);
        return tmp;
    }

    @Override
    public String createFlowExecuteCode(String flowCode) {
        return null;
    }

    private String getRandom(){
        return String.format("%04d",ThreadLocalRandom.current().nextInt(9999));
    }

    private String getTimestamp(){
        String timeStamp = String.valueOf(System.currentTimeMillis());
        System.out.println("time:" + timeStamp);
        return timeStamp.substring(timeStamp.length()-6,timeStamp.length());
    }
}
