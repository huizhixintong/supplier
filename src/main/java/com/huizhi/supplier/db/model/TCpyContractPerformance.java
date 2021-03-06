package com.huizhi.supplier.db.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyContractPerformance {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.contract_no
     *
     * @mbg.generated
     */
    private String contractNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.contract_name
     *
     * @mbg.generated
     */
    private String contractName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.contract_unit
     *
     * @mbg.generated
     */
    private String contractUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.contract_start_date
     *
     * @mbg.generated
     */
    private LocalDate contractStartDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.contract_end_date
     *
     * @mbg.generated
     */
    private LocalDate contractEndDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.keep_situation
     *
     * @mbg.generated
     */
    private String keepSituation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.contract_amount
     *
     * @mbg.generated
     */
    private BigDecimal contractAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_contract_performance.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.id
     *
     * @return the value of t_cpy_contract_performance.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.id
     *
     * @param id the value for t_cpy_contract_performance.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.company_id
     *
     * @return the value of t_cpy_contract_performance.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.company_id
     *
     * @param companyId the value for t_cpy_contract_performance.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.contract_no
     *
     * @return the value of t_cpy_contract_performance.contract_no
     *
     * @mbg.generated
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.contract_no
     *
     * @param contractNo the value for t_cpy_contract_performance.contract_no
     *
     * @mbg.generated
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.contract_name
     *
     * @return the value of t_cpy_contract_performance.contract_name
     *
     * @mbg.generated
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.contract_name
     *
     * @param contractName the value for t_cpy_contract_performance.contract_name
     *
     * @mbg.generated
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.contract_unit
     *
     * @return the value of t_cpy_contract_performance.contract_unit
     *
     * @mbg.generated
     */
    public String getContractUnit() {
        return contractUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.contract_unit
     *
     * @param contractUnit the value for t_cpy_contract_performance.contract_unit
     *
     * @mbg.generated
     */
    public void setContractUnit(String contractUnit) {
        this.contractUnit = contractUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.contract_start_date
     *
     * @return the value of t_cpy_contract_performance.contract_start_date
     *
     * @mbg.generated
     */
    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.contract_start_date
     *
     * @param contractStartDate the value for t_cpy_contract_performance.contract_start_date
     *
     * @mbg.generated
     */
    public void setContractStartDate(LocalDate contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.contract_end_date
     *
     * @return the value of t_cpy_contract_performance.contract_end_date
     *
     * @mbg.generated
     */
    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.contract_end_date
     *
     * @param contractEndDate the value for t_cpy_contract_performance.contract_end_date
     *
     * @mbg.generated
     */
    public void setContractEndDate(LocalDate contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.keep_situation
     *
     * @return the value of t_cpy_contract_performance.keep_situation
     *
     * @mbg.generated
     */
    public String getKeepSituation() {
        return keepSituation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.keep_situation
     *
     * @param keepSituation the value for t_cpy_contract_performance.keep_situation
     *
     * @mbg.generated
     */
    public void setKeepSituation(String keepSituation) {
        this.keepSituation = keepSituation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.contract_amount
     *
     * @return the value of t_cpy_contract_performance.contract_amount
     *
     * @mbg.generated
     */
    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.contract_amount
     *
     * @param contractAmount the value for t_cpy_contract_performance.contract_amount
     *
     * @mbg.generated
     */
    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.create_person
     *
     * @return the value of t_cpy_contract_performance.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.create_person
     *
     * @param createPerson the value for t_cpy_contract_performance.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.create_time
     *
     * @return the value of t_cpy_contract_performance.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.create_time
     *
     * @param createTime the value for t_cpy_contract_performance.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.modify_person
     *
     * @return the value of t_cpy_contract_performance.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.modify_person
     *
     * @param modifyPerson the value for t_cpy_contract_performance.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.modify_time
     *
     * @return the value of t_cpy_contract_performance.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.modify_time
     *
     * @param modifyTime the value for t_cpy_contract_performance.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_contract_performance.data_resource
     *
     * @return the value of t_cpy_contract_performance.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_contract_performance.data_resource
     *
     * @param dataResource the value for t_cpy_contract_performance.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_contract_performance
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
        sb.append(", contractNo=").append(contractNo);
        sb.append(", contractName=").append(contractName);
        sb.append(", contractUnit=").append(contractUnit);
        sb.append(", contractStartDate=").append(contractStartDate);
        sb.append(", contractEndDate=").append(contractEndDate);
        sb.append(", keepSituation=").append(keepSituation);
        sb.append(", contractAmount=").append(contractAmount);
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
     * This method corresponds to the database table t_cpy_contract_performance
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
        TCpyContractPerformance other = (TCpyContractPerformance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getContractNo() == null ? other.getContractNo() == null : this.getContractNo().equals(other.getContractNo()))
            && (this.getContractName() == null ? other.getContractName() == null : this.getContractName().equals(other.getContractName()))
            && (this.getContractUnit() == null ? other.getContractUnit() == null : this.getContractUnit().equals(other.getContractUnit()))
            && (this.getContractStartDate() == null ? other.getContractStartDate() == null : this.getContractStartDate().equals(other.getContractStartDate()))
            && (this.getContractEndDate() == null ? other.getContractEndDate() == null : this.getContractEndDate().equals(other.getContractEndDate()))
            && (this.getKeepSituation() == null ? other.getKeepSituation() == null : this.getKeepSituation().equals(other.getKeepSituation()))
            && (this.getContractAmount() == null ? other.getContractAmount() == null : this.getContractAmount().equals(other.getContractAmount()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_contract_performance
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getContractNo() == null) ? 0 : getContractNo().hashCode());
        result = prime * result + ((getContractName() == null) ? 0 : getContractName().hashCode());
        result = prime * result + ((getContractUnit() == null) ? 0 : getContractUnit().hashCode());
        result = prime * result + ((getContractStartDate() == null) ? 0 : getContractStartDate().hashCode());
        result = prime * result + ((getContractEndDate() == null) ? 0 : getContractEndDate().hashCode());
        result = prime * result + ((getKeepSituation() == null) ? 0 : getKeepSituation().hashCode());
        result = prime * result + ((getContractAmount() == null) ? 0 : getContractAmount().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_contract_performance
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        contractNo("contract_no", "contractNo", "VARCHAR", false),
        contractName("contract_name", "contractName", "VARCHAR", false),
        contractUnit("contract_unit", "contractUnit", "VARCHAR", false),
        contractStartDate("contract_start_date", "contractStartDate", "DATE", false),
        contractEndDate("contract_end_date", "contractEndDate", "DATE", false),
        keepSituation("keep_situation", "keepSituation", "VARCHAR", false),
        contractAmount("contract_amount", "contractAmount", "DECIMAL", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_contract_performance
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
         * This method corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_contract_performance
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
         * This method corresponds to the database table t_cpy_contract_performance
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
         * This method corresponds to the database table t_cpy_contract_performance
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}