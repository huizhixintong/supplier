package com.huizhi.supplier.constant;

public class ErrCode {
    public final static int ERR_SUCCESS = 0;
    public final static int ERR_ID_NULL = 1000001;
    public final static int ERR_PARAMETER_NULL = 1000002;
    public final static int ERR_CONT_EXITS = 1000003;

    private final static String ERR_SUCCESS_MSG = "成功";
    private final static String ERR_ID_NULL_MSG = "主键ID为空!";
    private final static String ERR_PARAMETER_NULL_MSG = "请求参数为空";
    private final static String ERR_DEFAULT_MSG = "未知错误！";
    private final static String ERR_CONT_EXITS_MSG = "合同已经存在";


    public static String getErrMsg(int code){
        switch (code){
            case ERR_SUCCESS:
                return ERR_SUCCESS_MSG;
            case ERR_ID_NULL:
                return ERR_ID_NULL_MSG;
            case ERR_PARAMETER_NULL:
                return ERR_PARAMETER_NULL_MSG;
            case ERR_CONT_EXITS:
                return ERR_CONT_EXITS_MSG;
            default:
                return ERR_DEFAULT_MSG;
        }
    }
}
