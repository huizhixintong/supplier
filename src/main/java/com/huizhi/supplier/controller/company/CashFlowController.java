package com.huizhi.supplier.controller.company;

import com.huizhi.supplier.db.dao.TCpyCashFlowMapper;
import com.huizhi.supplier.db.model.TCpyCashFlow;
import com.huizhi.supplier.service.common.CommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Title: CashFlowController
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/30 0030 15:01
 */
@RestController
@RequestMapping(value = "/company/cashf/")
public class CashFlowController {

    @Autowired
    private CommonService<TCpyCashFlowMapper, TCpyCashFlow> commonServiceImpl;

    @RequestMapping(value = "/get/list")
    public List<TCpyCashFlow> getByCompanyId(String companyId){
        return commonServiceImpl.findByCompanyId(companyId);

    }

    @RequestMapping(value = "/get/{id}")
    public TCpyCashFlow getById(@PathVariable("id") String id){
        return commonServiceImpl.findById(id);
    }

    @RequestMapping("/get/one")
    public TCpyCashFlow getByCompanyIdAndYear(String companyId,String year){
        return commonServiceImpl.findByCompanyIdAndYear(companyId,year);
    }



    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int add(@RequestBody TCpyCashFlow tCpyCashFlow){


        return commonServiceImpl.save(tCpyCashFlow);
    }


    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public int update(@RequestBody TCpyCashFlow tCpyCashFlow){
        return commonServiceImpl.update(tCpyCashFlow);
    }



}
