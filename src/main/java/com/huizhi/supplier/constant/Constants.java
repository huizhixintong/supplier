package com.huizhi.supplier.constant;

public class Constants {

    public final static int CONT_EXECUTE_POINT_START = -1;
    public final static int CONT_EXECUTE_POINT_END = 0;

    public final static int CONT_RECORDER_EXITS = 1;


    public final static int CONT_NOTIFY_TYPE_MAIL = 1;
    public final static int CONT_NOTIFY_TYPE_SMS = 0;

    public final static int CONT_POINT_CLASS_START = 0;
    public final static int CONT_POINT_CLASS_MID = 1;
    public final static int CONT_POINT_CLASS_END = 2;

    /*操作类型 0 初始化 1 提交 2 驳回 3 审核通过 4 拒绝 */
    public final static int CONT_FLOW_STATUS_DEFUALT = 0;
    public final static int CONT_FLOW_STATUS_WAIT = 1;
    public final static int CONT_FLOW_STATUS_COMMIT = 2;
    public final static int CONT_FLOW_STATUS_REJECT = 3;
    public final static int CONT_FLOW_STATUS_PASS = 4;
    public final static int CONT_FLOW_STATUS_REFUSE = 5;
    public final static int CONT_FLOW_STATUS_FINISH = 6;





    public final static String CONT_FLOW_STATUS_DEFUALT_MSG = "流程未开始";
    public final static String CONT_FLOW_STATUS_COMMIT_MSG = "已经提交";
    public final static String CONT_FLOW_STATUS_REJECT_MSG = "驳回";
    public final static String CONT_FLOW_STATUS_PASS_MSG = "审核通过";
    public final static String CONT_FLOW_STATUS_REFUSE_MSG = "拒绝";
    public final static String CONT_FLOW_STATUS_FINISH_MSG = "审核结束";
    public final static String CONT_FLOW_STATUS_WAIT_MSG = "待审核";

    public static String getFlowStatusDetail(int act){
        switch (act){
            case CONT_FLOW_STATUS_DEFUALT:
                return CONT_FLOW_STATUS_DEFUALT_MSG;
            case CONT_FLOW_STATUS_COMMIT:
                return CONT_FLOW_STATUS_COMMIT_MSG;
            case CONT_FLOW_STATUS_REJECT:
                return CONT_FLOW_STATUS_REJECT_MSG;
            case CONT_FLOW_STATUS_PASS:
                return CONT_FLOW_STATUS_PASS_MSG;
            case CONT_FLOW_STATUS_REFUSE:
                return CONT_FLOW_STATUS_REFUSE_MSG;
            case CONT_FLOW_STATUS_FINISH:
                return CONT_FLOW_STATUS_FINISH_MSG;
            case CONT_FLOW_STATUS_WAIT:
                return CONT_FLOW_STATUS_WAIT_MSG;
            default:
                return "";
        }
    }
}


