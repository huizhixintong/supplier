package com.huizhi.supplier.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {
    private int code;
    private String message;
    private Object data;
}
