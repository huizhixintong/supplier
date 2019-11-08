package com.huizhi.supplier.service.performance.imp;

import com.huizhi.supplier.constant.Constants;
import com.huizhi.supplier.db.model.TPerEvalInfo;
import com.huizhi.supplier.db.model.TPerEvalResult;
import com.huizhi.supplier.db.model.TPerSubjectDetailInfo;
import com.huizhi.supplier.db.model.TPerSubjectTitleInfo;
import com.huizhi.supplier.service.performance.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service("evaluate")
public class EvaluateImp implements Evaluate {

    @Resource
    private PerEval perEval;

    @Resource
    private PerSubjectTitleDetail perSubjectTitleDetail;

    @Resource
    private PerSubjectTitle perSubjectTitle;

    @Resource
    private PerEvalResult perEvalResult;

    @Override
    public void saveEval(List<TPerEvalInfo> list) {
        if (list == null || list.size()==0){
            return;
        }

        int count = saveItem(list);
        if (count != list.size()){
            log.error("count:%d list.size:%d\n %s",count,list.size(),list);
        }

        count = saveResult(list);
        if (count != Constants.CONT_RECORDER_EXITS){
            log.error("save Eval Result failed code:=%d\n",count);
        }

    }

    @Override
    public List<TPerEvalInfo> queryEvalInfo(String contCode) {
        if (StringUtils.isEmpty(contCode)){
            return null;
        }
        return perEval.queryEval(contCode);
    }

    @Override
    public TPerEvalResult queryEvalResult(String contCode) {
        return perEvalResult.queryEvalResult(contCode);
    }

    private int saveItem(List<TPerEvalInfo> list){

        int count = 0;
        int iRet = 0;
        for (int i =0 ;i<list.size();i++){
            iRet = perEval.addEval(list.get(i));
            if (iRet == Constants.CONT_RECORDER_EXITS){
                count++;
            }
        }

        return count;
    }

    private int saveResult(List<TPerEvalInfo> list){
        BigDecimal scope= new BigDecimal("0.0");

        Map<String,TPerSubjectTitleInfo> titleMap = convertTitleListToMap();
        Map<String,TPerSubjectDetailInfo> detailMap = convertDetailListToMap();

        for (int i=0;i<list.size();i++){
            String detailKey = getDetailKey(list.get(i).getTitleCode(),list.get(i).getContentCode());
             scope.add(detailMap.get(detailKey).getScope().multiply(titleMap.get(list.get(i).getTitleCode()).getWeight()));
        }

        return  perEvalResult.addEvalResult(getEvalResult(list.get(0).getContCode(),scope));
    }

    private TPerEvalResult getEvalResult(String contCode, BigDecimal scope){
        TPerEvalResult result = new TPerEvalResult();
        result.setContCode(contCode);
        result.setTotalScope(scope);
        result.setCreateDate(LocalDateTime.now());

        return result;
    }

    private String  getDetailKey(String titleCode, String contentCode){
        return titleCode+"_"+contentCode;
    }

    private Map<String, TPerSubjectTitleInfo> convertTitleListToMap(){
        List<TPerSubjectTitleInfo> list = perSubjectTitle.queryAllSubjectTitle();
        if (list == null || list.size()==0){
            return null;
        }
        Map<String,TPerSubjectTitleInfo> map = new HashMap<>();
        for (int i=0; i<list.size();i++){
            map.put(list.get(i).getTitleCode(),list.get(i));
        }

        return map;
    }

    private Map<String, TPerSubjectDetailInfo> convertDetailListToMap(){
        List<TPerSubjectDetailInfo> list = perSubjectTitleDetail.queryTitleDetail();
        if (list == null || list.size()==0){
            return null;
        }

        Map<String,TPerSubjectDetailInfo> map = new HashMap<>();

        for (int i=0;i<list.size();i++){
            TPerSubjectDetailInfo info = list.get(i);
                String key = getDetailKey(info.getTitleCode(),info.getContentCode());
                map.put(key,info);
        }

        return map;
    }

}
