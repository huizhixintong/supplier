package com.huizhi.supplier.db.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyTrademark {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.trademark_info
     *
     * @mbg.generated
     */
    private String trademarkInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.trademark_path
     *
     * @mbg.generated
     */
    private String trademarkPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.trademark_name
     *
     * @mbg.generated
     */
    private String trademarkName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.trademark_status
     *
     * @mbg.generated
     */
    private String trademarkStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.trademark_no
     *
     * @mbg.generated
     */
    private String trademarkNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.trademark_type
     *
     * @mbg.generated
     */
    private String trademarkType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.apply_date
     *
     * @mbg.generated
     */
    private LocalDate applyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.agency
     *
     * @mbg.generated
     */
    private String agency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.is_have_reputed_trademark
     *
     * @mbg.generated
     */
    private String isHaveReputedTrademark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.reputed_trademark
     *
     * @mbg.generated
     */
    private String reputedTrademark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_trademark.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.id
     *
     * @return the value of t_cpy_trademark.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.id
     *
     * @param id the value for t_cpy_trademark.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.company_id
     *
     * @return the value of t_cpy_trademark.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.company_id
     *
     * @param companyId the value for t_cpy_trademark.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.trademark_info
     *
     * @return the value of t_cpy_trademark.trademark_info
     *
     * @mbg.generated
     */
    public String getTrademarkInfo() {
        return trademarkInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.trademark_info
     *
     * @param trademarkInfo the value for t_cpy_trademark.trademark_info
     *
     * @mbg.generated
     */
    public void setTrademarkInfo(String trademarkInfo) {
        this.trademarkInfo = trademarkInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.trademark_path
     *
     * @return the value of t_cpy_trademark.trademark_path
     *
     * @mbg.generated
     */
    public String getTrademarkPath() {
        return trademarkPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.trademark_path
     *
     * @param trademarkPath the value for t_cpy_trademark.trademark_path
     *
     * @mbg.generated
     */
    public void setTrademarkPath(String trademarkPath) {
        this.trademarkPath = trademarkPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.trademark_name
     *
     * @return the value of t_cpy_trademark.trademark_name
     *
     * @mbg.generated
     */
    public String getTrademarkName() {
        return trademarkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.trademark_name
     *
     * @param trademarkName the value for t_cpy_trademark.trademark_name
     *
     * @mbg.generated
     */
    public void setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.trademark_status
     *
     * @return the value of t_cpy_trademark.trademark_status
     *
     * @mbg.generated
     */
    public String getTrademarkStatus() {
        return trademarkStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.trademark_status
     *
     * @param trademarkStatus the value for t_cpy_trademark.trademark_status
     *
     * @mbg.generated
     */
    public void setTrademarkStatus(String trademarkStatus) {
        this.trademarkStatus = trademarkStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.trademark_no
     *
     * @return the value of t_cpy_trademark.trademark_no
     *
     * @mbg.generated
     */
    public String getTrademarkNo() {
        return trademarkNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.trademark_no
     *
     * @param trademarkNo the value for t_cpy_trademark.trademark_no
     *
     * @mbg.generated
     */
    public void setTrademarkNo(String trademarkNo) {
        this.trademarkNo = trademarkNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.trademark_type
     *
     * @return the value of t_cpy_trademark.trademark_type
     *
     * @mbg.generated
     */
    public String getTrademarkType() {
        return trademarkType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.trademark_type
     *
     * @param trademarkType the value for t_cpy_trademark.trademark_type
     *
     * @mbg.generated
     */
    public void setTrademarkType(String trademarkType) {
        this.trademarkType = trademarkType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.apply_date
     *
     * @return the value of t_cpy_trademark.apply_date
     *
     * @mbg.generated
     */
    public LocalDate getApplyDate() {
        return applyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.apply_date
     *
     * @param applyDate the value for t_cpy_trademark.apply_date
     *
     * @mbg.generated
     */
    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.agency
     *
     * @return the value of t_cpy_trademark.agency
     *
     * @mbg.generated
     */
    public String getAgency() {
        return agency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.agency
     *
     * @param agency the value for t_cpy_trademark.agency
     *
     * @mbg.generated
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.is_have_reputed_trademark
     *
     * @return the value of t_cpy_trademark.is_have_reputed_trademark
     *
     * @mbg.generated
     */
    public String getIsHaveReputedTrademark() {
        return isHaveReputedTrademark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.is_have_reputed_trademark
     *
     * @param isHaveReputedTrademark the value for t_cpy_trademark.is_have_reputed_trademark
     *
     * @mbg.generated
     */
    public void setIsHaveReputedTrademark(String isHaveReputedTrademark) {
        this.isHaveReputedTrademark = isHaveReputedTrademark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.reputed_trademark
     *
     * @return the value of t_cpy_trademark.reputed_trademark
     *
     * @mbg.generated
     */
    public String getReputedTrademark() {
        return reputedTrademark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.reputed_trademark
     *
     * @param reputedTrademark the value for t_cpy_trademark.reputed_trademark
     *
     * @mbg.generated
     */
    public void setReputedTrademark(String reputedTrademark) {
        this.reputedTrademark = reputedTrademark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.create_person
     *
     * @return the value of t_cpy_trademark.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.create_person
     *
     * @param createPerson the value for t_cpy_trademark.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.create_time
     *
     * @return the value of t_cpy_trademark.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.create_time
     *
     * @param createTime the value for t_cpy_trademark.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.modify_person
     *
     * @return the value of t_cpy_trademark.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.modify_person
     *
     * @param modifyPerson the value for t_cpy_trademark.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.modify_time
     *
     * @return the value of t_cpy_trademark.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.modify_time
     *
     * @param modifyTime the value for t_cpy_trademark.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_trademark.data_resource
     *
     * @return the value of t_cpy_trademark.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_trademark.data_resource
     *
     * @param dataResource the value for t_cpy_trademark.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_trademark
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
        sb.append(", trademarkInfo=").append(trademarkInfo);
        sb.append(", trademarkPath=").append(trademarkPath);
        sb.append(", trademarkName=").append(trademarkName);
        sb.append(", trademarkStatus=").append(trademarkStatus);
        sb.append(", trademarkNo=").append(trademarkNo);
        sb.append(", trademarkType=").append(trademarkType);
        sb.append(", applyDate=").append(applyDate);
        sb.append(", agency=").append(agency);
        sb.append(", isHaveReputedTrademark=").append(isHaveReputedTrademark);
        sb.append(", reputedTrademark=").append(reputedTrademark);
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
     * This method corresponds to the database table t_cpy_trademark
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
        TCpyTrademark other = (TCpyTrademark) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getTrademarkInfo() == null ? other.getTrademarkInfo() == null : this.getTrademarkInfo().equals(other.getTrademarkInfo()))
            && (this.getTrademarkPath() == null ? other.getTrademarkPath() == null : this.getTrademarkPath().equals(other.getTrademarkPath()))
            && (this.getTrademarkName() == null ? other.getTrademarkName() == null : this.getTrademarkName().equals(other.getTrademarkName()))
            && (this.getTrademarkStatus() == null ? other.getTrademarkStatus() == null : this.getTrademarkStatus().equals(other.getTrademarkStatus()))
            && (this.getTrademarkNo() == null ? other.getTrademarkNo() == null : this.getTrademarkNo().equals(other.getTrademarkNo()))
            && (this.getTrademarkType() == null ? other.getTrademarkType() == null : this.getTrademarkType().equals(other.getTrademarkType()))
            && (this.getApplyDate() == null ? other.getApplyDate() == null : this.getApplyDate().equals(other.getApplyDate()))
            && (this.getAgency() == null ? other.getAgency() == null : this.getAgency().equals(other.getAgency()))
            && (this.getIsHaveReputedTrademark() == null ? other.getIsHaveReputedTrademark() == null : this.getIsHaveReputedTrademark().equals(other.getIsHaveReputedTrademark()))
            && (this.getReputedTrademark() == null ? other.getReputedTrademark() == null : this.getReputedTrademark().equals(other.getReputedTrademark()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_trademark
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getTrademarkInfo() == null) ? 0 : getTrademarkInfo().hashCode());
        result = prime * result + ((getTrademarkPath() == null) ? 0 : getTrademarkPath().hashCode());
        result = prime * result + ((getTrademarkName() == null) ? 0 : getTrademarkName().hashCode());
        result = prime * result + ((getTrademarkStatus() == null) ? 0 : getTrademarkStatus().hashCode());
        result = prime * result + ((getTrademarkNo() == null) ? 0 : getTrademarkNo().hashCode());
        result = prime * result + ((getTrademarkType() == null) ? 0 : getTrademarkType().hashCode());
        result = prime * result + ((getApplyDate() == null) ? 0 : getApplyDate().hashCode());
        result = prime * result + ((getAgency() == null) ? 0 : getAgency().hashCode());
        result = prime * result + ((getIsHaveReputedTrademark() == null) ? 0 : getIsHaveReputedTrademark().hashCode());
        result = prime * result + ((getReputedTrademark() == null) ? 0 : getReputedTrademark().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_trademark
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        trademarkInfo("trademark_info", "trademarkInfo", "VARCHAR", false),
        trademarkPath("trademark_path", "trademarkPath", "VARCHAR", false),
        trademarkName("trademark_name", "trademarkName", "VARCHAR", false),
        trademarkStatus("trademark_status", "trademarkStatus", "VARCHAR", false),
        trademarkNo("trademark_no", "trademarkNo", "VARCHAR", false),
        trademarkType("trademark_type", "trademarkType", "VARCHAR", false),
        applyDate("apply_date", "applyDate", "DATE", false),
        agency("agency", "agency", "VARCHAR", false),
        isHaveReputedTrademark("is_have_reputed_trademark", "isHaveReputedTrademark", "CHAR", false),
        reputedTrademark("reputed_trademark", "reputedTrademark", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_trademark
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
         * This method corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_trademark
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
         * This method corresponds to the database table t_cpy_trademark
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
         * This method corresponds to the database table t_cpy_trademark
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}