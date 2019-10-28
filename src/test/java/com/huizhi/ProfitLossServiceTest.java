package com.huizhi;

import com.huizhi.supplier.db.model.TCpyProfitLoss;
import com.huizhi.supplier.service.supplier.company.profitloss.ProfitLossService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Title: ProfitLossServiceTest
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/24 0024 14:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfitLossServiceTest {

    @Resource
    private ProfitLossService profitLossService;

    @Test
    public void testGet(){
        TCpyProfitLoss byId = profitLossService.getById("0");

        System.out.print(byId);


    }
}
