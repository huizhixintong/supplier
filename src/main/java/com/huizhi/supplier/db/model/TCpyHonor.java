package com.huizhi.supplier.db.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyHonor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.honorary_certificate_type
     *
     * @mbg.generated
     */
    private String honoraryCertificateType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.honorary_certificate_name
     *
     * @mbg.generated
     */
    private String honoraryCertificateName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.honorary_certificate_number
     *
     * @mbg.generated
     */
    private String honoraryCertificateNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.honorary_impower_date
     *
     * @mbg.generated
     */
    private LocalDate honoraryImpowerDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.honorary_certificate_path
     *
     * @mbg.generated
     */
    private String honoraryCertificatePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.honorary_mechanism
     *
     * @mbg.generated
     */
    private String honoraryMechanism;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.honor_gainer_category
     *
     * @mbg.generated
     */
    private String honorGainerCategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_honor.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.id
     *
     * @return the value of t_cpy_honor.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.id
     *
     * @param id the value for t_cpy_honor.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.company_id
     *
     * @return the value of t_cpy_honor.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.company_id
     *
     * @param companyId the value for t_cpy_honor.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.honorary_certificate_type
     *
     * @return the value of t_cpy_honor.honorary_certificate_type
     *
     * @mbg.generated
     */
    public String getHonoraryCertificateType() {
        return honoraryCertificateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.honorary_certificate_type
     *
     * @param honoraryCertificateType the value for t_cpy_honor.honorary_certificate_type
     *
     * @mbg.generated
     */
    public void setHonoraryCertificateType(String honoraryCertificateType) {
        this.honoraryCertificateType = honoraryCertificateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.honorary_certificate_name
     *
     * @return the value of t_cpy_honor.honorary_certificate_name
     *
     * @mbg.generated
     */
    public String getHonoraryCertificateName() {
        return honoraryCertificateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.honorary_certificate_name
     *
     * @param honoraryCertificateName the value for t_cpy_honor.honorary_certificate_name
     *
     * @mbg.generated
     */
    public void setHonoraryCertificateName(String honoraryCertificateName) {
        this.honoraryCertificateName = honoraryCertificateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.honorary_certificate_number
     *
     * @return the value of t_cpy_honor.honorary_certificate_number
     *
     * @mbg.generated
     */
    public String getHonoraryCertificateNumber() {
        return honoraryCertificateNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.honorary_certificate_number
     *
     * @param honoraryCertificateNumber the value for t_cpy_honor.honorary_certificate_number
     *
     * @mbg.generated
     */
    public void setHonoraryCertificateNumber(String honoraryCertificateNumber) {
        this.honoraryCertificateNumber = honoraryCertificateNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.honorary_impower_date
     *
     * @return the value of t_cpy_honor.honorary_impower_date
     *
     * @mbg.generated
     */
    public LocalDate getHonoraryImpowerDate() {
        return honoraryImpowerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.honorary_impower_date
     *
     * @param honoraryImpowerDate the value for t_cpy_honor.honorary_impower_date
     *
     * @mbg.generated
     */
    public void setHonoraryImpowerDate(LocalDate honoraryImpowerDate) {
        this.honoraryImpowerDate = honoraryImpowerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.honorary_certificate_path
     *
     * @return the value of t_cpy_honor.honorary_certificate_path
     *
     * @mbg.generated
     */
    public String getHonoraryCertificatePath() {
        return honoraryCertificatePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.honorary_certificate_path
     *
     * @param honoraryCertificatePath the value for t_cpy_honor.honorary_certificate_path
     *
     * @mbg.generated
     */
    public void setHonoraryCertificatePath(String honoraryCertificatePath) {
        this.honoraryCertificatePath = honoraryCertificatePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.honorary_mechanism
     *
     * @return the value of t_cpy_honor.honorary_mechanism
     *
     * @mbg.generated
     */
    public String getHonoraryMechanism() {
        return honoraryMechanism;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.honorary_mechanism
     *
     * @param honoraryMechanism the value for t_cpy_honor.honorary_mechanism
     *
     * @mbg.generated
     */
    public void setHonoraryMechanism(String honoraryMechanism) {
        this.honoraryMechanism = honoraryMechanism;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.honor_gainer_category
     *
     * @return the value of t_cpy_honor.honor_gainer_category
     *
     * @mbg.generated
     */
    public String getHonorGainerCategory() {
        return honorGainerCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.honor_gainer_category
     *
     * @param honorGainerCategory the value for t_cpy_honor.honor_gainer_category
     *
     * @mbg.generated
     */
    public void setHonorGainerCategory(String honorGainerCategory) {
        this.honorGainerCategory = honorGainerCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.create_person
     *
     * @return the value of t_cpy_honor.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.create_person
     *
     * @param createPerson the value for t_cpy_honor.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.create_time
     *
     * @return the value of t_cpy_honor.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.create_time
     *
     * @param createTime the value for t_cpy_honor.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.modify_person
     *
     * @return the value of t_cpy_honor.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.modify_person
     *
     * @param modifyPerson the value for t_cpy_honor.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.modify_time
     *
     * @return the value of t_cpy_honor.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.modify_time
     *
     * @param modifyTime the value for t_cpy_honor.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_honor.data_resource
     *
     * @return the value of t_cpy_honor.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_honor.data_resource
     *
     * @param dataResource the value for t_cpy_honor.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_honor
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
        sb.append(", honoraryCertificateType=").append(honoraryCertificateType);
        sb.append(", honoraryCertificateName=").append(honoraryCertificateName);
        sb.append(", honoraryCertificateNumber=").append(honoraryCertificateNumber);
        sb.append(", honoraryImpowerDate=").append(honoraryImpowerDate);
        sb.append(", honoraryCertificatePath=").append(honoraryCertificatePath);
        sb.append(", honoraryMechanism=").append(honoraryMechanism);
        sb.append(", honorGainerCategory=").append(honorGainerCategory);
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
     * This method corresponds to the database table t_cpy_honor
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
        TCpyHonor other = (TCpyHonor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getHonoraryCertificateType() == null ? other.getHonoraryCertificateType() == null : this.getHonoraryCertificateType().equals(other.getHonoraryCertificateType()))
            && (this.getHonoraryCertificateName() == null ? other.getHonoraryCertificateName() == null : this.getHonoraryCertificateName().equals(other.getHonoraryCertificateName()))
            && (this.getHonoraryCertificateNumber() == null ? other.getHonoraryCertificateNumber() == null : this.getHonoraryCertificateNumber().equals(other.getHonoraryCertificateNumber()))
            && (this.getHonoraryImpowerDate() == null ? other.getHonoraryImpowerDate() == null : this.getHonoraryImpowerDate().equals(other.getHonoraryImpowerDate()))
            && (this.getHonoraryCertificatePath() == null ? other.getHonoraryCertificatePath() == null : this.getHonoraryCertificatePath().equals(other.getHonoraryCertificatePath()))
            && (this.getHonoraryMechanism() == null ? other.getHonoraryMechanism() == null : this.getHonoraryMechanism().equals(other.getHonoraryMechanism()))
            && (this.getHonorGainerCategory() == null ? other.getHonorGainerCategory() == null : this.getHonorGainerCategory().equals(other.getHonorGainerCategory()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_honor
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getHonoraryCertificateType() == null) ? 0 : getHonoraryCertificateType().hashCode());
        result = prime * result + ((getHonoraryCertificateName() == null) ? 0 : getHonoraryCertificateName().hashCode());
        result = prime * result + ((getHonoraryCertificateNumber() == null) ? 0 : getHonoraryCertificateNumber().hashCode());
        result = prime * result + ((getHonoraryImpowerDate() == null) ? 0 : getHonoraryImpowerDate().hashCode());
        result = prime * result + ((getHonoraryCertificatePath() == null) ? 0 : getHonoraryCertificatePath().hashCode());
        result = prime * result + ((getHonoraryMechanism() == null) ? 0 : getHonoraryMechanism().hashCode());
        result = prime * result + ((getHonorGainerCategory() == null) ? 0 : getHonorGainerCategory().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_honor
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        honoraryCertificateType("honorary_certificate_type", "honoraryCertificateType", "VARCHAR", false),
        honoraryCertificateName("honorary_certificate_name", "honoraryCertificateName", "VARCHAR", false),
        honoraryCertificateNumber("honorary_certificate_number", "honoraryCertificateNumber", "VARCHAR", false),
        honoraryImpowerDate("honorary_impower_date", "honoraryImpowerDate", "DATE", false),
        honoraryCertificatePath("honorary_certificate_path", "honoraryCertificatePath", "VARCHAR", false),
        honoraryMechanism("honorary_mechanism", "honoraryMechanism", "VARCHAR", false),
        honorGainerCategory("honor_gainer_category", "honorGainerCategory", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_honor
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
         * This method corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_honor
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
         * This method corresponds to the database table t_cpy_honor
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
         * This method corresponds to the database table t_cpy_honor
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}