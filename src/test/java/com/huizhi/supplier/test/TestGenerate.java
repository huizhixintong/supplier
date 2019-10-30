package com.huizhi.supplier.test;

import com.huizhi.supplier.service.flow.FlowGenerate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestGenerate {

    @Resource
    private FlowGenerate flowGenerate;

    @Test
    public void TestGenerate(){
        System.out.println(flowGenerate.createFlowCode());
    }
}
