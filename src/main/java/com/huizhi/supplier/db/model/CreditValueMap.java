package com.huizhi.supplier.db.model;

import java.io.Serializable;

/**
 * @Title: CreditValueMap
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/25 0025 16:24
 */
public class CreditValueMap implements Serializable {

    private Integer id;

    private String industry; //行业名称

    private String field; //指标名称

    private String mapType;  //映射类型

    private String threshold;  //阈值
    private String value;  //阈值

    private String fieldSource; // 指标来源

    private String orientation;  // 正负相关

    public CreditValueMap() {
    }


    public CreditValueMap(Integer id, String industry, String field, String mapType, String threshold, String fieldSource, String orientation) {
        this.id = id;
        this.industry = industry;
        this.field = field;
        this.mapType = mapType;
        this.threshold = threshold;
        this.fieldSource = fieldSource;
        this.orientation = orientation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public String getFieldSource() {
        return fieldSource;
    }

    public void setFieldSource(String fieldSource) {
        this.fieldSource = fieldSource;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "CreditValueMap{" +
                "id=" + id +
                ", industry='" + industry + '\'' +
                ", field='" + field + '\'' +
                ", mapType='" + mapType + '\'' +
                ", threshold='" + threshold + '\'' +
                ", fieldSource='" + fieldSource + '\'' +
                ", orientation='" + orientation + '\'' +
                '}';
    }
}
