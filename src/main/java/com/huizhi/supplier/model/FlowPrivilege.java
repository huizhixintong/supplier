package com.huizhi.supplier.model;

import lombok.Data;

@Data
public class FlowPrivilege {
    private String flowCode;
    private int pointId;
    private char commit;
    private char pass;
    private char refuse;
    private char reject;
    private String privilege;

    public class ParsePrivilege{
        public  void parsePrivilege(){
            commit = privilege.charAt(0);
            pass = privilege.charAt(1);
            refuse = privilege.charAt(2);
            reject = privilege.charAt(3);
        }

        public void combinePrivilege(){
            privilege = String.valueOf(commit)+String.valueOf(pass) + String.valueOf(refuse)+String.valueOf(reject);
        }
    }
}
