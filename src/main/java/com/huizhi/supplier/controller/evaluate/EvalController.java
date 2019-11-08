package com.huizhi.supplier.controller.evaluate;

import com.alibaba.fastjson.JSON;
import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.model.TPerEvalInfo;
import com.huizhi.supplier.db.model.TPerEvalResult;
import com.huizhi.supplier.service.performance.Evaluate;
import com.huizhi.supplier.util.RespUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/per/eval")
@RestController
@Slf4j
public class EvalController {

    @Resource
    private Evaluate evaluate;

    @ResponseBody
    @RequestMapping("/save")
    public Object saveEvaluate(HttpServletRequest request,
                           @RequestBody() String requestBody){
        if (StringUtils.isEmpty(requestBody)){
            return RespUtil.getResponse(ErrCode.ERR_PARAMETER_NULL);
        }

        List<TPerEvalInfo> list = JSON.parseArray(requestBody, TPerEvalInfo.class);
        if (list == null || list.size()==0){
            return RespUtil.getResponse(ErrCode.ERR_BODY_PARSE_FAILED);
        }

        evaluate.saveEval(list);

        return RespUtil.getResponse(ErrCode.CONT_SUCCESS);
    }

    @ResponseBody
    @RequestMapping("/query")
    public Object queryEvalInfo(HttpServletRequest request,
                            @RequestParam("code") String contCode){
        List<TPerEvalInfo> list = evaluate.queryEvalInfo(contCode);
        return RespUtil.getResponse(ErrCode.CONT_SUCCESS,list);
    }

    @ResponseBody
    @RequestMapping("/totalQuery")
    public Object queryTitle(HttpServletRequest request,
                             @RequestParam("code") String contCode){
        TPerEvalResult result = evaluate.queryEvalResult(contCode);
        return RespUtil.getResponse(ErrCode.CONT_SUCCESS,request);
    }
}
