package com.huizhi.supplier.controller.company;

import com.huizhi.supplier.constant.Constants;
import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.dao.TCpyAssetsLiabilitiesMapper;
import com.huizhi.supplier.db.model.TCpyAssetsLiabilities;

import com.huizhi.supplier.service.common.CommonService;
import com.huizhi.supplier.service.supplier.company.assetsliabilities.AssetsLiabilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Title: AssetsLiabilitiesController
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/28 0028 18:15
 */
@RestController
@RequestMapping(value = "/company/ass/")
@CrossOrigin
public class AssetsLiabilitiesController {

    @Autowired
    private AssetsLiabilitiesService assetsLiabilitiesService;


    @Autowired
    private CommonService<TCpyAssetsLiabilitiesMapper,TCpyAssetsLiabilities> commonService;


    @RequestMapping(value = "get/list")
    public List<TCpyAssetsLiabilities> getByCompanyId(Integer companyId){

        return commonService.findByCompanyId(companyId);

    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int add(@RequestBody TCpyAssetsLiabilities tCpyAssetsLiabilities){
        if(null == tCpyAssetsLiabilities){
            return ErrCode.ERR_FOREIGN_KEY_NULL;
        }

        tCpyAssetsLiabilities.setDataResource(Constants.HANDMADE);
        return commonService.save(tCpyAssetsLiabilities);
    }


}
