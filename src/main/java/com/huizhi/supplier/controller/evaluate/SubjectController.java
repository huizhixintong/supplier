package com.huizhi.supplier.controller.evaluate;

import com.alibaba.fastjson.JSON;
import com.huizhi.supplier.constant.Constants;
import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.db.model.TPerSubjectDetailInfo;
import com.huizhi.supplier.db.model.TPerSubjectInfo;
import com.huizhi.supplier.db.model.TPerSubjectTitleInfo;
import com.huizhi.supplier.service.performance.Subject;
import com.huizhi.supplier.util.RespUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/per/subject")
@RestController
@Slf4j
public class SubjectController {

    @Resource
    private Subject subject;

    @ResponseBody
    @RequestMapping("/add")
    public Object addSubject(HttpServletRequest request,
                             @RequestBody() String requestBody){
        if (StringUtils.isEmpty(requestBody)){
            return RespUtil.getResponse(ErrCode.ERR_PARAMETER_NULL);
        }

        TPerSubjectInfo info = JSON.parseObject(requestBody,TPerSubjectInfo.class);
        if (info == null){
            return RespUtil.getResponse(ErrCode.ERR_BODY_PARSE_FAILED);
        }

        int iRet = subject.addSubject(info);
        return returnRecordUpdate(iRet,info,"数据插入成功");
    }

    @ResponseBody
    @RequestMapping("/edit")
    public Object editSubject(HttpServletRequest request,
                             @RequestBody() String requestBody){
        if (StringUtils.isEmpty(requestBody)){
            return RespUtil.getResponse(ErrCode.ERR_PARAMETER_NULL);
        }

        TPerSubjectInfo info = JSON.parseObject(requestBody,TPerSubjectInfo.class);
        if (info == null){
            return RespUtil.getResponse(ErrCode.ERR_BODY_PARSE_FAILED);
        }

        int iRet = subject.editSubject(info);

        return returnRecordUpdate(iRet,info,"数据更新成功");
    }

    @ResponseBody
    @RequestMapping("/query")
    public Object querySubject(HttpServletRequest request,
                             @RequestParam("code") String subjectCode){
        List<TPerSubjectInfo> list = subject.querySubject(subjectCode);
        return RespUtil.getResponse(ErrCode.CONT_SUCCESS,list);
    }

    @ResponseBody
    @RequestMapping("/title/add")
    public Object addTitle(HttpServletRequest request,
                             @RequestBody() String requestBody){
        if (StringUtils.isEmpty(requestBody)){
            return RespUtil.getResponse(ErrCode.ERR_PARAMETER_NULL);
        }

        TPerSubjectTitleInfo info = JSON.parseObject(requestBody, TPerSubjectTitleInfo.class);
        if (info == null){
            return RespUtil.getResponse(ErrCode.ERR_BODY_PARSE_FAILED);
        }

        int iRet = subject.addTitle(info);

        return returnRecordUpdate(iRet,info,"数据插入成功");
    }

    @ResponseBody
    @RequestMapping("/title/edit")
    public Object editTitle(HttpServletRequest request,
                           @RequestBody() String requestBody){
        if (StringUtils.isEmpty(requestBody)){
            return RespUtil.getResponse(ErrCode.ERR_PARAMETER_NULL);
        }

        TPerSubjectTitleInfo info = JSON.parseObject(requestBody, TPerSubjectTitleInfo.class);
        if (info == null){
            return RespUtil.getResponse(ErrCode.ERR_BODY_PARSE_FAILED);
        }

        int iRet = subject.editTitle(info);

        return returnRecordUpdate(iRet,info,"数据更新成功");    }

    @ResponseBody
    @RequestMapping("/title/query")
    public Object queryTitle(HttpServletRequest request,
                           @RequestParam("code") String titleCode){
        List<TPerSubjectTitleInfo> list = subject.queryTitle(titleCode);
        return RespUtil.getResponse(ErrCode.CONT_SUCCESS,list);
    }


    @ResponseBody
    @RequestMapping("/title/content/add")
    public Object addTitleContent(HttpServletRequest request,
                           @RequestBody() String requestBody){
        if (StringUtils.isEmpty(requestBody)){
            return RespUtil.getResponse(ErrCode.ERR_PARAMETER_NULL);
        }

        TPerSubjectDetailInfo info = JSON.parseObject(requestBody, TPerSubjectDetailInfo.class);
        if (info == null){
            return RespUtil.getResponse(ErrCode.ERR_BODY_PARSE_FAILED);
        }

        int iRet = subject.addContent(info);
        return returnRecordUpdate(iRet,info,"数据插入成功");
    }

    @ResponseBody
    @RequestMapping("/title/content/edit")
    public Object editTitleContent(HttpServletRequest request,
                            @RequestBody() String requestBody){
        if (StringUtils.isEmpty(requestBody)){
            return RespUtil.getResponse(ErrCode.ERR_PARAMETER_NULL);
        }

        TPerSubjectDetailInfo info = JSON.parseObject(requestBody, TPerSubjectDetailInfo.class);
        if (info == null){
            return RespUtil.getResponse(ErrCode.ERR_BODY_PARSE_FAILED);
        }

        int iRet = subject.addContent(info);
        return returnRecordUpdate(iRet,info,"数据更新成功");    }

    @ResponseBody
    @RequestMapping("/title/content/query")
    public Object queryTitleContent(HttpServletRequest request,
                             @RequestParam("code") String titleCode){
        List<TPerSubjectDetailInfo> list = subject.queryDetail(titleCode);
        return RespUtil.getResponse(ErrCode.CONT_SUCCESS,list);
    }

    private Object returnRecordUpdate(int iRet, Object obj, String msg){
        if ( iRet== Constants.CONT_RECORDER_EXITS){
            log.info(msg,obj);
            return RespUtil.getResponse(ErrCode.CONT_SUCCESS);
        }else {
            log.error(ErrCode.getErrMsg(iRet),obj);
            return RespUtil.getResponse(iRet);
        }
    }
}
