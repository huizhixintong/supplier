package com.huizhi.supplier.test;

import com.alibaba.fastjson.JSON;
import com.huizhi.supplier.db.model.*;
import com.huizhi.supplier.model.FlowPrivilege;
import com.huizhi.supplier.service.flow.*;
import com.huizhi.supplier.service.performance.PerGenerate;
import com.huizhi.supplier.service.performance.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestGenerate {

    @Resource
    private FlowGenerate flowGenerate;

    @Resource
    private FlowModel flowModel;

    @Resource
    private FlowStep flowStep;

    @Resource
    private FlowExecutePoint flowExecutePoint;

    @Resource
    private FlowExecute flowExecute;

    @Resource
    private Subject subject;

    @Resource
    private PerGenerate perGenerate;

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
    public void TestExecute(){
        TFlowExecute execute = new TFlowExecute();
        execute.setFlowCode("1231231");
        execute.setExecuteCode("13123123123");
        execute.setExecuteName("合同流程");
        execute.setId(222323);

        System.out.println("system" +JSON.toJSONString(execute));

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

    @Test
    public void TestFlowModel(){
        TFlowModel model = new TFlowModel();
        model.setCreateUser("test");
        model.setCreateDate(LocalDateTime.now());
        model.setFlowStatus("1");
        model.setFlowName("合同流程");
        model.setFlowCode(flowGenerate.createFlowCode());

        flowModel.addModel(model);
    }

    @Test
    public void TestStartFlowDefine(){
        TFlowStepDefine define = new TFlowStepDefine();
        define.setPointId(-1);
        define.setSuperiorPoint(-1);
        define.setPointType("1");
        define.setOperateContent("1111");
        define.setPointName("合同流程开始");
        define.setManualOperation("0");
        define.setExecuteMovement(("1"));
        define.setEnterCondition("");
        define.setPersonnelType(1);
        define.setFlowCode("7994756732");

        flowStep.addStep(define);
    }

    @Test
    public void TestMidFlowDefine(){
        TFlowStepDefine define = new TFlowStepDefine();
        define.setPointId(flowGenerate.createPointId());
        define.setSuperiorPoint(7);
        define.setPointType("1");
        define.setOperateContent("1111");
        define.setPointName("合同流程审批");
        define.setManualOperation("0");
        define.setExecuteMovement(("1"));
        define.setEnterCondition("");
        define.setPersonnelType(2);
        define.setFlowCode("7994756732");
        define.setPointClass("0");


        flowStep.addStep(define);
    }


    @Test
    public void TestEndFlowDefine(){
        TFlowStepDefine define = new TFlowStepDefine();
        define.setPointId(0);
        define.setSuperiorPoint(7);
        define.setPointType("1");
        define.setOperateContent("1111");
        define.setPointName("合同流程结束");
        define.setManualOperation("0");
        define.setExecuteMovement(("1"));
        define.setEnterCondition("");
        define.setPersonnelType(1);
        define.setFlowCode("7994756732");
        define.setPointClass("2");
        flowStep.addStep(define);

    }

    @Test
    public void TestFlowExecute(){
        TFlowExecute execute = new TFlowExecute();
        execute.setExecuteCode(flowGenerate.createFlowExecuteCode("7994756732"));
        execute.setFlowCode("7994756732");
        execute.setExecuteName("中国电信合同流程");
        execute.setCreateDate(LocalDateTime.now());
        execute.setCreateUser("test");

        flowExecute.addFlowExecute(execute);

    }

    @Test
    public void TestFlowExecutePoint(){
        TFlowExecutePoint point = new TFlowExecutePoint();
        point.setCreateUser("test");
        point.setCreateDate(LocalDateTime.now());
        point.setExecutor("赵五");
        point.setPointId(7);
        point.setExecuteCode("799475673215730221771386639");
        point.setFlowCode("7994756732");

        flowExecutePoint.addFlowExecutePoint(point);
    }

    @Test
    public void TestSubjectAdd(){
        TPerSubjectInfo subjectInfo = new TPerSubjectInfo();
        subjectInfo.setCreateDate(LocalDateTime.now());
        subjectInfo.setPerDynamicEvalCode(perGenerate.createSubjectCode());
        subjectInfo.setCode("10");
        subjectInfo.setPerDynamicEvalName("物资供应商履约动态评价标准");

        subject.addSubject(subjectInfo);
    }

    @Test
    public void TestSubjectTitleAdd(){
        BigDecimal weight = new BigDecimal("0.4");
        TPerSubjectTitleInfo titleInfo = new TPerSubjectTitleInfo();
        titleInfo.setTitleCode(perGenerate.createTitleCode());
        titleInfo.setCreateDate(LocalDateTime.now());
        titleInfo.setTitleName("质量");
        titleInfo.setPerDynamicEvalCode("2680347023");
        titleInfo.setWeight(weight);

        subject.addTitle(titleInfo);
    }

    @Test
    public void TestSubjectContentAdd(){
        BigDecimal scope = new BigDecimal("50");
        TPerSubjectDetailInfo detailInfo = new TPerSubjectDetailInfo();
        detailInfo.setContentCode("C");
        detailInfo.setContent("c.主要技术指标合格，发生轻微质量问题，及时处理，或不清楚情况");
        detailInfo.setCreateDate(LocalDateTime.now());
        detailInfo.setScope(scope);
        detailInfo.setTitleCode("38412029403");
        detailInfo.setScopeName("一般");
        subject.addContent(detailInfo);
    }
}
