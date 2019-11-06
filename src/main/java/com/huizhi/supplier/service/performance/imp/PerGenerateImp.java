package com.huizhi.supplier.service.performance.imp;

import com.huizhi.supplier.service.performance.PerGenerate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service("perGenerate")
@Slf4j
public class PerGenerateImp implements PerGenerate {
    @Override
    public String createSubjectCode() {
        return getTimestamp(6) + getRandom(9999);
    }

    @Override
    public String createTitleCode() {
        return getTimestamp(6) + getRandom(99999);
    }



    private String getRandom(int max){
        return String.format("%04d", ThreadLocalRandom.current().nextInt(max));
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
