package com.huizhi.supplier.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class NotifyInfo implements Serializable {
    private String nofityContent;
    private String notifyUrl;
    private String mail;
    private String phone;
    private String executor;
}
