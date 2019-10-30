package com.huizhi.supplier.db.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TPerContract {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.pay_time
     *
     * @mbg.generated
     */
    private LocalDate payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.sign_time
     *
     * @mbg.generated
     */
    private LocalDate signTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.amount
     *
     * @mbg.generated
     */
    private String amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.buyer
     *
     * @mbg.generated
     */
    private String buyer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.supplier_name
     *
     * @mbg.generated
     */
    private String supplierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.supplier_id
     *
     * @mbg.generated
     */
    private String supplierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.supplier_code
     *
     * @mbg.generated
     */
    private String supplierCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.attachement_path
     *
     * @mbg.generated
     */
    private String attachementPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.score
     *
     * @mbg.generated
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.table_type
     *
     * @mbg.generated
     */
    private String tableType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.look_status
     *
     * @mbg.generated
     */
    private String lookStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_per_contract.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.id
     *
     * @return the value of t_per_contract.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.id
     *
     * @param id the value for t_per_contract.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.name
     *
     * @return the value of t_per_contract.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.name
     *
     * @param name the value for t_per_contract.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.code
     *
     * @return the value of t_per_contract.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.code
     *
     * @param code the value for t_per_contract.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.pay_time
     *
     * @return the value of t_per_contract.pay_time
     *
     * @mbg.generated
     */
    public LocalDate getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.pay_time
     *
     * @param payTime the value for t_per_contract.pay_time
     *
     * @mbg.generated
     */
    public void setPayTime(LocalDate payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.sign_time
     *
     * @return the value of t_per_contract.sign_time
     *
     * @mbg.generated
     */
    public LocalDate getSignTime() {
        return signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.sign_time
     *
     * @param signTime the value for t_per_contract.sign_time
     *
     * @mbg.generated
     */
    public void setSignTime(LocalDate signTime) {
        this.signTime = signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.amount
     *
     * @return the value of t_per_contract.amount
     *
     * @mbg.generated
     */
    public String getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.amount
     *
     * @param amount the value for t_per_contract.amount
     *
     * @mbg.generated
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.buyer
     *
     * @return the value of t_per_contract.buyer
     *
     * @mbg.generated
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.buyer
     *
     * @param buyer the value for t_per_contract.buyer
     *
     * @mbg.generated
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.supplier_name
     *
     * @return the value of t_per_contract.supplier_name
     *
     * @mbg.generated
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.supplier_name
     *
     * @param supplierName the value for t_per_contract.supplier_name
     *
     * @mbg.generated
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.supplier_id
     *
     * @return the value of t_per_contract.supplier_id
     *
     * @mbg.generated
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.supplier_id
     *
     * @param supplierId the value for t_per_contract.supplier_id
     *
     * @mbg.generated
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.supplier_code
     *
     * @return the value of t_per_contract.supplier_code
     *
     * @mbg.generated
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.supplier_code
     *
     * @param supplierCode the value for t_per_contract.supplier_code
     *
     * @mbg.generated
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.attachement_path
     *
     * @return the value of t_per_contract.attachement_path
     *
     * @mbg.generated
     */
    public String getAttachementPath() {
        return attachementPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.attachement_path
     *
     * @param attachementPath the value for t_per_contract.attachement_path
     *
     * @mbg.generated
     */
    public void setAttachementPath(String attachementPath) {
        this.attachementPath = attachementPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.type
     *
     * @return the value of t_per_contract.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.type
     *
     * @param type the value for t_per_contract.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.description
     *
     * @return the value of t_per_contract.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.description
     *
     * @param description the value for t_per_contract.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.score
     *
     * @return the value of t_per_contract.score
     *
     * @mbg.generated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.score
     *
     * @param score the value for t_per_contract.score
     *
     * @mbg.generated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.table_type
     *
     * @return the value of t_per_contract.table_type
     *
     * @mbg.generated
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.table_type
     *
     * @param tableType the value for t_per_contract.table_type
     *
     * @mbg.generated
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.status
     *
     * @return the value of t_per_contract.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.status
     *
     * @param status the value for t_per_contract.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.look_status
     *
     * @return the value of t_per_contract.look_status
     *
     * @mbg.generated
     */
    public String getLookStatus() {
        return lookStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.look_status
     *
     * @param lookStatus the value for t_per_contract.look_status
     *
     * @mbg.generated
     */
    public void setLookStatus(String lookStatus) {
        this.lookStatus = lookStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.data_resource
     *
     * @return the value of t_per_contract.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.data_resource
     *
     * @param dataResource the value for t_per_contract.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.create_person
     *
     * @return the value of t_per_contract.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.create_person
     *
     * @param createPerson the value for t_per_contract.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.create_time
     *
     * @return the value of t_per_contract.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.create_time
     *
     * @param createTime the value for t_per_contract.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.modify_person
     *
     * @return the value of t_per_contract.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.modify_person
     *
     * @param modifyPerson the value for t_per_contract.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_per_contract.modify_time
     *
     * @return the value of t_per_contract.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_per_contract.modify_time
     *
     * @param modifyTime the value for t_per_contract.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_contract
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
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", payTime=").append(payTime);
        sb.append(", signTime=").append(signTime);
        sb.append(", amount=").append(amount);
        sb.append(", buyer=").append(buyer);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierCode=").append(supplierCode);
        sb.append(", attachementPath=").append(attachementPath);
        sb.append(", type=").append(type);
        sb.append(", description=").append(description);
        sb.append(", score=").append(score);
        sb.append(", tableType=").append(tableType);
        sb.append(", status=").append(status);
        sb.append(", lookStatus=").append(lookStatus);
        sb.append(", dataResource=").append(dataResource);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyPerson=").append(modifyPerson);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_contract
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
        TPerContract other = (TPerContract) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getSignTime() == null ? other.getSignTime() == null : this.getSignTime().equals(other.getSignTime()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBuyer() == null ? other.getBuyer() == null : this.getBuyer().equals(other.getBuyer()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getSupplierCode() == null ? other.getSupplierCode() == null : this.getSupplierCode().equals(other.getSupplierCode()))
            && (this.getAttachementPath() == null ? other.getAttachementPath() == null : this.getAttachementPath().equals(other.getAttachementPath()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getTableType() == null ? other.getTableType() == null : this.getTableType().equals(other.getTableType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLookStatus() == null ? other.getLookStatus() == null : this.getLookStatus().equals(other.getLookStatus()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_contract
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getSignTime() == null) ? 0 : getSignTime().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBuyer() == null) ? 0 : getBuyer().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getSupplierCode() == null) ? 0 : getSupplierCode().hashCode());
        result = prime * result + ((getAttachementPath() == null) ? 0 : getAttachementPath().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getTableType() == null) ? 0 : getTableType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLookStatus() == null) ? 0 : getLookStatus().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_per_contract
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        code("code", "code", "VARCHAR", false),
        payTime("pay_time", "payTime", "DATE", false),
        signTime("sign_time", "signTime", "DATE", false),
        amount("amount", "amount", "VARCHAR", false),
        buyer("buyer", "buyer", "VARCHAR", false),
        supplierName("supplier_name", "supplierName", "VARCHAR", false),
        supplierId("supplier_id", "supplierId", "VARCHAR", false),
        supplierCode("supplier_code", "supplierCode", "VARCHAR", false),
        attachementPath("attachement_path", "attachementPath", "VARCHAR", false),
        type("type", "type", "VARCHAR", true),
        description("description", "description", "VARCHAR", false),
        score("score", "score", "INTEGER", false),
        tableType("table_type", "tableType", "VARCHAR", false),
        status("status", "status", "VARCHAR", true),
        lookStatus("look_status", "lookStatus", "CHAR", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_per_contract
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
         * This method corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_per_contract
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
         * This method corresponds to the database table t_per_contract
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
         * This method corresponds to the database table t_per_contract
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}