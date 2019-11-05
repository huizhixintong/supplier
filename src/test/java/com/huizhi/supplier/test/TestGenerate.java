package com.huizhi.supplier.test;

import com.alibaba.fastjson.JSON;
import com.huizhi.supplier.db.model.TFlowExecutePath;
import com.huizhi.supplier.model.FlowPrivilege;
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


    @Test
    public void TestJson(){
        TFlowExecutePath stepDefine = new TFlowExecutePath();
        stepDefine.setFlowCode("1111");
        stepDefine.setId(1111);
        stepDefine.setPointId(222);
        stepDefine.setExecuteCode("ssss");
        System.out.println("system" +JSON.toJSONString(stepDefine));
    }

    @Test
    public void TestPrivilege(){
        FlowPrivilege flowPrivilege = new FlowPrivilege();
        flowPrivilege.setCommit('1');
        flowPrivilege.setPass('1');
        flowPrivilege.setRefuse('1');
        flowPrivilege.setReject('1');
        flowPrivilege.setPrivilege("1001");
//        flowPrivilege.new ParsePrivilege().combinePrivilege();
        flowPrivilege.new ParsePrivilege().parsePrivilege();
        System.out.println(flowPrivilege.getCommit());
        System.out.println(flowPrivilege.getPass());
        System.out.println(flowPrivilege.getRefuse());
        System.out.println(flowPrivilege.getReject());

    }
}
