package com.huizhi.supplier.util;

import com.huizhi.supplier.constant.ErrCode;
import com.huizhi.supplier.model.BaseResponse;

public class RespUtil {
    public static Object getResponse(int code, Object data){
        BaseResponse response = new BaseResponse();
        response.setCode(code);
        response.setMessage(ErrCode.getErrMsg(code));
        if (data != null) {
            response.setData(data);
        }

        return response;
    }

    public static Object getResponse(int code){
        return getResponse(code,null);
    }

}
