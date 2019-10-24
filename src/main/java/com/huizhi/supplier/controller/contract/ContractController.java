package com.huizhi.supplier.controller.contract;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/cont")
public class ContractController {

    @ResponseBody
    @RequestMapping("/save")
    public Object saveContract(HttpServletRequest request,String info){
        return null;
    }

    @ResponseBody
    @RequestMapping("/query")
    public Object queryContract(HttpServletRequest request, String contID, String contName, String createDate){
        return null;
    }
}
