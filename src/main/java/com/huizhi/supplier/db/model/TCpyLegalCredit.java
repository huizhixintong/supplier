package com.huizhi.supplier.db.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyLegalCredit {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.violated_number
     *
     * @mbg.generated
     */
    private Integer violatedNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.violated_money
     *
     * @mbg.generated
     */
    private BigDecimal violatedMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.legal_credit
     *
     * @mbg.generated
     */
    private String legalCredit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_credit.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.id
     *
     * @return the value of t_cpy_legal_credit.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.id
     *
     * @param id the value for t_cpy_legal_credit.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.company_id
     *
     * @return the value of t_cpy_legal_credit.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.company_id
     *
     * @param companyId the value for t_cpy_legal_credit.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.violated_number
     *
     * @return the value of t_cpy_legal_credit.violated_number
     *
     * @mbg.generated
     */
    public Integer getViolatedNumber() {
        return violatedNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.violated_number
     *
     * @param violatedNumber the value for t_cpy_legal_credit.violated_number
     *
     * @mbg.generated
     */
    public void setViolatedNumber(Integer violatedNumber) {
        this.violatedNumber = violatedNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.violated_money
     *
     * @return the value of t_cpy_legal_credit.violated_money
     *
     * @mbg.generated
     */
    public BigDecimal getViolatedMoney() {
        return violatedMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.violated_money
     *
     * @param violatedMoney the value for t_cpy_legal_credit.violated_money
     *
     * @mbg.generated
     */
    public void setViolatedMoney(BigDecimal violatedMoney) {
        this.violatedMoney = violatedMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.legal_credit
     *
     * @return the value of t_cpy_legal_credit.legal_credit
     *
     * @mbg.generated
     */
    public String getLegalCredit() {
        return legalCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.legal_credit
     *
     * @param legalCredit the value for t_cpy_legal_credit.legal_credit
     *
     * @mbg.generated
     */
    public void setLegalCredit(String legalCredit) {
        this.legalCredit = legalCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.create_person
     *
     * @return the value of t_cpy_legal_credit.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.create_person
     *
     * @param createPerson the value for t_cpy_legal_credit.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.create_time
     *
     * @return the value of t_cpy_legal_credit.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.create_time
     *
     * @param createTime the value for t_cpy_legal_credit.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.modify_person
     *
     * @return the value of t_cpy_legal_credit.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.modify_person
     *
     * @param modifyPerson the value for t_cpy_legal_credit.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.modify_time
     *
     * @return the value of t_cpy_legal_credit.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.modify_time
     *
     * @param modifyTime the value for t_cpy_legal_credit.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_credit.data_resource
     *
     * @return the value of t_cpy_legal_credit.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_credit.data_resource
     *
     * @param dataResource the value for t_cpy_legal_credit.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
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
        sb.append(", violatedNumber=").append(violatedNumber);
        sb.append(", violatedMoney=").append(violatedMoney);
        sb.append(", legalCredit=").append(legalCredit);
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
     * This method corresponds to the database table t_cpy_legal_credit
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
        TCpyLegalCredit other = (TCpyLegalCredit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getViolatedNumber() == null ? other.getViolatedNumber() == null : this.getViolatedNumber().equals(other.getViolatedNumber()))
            && (this.getViolatedMoney() == null ? other.getViolatedMoney() == null : this.getViolatedMoney().equals(other.getViolatedMoney()))
            && (this.getLegalCredit() == null ? other.getLegalCredit() == null : this.getLegalCredit().equals(other.getLegalCredit()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getViolatedNumber() == null) ? 0 : getViolatedNumber().hashCode());
        result = prime * result + ((getViolatedMoney() == null) ? 0 : getViolatedMoney().hashCode());
        result = prime * result + ((getLegalCredit() == null) ? 0 : getLegalCredit().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        violatedNumber("violated_number", "violatedNumber", "INTEGER", false),
        violatedMoney("violated_money", "violatedMoney", "DECIMAL", false),
        legalCredit("legal_credit", "legalCredit", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_credit
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
         * This method corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_credit
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
         * This method corresponds to the database table t_cpy_legal_credit
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
         * This method corresponds to the database table t_cpy_legal_credit
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}