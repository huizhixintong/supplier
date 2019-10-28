package com.huizhi.supplier.controller.credit;

import com.huizhi.supplier.db.model.CreditValueMap;
import com.huizhi.supplier.db.model.TCreditValueMap;
import com.huizhi.supplier.service.credit.CommonCreditService;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Title: CommonCreditController
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/25 0025 16:50
 */
@RestController
@RequestMapping(value = "/supplier/credit/common/")
public class CommonCreditController {

    @Autowired
    private CommonCreditService commonCreditService;


    @RequestMapping(value = "listbyind")
    public List<TCreditValueMap> getCreditValueMapListByIndustry(String industry){

        if(StringUtils.isEmpty(industry)){
            return null;
        }

        return commonCreditService.findByIndustry(industry);
    }


    public Map<String,Double> getCredit(String companyId, String year,String industry){

        Map<String,Double> map = new HashMap<>();

        if(StringUtils.isEmpty(year)){
            Calendar cale = Calendar.getInstance();
            int currentYear = cale.get(Calendar.YEAR);

            year = String.valueOf(currentYear);
        }

        // 验证企业ID
        if(StringUtils.isEmpty(companyId)){
            return null;
        }

        // industry  从企业的信息中获取


        List<TCreditValueMap> creditList = getCreditValueMapListByIndustry(industry);

        List<String> sourceList = creditList.stream().map(TCreditValueMap::getFieldsource).collect(Collectors.toList());

        for (String sou: sourceList) {

            String className = new StringBuilder().append("com.huizhi.supplier.db.dao.").append(sou).toString();

            try {
                Class<?> aClass = Class.forName(className);
                Method selectByIndustry = aClass.getMethod("selectByIndustry", String.class, String.class);

                Object invoke = selectByIndustry.invoke(aClass.newInstance(), companyId, year);


//                Object o = aClass.newInstance();

            } catch (Exception e) {
                e.printStackTrace();
            }


        }


        Map<String, List<TCreditValueMap>> collect = creditList.stream().collect(Collectors.groupingBy(TCreditValueMap::getFieldsource));

        Iterator itr = collect.entrySet().iterator();
        Map.Entry entry = null;
        while (itr.hasNext()){
            entry = (Map.Entry)itr.next();

            List<TCreditValueMap> value = (List<TCreditValueMap>) entry.getValue();

        }


        return map;
    }


}
