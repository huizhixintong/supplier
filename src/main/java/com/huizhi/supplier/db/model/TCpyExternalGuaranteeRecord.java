package com.huizhi.supplier.db.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyExternalGuaranteeRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.guarantor_name
     *
     * @mbg.generated
     */
    private String guarantorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.payment_method
     *
     * @mbg.generated
     */
    private String paymentMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.current_balance
     *
     * @mbg.generated
     */
    private BigDecimal currentBalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.maximum_overdue_amount
     *
     * @mbg.generated
     */
    private BigDecimal maximumOverdueAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.maximum_overdue_day
     *
     * @mbg.generated
     */
    private String maximumOverdueDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.back_guarantor_name
     *
     * @mbg.generated
     */
    private String backGuarantorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.guarantees
     *
     * @mbg.generated
     */
    private String guarantees;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.guaranty_style
     *
     * @mbg.generated
     */
    private String guarantyStyle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.warranties
     *
     * @mbg.generated
     */
    private BigDecimal warranties;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.guarantee_period
     *
     * @mbg.generated
     */
    private String guaranteePeriod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.guarantee_start_date
     *
     * @mbg.generated
     */
    private LocalDate guaranteeStartDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.guarantee_end_date
     *
     * @mbg.generated
     */
    private LocalDate guaranteeEndDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_external_guarantee_record.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.id
     *
     * @return the value of t_cpy_external_guarantee_record.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.id
     *
     * @param id the value for t_cpy_external_guarantee_record.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.company_id
     *
     * @return the value of t_cpy_external_guarantee_record.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.company_id
     *
     * @param companyId the value for t_cpy_external_guarantee_record.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.guarantor_name
     *
     * @return the value of t_cpy_external_guarantee_record.guarantor_name
     *
     * @mbg.generated
     */
    public String getGuarantorName() {
        return guarantorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.guarantor_name
     *
     * @param guarantorName the value for t_cpy_external_guarantee_record.guarantor_name
     *
     * @mbg.generated
     */
    public void setGuarantorName(String guarantorName) {
        this.guarantorName = guarantorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.payment_method
     *
     * @return the value of t_cpy_external_guarantee_record.payment_method
     *
     * @mbg.generated
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.payment_method
     *
     * @param paymentMethod the value for t_cpy_external_guarantee_record.payment_method
     *
     * @mbg.generated
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.current_balance
     *
     * @return the value of t_cpy_external_guarantee_record.current_balance
     *
     * @mbg.generated
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.current_balance
     *
     * @param currentBalance the value for t_cpy_external_guarantee_record.current_balance
     *
     * @mbg.generated
     */
    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.maximum_overdue_amount
     *
     * @return the value of t_cpy_external_guarantee_record.maximum_overdue_amount
     *
     * @mbg.generated
     */
    public BigDecimal getMaximumOverdueAmount() {
        return maximumOverdueAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.maximum_overdue_amount
     *
     * @param maximumOverdueAmount the value for t_cpy_external_guarantee_record.maximum_overdue_amount
     *
     * @mbg.generated
     */
    public void setMaximumOverdueAmount(BigDecimal maximumOverdueAmount) {
        this.maximumOverdueAmount = maximumOverdueAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.maximum_overdue_day
     *
     * @return the value of t_cpy_external_guarantee_record.maximum_overdue_day
     *
     * @mbg.generated
     */
    public String getMaximumOverdueDay() {
        return maximumOverdueDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.maximum_overdue_day
     *
     * @param maximumOverdueDay the value for t_cpy_external_guarantee_record.maximum_overdue_day
     *
     * @mbg.generated
     */
    public void setMaximumOverdueDay(String maximumOverdueDay) {
        this.maximumOverdueDay = maximumOverdueDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.back_guarantor_name
     *
     * @return the value of t_cpy_external_guarantee_record.back_guarantor_name
     *
     * @mbg.generated
     */
    public String getBackGuarantorName() {
        return backGuarantorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.back_guarantor_name
     *
     * @param backGuarantorName the value for t_cpy_external_guarantee_record.back_guarantor_name
     *
     * @mbg.generated
     */
    public void setBackGuarantorName(String backGuarantorName) {
        this.backGuarantorName = backGuarantorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.guarantees
     *
     * @return the value of t_cpy_external_guarantee_record.guarantees
     *
     * @mbg.generated
     */
    public String getGuarantees() {
        return guarantees;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.guarantees
     *
     * @param guarantees the value for t_cpy_external_guarantee_record.guarantees
     *
     * @mbg.generated
     */
    public void setGuarantees(String guarantees) {
        this.guarantees = guarantees;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.guaranty_style
     *
     * @return the value of t_cpy_external_guarantee_record.guaranty_style
     *
     * @mbg.generated
     */
    public String getGuarantyStyle() {
        return guarantyStyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.guaranty_style
     *
     * @param guarantyStyle the value for t_cpy_external_guarantee_record.guaranty_style
     *
     * @mbg.generated
     */
    public void setGuarantyStyle(String guarantyStyle) {
        this.guarantyStyle = guarantyStyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.warranties
     *
     * @return the value of t_cpy_external_guarantee_record.warranties
     *
     * @mbg.generated
     */
    public BigDecimal getWarranties() {
        return warranties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.warranties
     *
     * @param warranties the value for t_cpy_external_guarantee_record.warranties
     *
     * @mbg.generated
     */
    public void setWarranties(BigDecimal warranties) {
        this.warranties = warranties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.guarantee_period
     *
     * @return the value of t_cpy_external_guarantee_record.guarantee_period
     *
     * @mbg.generated
     */
    public String getGuaranteePeriod() {
        return guaranteePeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.guarantee_period
     *
     * @param guaranteePeriod the value for t_cpy_external_guarantee_record.guarantee_period
     *
     * @mbg.generated
     */
    public void setGuaranteePeriod(String guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.guarantee_start_date
     *
     * @return the value of t_cpy_external_guarantee_record.guarantee_start_date
     *
     * @mbg.generated
     */
    public LocalDate getGuaranteeStartDate() {
        return guaranteeStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.guarantee_start_date
     *
     * @param guaranteeStartDate the value for t_cpy_external_guarantee_record.guarantee_start_date
     *
     * @mbg.generated
     */
    public void setGuaranteeStartDate(LocalDate guaranteeStartDate) {
        this.guaranteeStartDate = guaranteeStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.guarantee_end_date
     *
     * @return the value of t_cpy_external_guarantee_record.guarantee_end_date
     *
     * @mbg.generated
     */
    public LocalDate getGuaranteeEndDate() {
        return guaranteeEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.guarantee_end_date
     *
     * @param guaranteeEndDate the value for t_cpy_external_guarantee_record.guarantee_end_date
     *
     * @mbg.generated
     */
    public void setGuaranteeEndDate(LocalDate guaranteeEndDate) {
        this.guaranteeEndDate = guaranteeEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.create_person
     *
     * @return the value of t_cpy_external_guarantee_record.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.create_person
     *
     * @param createPerson the value for t_cpy_external_guarantee_record.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.create_time
     *
     * @return the value of t_cpy_external_guarantee_record.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.create_time
     *
     * @param createTime the value for t_cpy_external_guarantee_record.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.modify_person
     *
     * @return the value of t_cpy_external_guarantee_record.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.modify_person
     *
     * @param modifyPerson the value for t_cpy_external_guarantee_record.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.modify_time
     *
     * @return the value of t_cpy_external_guarantee_record.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.modify_time
     *
     * @param modifyTime the value for t_cpy_external_guarantee_record.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_external_guarantee_record.data_resource
     *
     * @return the value of t_cpy_external_guarantee_record.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_external_guarantee_record.data_resource
     *
     * @param dataResource the value for t_cpy_external_guarantee_record.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_external_guarantee_record
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", guarantorName=").append(guarantorName);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", currentBalance=").append(currentBalance);
        sb.append(", maximumOverdueAmount=").append(maximumOverdueAmount);
        sb.append(", maximumOverdueDay=").append(maximumOverdueDay);
        sb.append(", backGuarantorName=").append(backGuarantorName);
        sb.append(", guarantees=").append(guarantees);
        sb.append(", guarantyStyle=").append(guarantyStyle);
        sb.append(", warranties=").append(warranties);
        sb.append(", guaranteePeriod=").append(guaranteePeriod);
        sb.append(", guaranteeStartDate=").append(guaranteeStartDate);
        sb.append(", guaranteeEndDate=").append(guaranteeEndDate);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyPerson=").append(modifyPerson);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", dataResource=").append(dataResource);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_external_guarantee_record
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TCpyExternalGuaranteeRecord other = (TCpyExternalGuaranteeRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getGuarantorName() == null ? other.getGuarantorName() == null : this.getGuarantorName().equals(other.getGuarantorName()))
            && (this.getPaymentMethod() == null ? other.getPaymentMethod() == null : this.getPaymentMethod().equals(other.getPaymentMethod()))
            && (this.getCurrentBalance() == null ? other.getCurrentBalance() == null : this.getCurrentBalance().equals(other.getCurrentBalance()))
            && (this.getMaximumOverdueAmount() == null ? other.getMaximumOverdueAmount() == null : this.getMaximumOverdueAmount().equals(other.getMaximumOverdueAmount()))
            && (this.getMaximumOverdueDay() == null ? other.getMaximumOverdueDay() == null : this.getMaximumOverdueDay().equals(other.getMaximumOverdueDay()))
            && (this.getBackGuarantorName() == null ? other.getBackGuarantorName() == null : this.getBackGuarantorName().equals(other.getBackGuarantorName()))
            && (this.getGuarantees() == null ? other.getGuarantees() == null : this.getGuarantees().equals(other.getGuarantees()))
            && (this.getGuarantyStyle() == null ? other.getGuarantyStyle() == null : this.getGuarantyStyle().equals(other.getGuarantyStyle()))
            && (this.getWarranties() == null ? other.getWarranties() == null : this.getWarranties().equals(other.getWarranties()))
            && (this.getGuaranteePeriod() == null ? other.getGuaranteePeriod() == null : this.getGuaranteePeriod().equals(other.getGuaranteePeriod()))
            && (this.getGuaranteeStartDate() == null ? other.getGuaranteeStartDate() == null : this.getGuaranteeStartDate().equals(other.getGuaranteeStartDate()))
            && (this.getGuaranteeEndDate() == null ? other.getGuaranteeEndDate() == null : this.getGuaranteeEndDate().equals(other.getGuaranteeEndDate()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_external_guarantee_record
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getGuarantorName() == null) ? 0 : getGuarantorName().hashCode());
        result = prime * result + ((getPaymentMethod() == null) ? 0 : getPaymentMethod().hashCode());
        result = prime * result + ((getCurrentBalance() == null) ? 0 : getCurrentBalance().hashCode());
        result = prime * result + ((getMaximumOverdueAmount() == null) ? 0 : getMaximumOverdueAmount().hashCode());
        result = prime * result + ((getMaximumOverdueDay() == null) ? 0 : getMaximumOverdueDay().hashCode());
        result = prime * result + ((getBackGuarantorName() == null) ? 0 : getBackGuarantorName().hashCode());
        result = prime * result + ((getGuarantees() == null) ? 0 : getGuarantees().hashCode());
        result = prime * result + ((getGuarantyStyle() == null) ? 0 : getGuarantyStyle().hashCode());
        result = prime * result + ((getWarranties() == null) ? 0 : getWarranties().hashCode());
        result = prime * result + ((getGuaranteePeriod() == null) ? 0 : getGuaranteePeriod().hashCode());
        result = prime * result + ((getGuaranteeStartDate() == null) ? 0 : getGuaranteeStartDate().hashCode());
        result = prime * result + ((getGuaranteeEndDate() == null) ? 0 : getGuaranteeEndDate().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_external_guarantee_record
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        guarantorName("guarantor_name", "guarantorName", "VARCHAR", false),
        paymentMethod("payment_method", "paymentMethod", "VARCHAR", false),
        currentBalance("current_balance", "currentBalance", "DECIMAL", false),
        maximumOverdueAmount("maximum_overdue_amount", "maximumOverdueAmount", "DECIMAL", false),
        maximumOverdueDay("maximum_overdue_day", "maximumOverdueDay", "VARCHAR", false),
        backGuarantorName("back_guarantor_name", "backGuarantorName", "VARCHAR", false),
        guarantees("guarantees", "guarantees", "VARCHAR", false),
        guarantyStyle("guaranty_style", "guarantyStyle", "VARCHAR", false),
        warranties("warranties", "warranties", "DECIMAL", false),
        guaranteePeriod("guarantee_period", "guaranteePeriod", "VARCHAR", false),
        guaranteeStartDate("guarantee_start_date", "guaranteeStartDate", "DATE", false),
        guaranteeEndDate("guarantee_end_date", "guaranteeEndDate", "DATE", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_external_guarantee_record
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}