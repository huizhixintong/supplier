package com.huizhi.supplier.constant;

public class ErrCode {
    public final static int CONT_SUCCESS = 0;
//    public final static int CONT_SUCCESS = 0;
    public final static int ERR_ID_NULL = 1000001;
    public final static int ERR_PARAMETER_NULL = 1000002;
    public final static int ERR_CONT_EXITS = 1000003;
    public final static int ERR_FLOW_PARAMETER_NULL = 1000004;
    public final static int ERR_FLOW_POINT_NOT_EXITS = 100005;
    public final static int ERR_FLOW_POINT_FINISHED = 100006;
    public final static int ERR_FLOW_POINT_UNFINISHED = 100007;
    public final static int ERR_FLOW_INCOMPLETE = 1000008;

    public final static int ERR_FLOW_NEXT_POINT = 1000009;
    public final static int ERR_FLOW_NOT_EXITS = 1000010;
    public final static int ERR_FLOW_EXITS = 1000011;


    private final static String ERR_SUCCESS_MSG = "成功";
    private final static String ERR_ID_NULL_MSG = "主键ID为空!";
    private final static String ERR_PARAMETER_NULL_MSG = "请求参数为空";
    private final static String ERR_DEFAULT_MSG = "未知错误！";
    private final static String ERR_CONT_EXITS_MSG = "合同已经存在";
    private final static String ERR_FLOW_PARAMETER_NULL_MSG = "流程主参数为NULL";
    private final static String ERR_FLOW_POINT_NOT_EXITS_MSG = "节点流程不存在";
    private final static String ERR_FLOW_POINT_FINISHED_MSG = "节点流程已经完成";
    private final static String ERR_FLOW_POINT_UNFINISHED_MSG = "节点流程未完成";


    public static String getErrMsg(int code){
        switch (code){
            case CONT_SUCCESS:
                return ERR_SUCCESS_MSG;
            case ERR_ID_NULL:
                return ERR_ID_NULL_MSG;
            case ERR_PARAMETER_NULL:
                return ERR_PARAMETER_NULL_MSG;
            case ERR_CONT_EXITS:
                return ERR_CONT_EXITS_MSG;
            case ERR_FLOW_PARAMETER_NULL:
                return ERR_FLOW_PARAMETER_NULL_MSG;
            case ERR_FLOW_POINT_NOT_EXITS:
                return ERR_FLOW_POINT_NOT_EXITS_MSG;
            case ERR_FLOW_POINT_FINISHED:
                return ERR_FLOW_POINT_FINISHED_MSG;
            case ERR_FLOW_POINT_UNFINISHED:
                return ERR_FLOW_POINT_UNFINISHED_MSG;
            default:
                return ERR_DEFAULT_MSG;
        }
    }
}
