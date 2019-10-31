package com.huizhi.supplier.db.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyBackPayRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.arrears_str_time
     *
     * @mbg.generated
     */
    private LocalDate arrearsStrTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.arrears_end_time
     *
     * @mbg.generated
     */
    private LocalDate arrearsEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.arrears_total
     *
     * @mbg.generated
     */
    private BigDecimal arrearsTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.arrears_number
     *
     * @mbg.generated
     */
    private String arrearsNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.arrears_recording_authority
     *
     * @mbg.generated
     */
    private String arrearsRecordingAuthority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_back_pay_record.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.id
     *
     * @return the value of t_cpy_back_pay_record.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.id
     *
     * @param id the value for t_cpy_back_pay_record.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.company_id
     *
     * @return the value of t_cpy_back_pay_record.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.company_id
     *
     * @param companyId the value for t_cpy_back_pay_record.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.arrears_str_time
     *
     * @return the value of t_cpy_back_pay_record.arrears_str_time
     *
     * @mbg.generated
     */
    public LocalDate getArrearsStrTime() {
        return arrearsStrTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.arrears_str_time
     *
     * @param arrearsStrTime the value for t_cpy_back_pay_record.arrears_str_time
     *
     * @mbg.generated
     */
    public void setArrearsStrTime(LocalDate arrearsStrTime) {
        this.arrearsStrTime = arrearsStrTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.arrears_end_time
     *
     * @return the value of t_cpy_back_pay_record.arrears_end_time
     *
     * @mbg.generated
     */
    public LocalDate getArrearsEndTime() {
        return arrearsEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.arrears_end_time
     *
     * @param arrearsEndTime the value for t_cpy_back_pay_record.arrears_end_time
     *
     * @mbg.generated
     */
    public void setArrearsEndTime(LocalDate arrearsEndTime) {
        this.arrearsEndTime = arrearsEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.arrears_total
     *
     * @return the value of t_cpy_back_pay_record.arrears_total
     *
     * @mbg.generated
     */
    public BigDecimal getArrearsTotal() {
        return arrearsTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.arrears_total
     *
     * @param arrearsTotal the value for t_cpy_back_pay_record.arrears_total
     *
     * @mbg.generated
     */
    public void setArrearsTotal(BigDecimal arrearsTotal) {
        this.arrearsTotal = arrearsTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.arrears_number
     *
     * @return the value of t_cpy_back_pay_record.arrears_number
     *
     * @mbg.generated
     */
    public String getArrearsNumber() {
        return arrearsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.arrears_number
     *
     * @param arrearsNumber the value for t_cpy_back_pay_record.arrears_number
     *
     * @mbg.generated
     */
    public void setArrearsNumber(String arrearsNumber) {
        this.arrearsNumber = arrearsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.arrears_recording_authority
     *
     * @return the value of t_cpy_back_pay_record.arrears_recording_authority
     *
     * @mbg.generated
     */
    public String getArrearsRecordingAuthority() {
        return arrearsRecordingAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.arrears_recording_authority
     *
     * @param arrearsRecordingAuthority the value for t_cpy_back_pay_record.arrears_recording_authority
     *
     * @mbg.generated
     */
    public void setArrearsRecordingAuthority(String arrearsRecordingAuthority) {
        this.arrearsRecordingAuthority = arrearsRecordingAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.create_person
     *
     * @return the value of t_cpy_back_pay_record.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.create_person
     *
     * @param createPerson the value for t_cpy_back_pay_record.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.create_time
     *
     * @return the value of t_cpy_back_pay_record.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.create_time
     *
     * @param createTime the value for t_cpy_back_pay_record.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.modify_person
     *
     * @return the value of t_cpy_back_pay_record.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.modify_person
     *
     * @param modifyPerson the value for t_cpy_back_pay_record.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.modify_time
     *
     * @return the value of t_cpy_back_pay_record.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.modify_time
     *
     * @param modifyTime the value for t_cpy_back_pay_record.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_back_pay_record.data_resource
     *
     * @return the value of t_cpy_back_pay_record.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_back_pay_record.data_resource
     *
     * @param dataResource the value for t_cpy_back_pay_record.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_back_pay_record
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
        sb.append(", arrearsStrTime=").append(arrearsStrTime);
        sb.append(", arrearsEndTime=").append(arrearsEndTime);
        sb.append(", arrearsTotal=").append(arrearsTotal);
        sb.append(", arrearsNumber=").append(arrearsNumber);
        sb.append(", arrearsRecordingAuthority=").append(arrearsRecordingAuthority);
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
     * This method corresponds to the database table t_cpy_back_pay_record
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
        TCpyBackPayRecord other = (TCpyBackPayRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getArrearsStrTime() == null ? other.getArrearsStrTime() == null : this.getArrearsStrTime().equals(other.getArrearsStrTime()))
            && (this.getArrearsEndTime() == null ? other.getArrearsEndTime() == null : this.getArrearsEndTime().equals(other.getArrearsEndTime()))
            && (this.getArrearsTotal() == null ? other.getArrearsTotal() == null : this.getArrearsTotal().equals(other.getArrearsTotal()))
            && (this.getArrearsNumber() == null ? other.getArrearsNumber() == null : this.getArrearsNumber().equals(other.getArrearsNumber()))
            && (this.getArrearsRecordingAuthority() == null ? other.getArrearsRecordingAuthority() == null : this.getArrearsRecordingAuthority().equals(other.getArrearsRecordingAuthority()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_back_pay_record
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getArrearsStrTime() == null) ? 0 : getArrearsStrTime().hashCode());
        result = prime * result + ((getArrearsEndTime() == null) ? 0 : getArrearsEndTime().hashCode());
        result = prime * result + ((getArrearsTotal() == null) ? 0 : getArrearsTotal().hashCode());
        result = prime * result + ((getArrearsNumber() == null) ? 0 : getArrearsNumber().hashCode());
        result = prime * result + ((getArrearsRecordingAuthority() == null) ? 0 : getArrearsRecordingAuthority().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_back_pay_record
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        arrearsStrTime("arrears_str_time", "arrearsStrTime", "DATE", false),
        arrearsEndTime("arrears_end_time", "arrearsEndTime", "DATE", false),
        arrearsTotal("arrears_total", "arrearsTotal", "DECIMAL", false),
        arrearsNumber("arrears_number", "arrearsNumber", "VARCHAR", false),
        arrearsRecordingAuthority("arrears_recording_authority", "arrearsRecordingAuthority", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_back_pay_record
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
         * This method corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_back_pay_record
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
         * This method corresponds to the database table t_cpy_back_pay_record
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
         * This method corresponds to the database table t_cpy_back_pay_record
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}