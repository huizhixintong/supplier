package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyTaxLevel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.main_tax_org
     *
     * @mbg.generated
     */
    private String mainTaxOrg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.tax_grade
     *
     * @mbg.generated
     */
    private String taxGrade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.rating_org
     *
     * @mbg.generated
     */
    private String ratingOrg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.evaluation_year
     *
     * @mbg.generated
     */
    private String evaluationYear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.taxpayer_number
     *
     * @mbg.generated
     */
    private String taxpayerNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.taxpayer_qualification
     *
     * @mbg.generated
     */
    private String taxpayerQualification;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_tax_level.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.id
     *
     * @return the value of t_cpy_tax_level.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.id
     *
     * @param id the value for t_cpy_tax_level.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.company_id
     *
     * @return the value of t_cpy_tax_level.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.company_id
     *
     * @param companyId the value for t_cpy_tax_level.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.main_tax_org
     *
     * @return the value of t_cpy_tax_level.main_tax_org
     *
     * @mbg.generated
     */
    public String getMainTaxOrg() {
        return mainTaxOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.main_tax_org
     *
     * @param mainTaxOrg the value for t_cpy_tax_level.main_tax_org
     *
     * @mbg.generated
     */
    public void setMainTaxOrg(String mainTaxOrg) {
        this.mainTaxOrg = mainTaxOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.tax_grade
     *
     * @return the value of t_cpy_tax_level.tax_grade
     *
     * @mbg.generated
     */
    public String getTaxGrade() {
        return taxGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.tax_grade
     *
     * @param taxGrade the value for t_cpy_tax_level.tax_grade
     *
     * @mbg.generated
     */
    public void setTaxGrade(String taxGrade) {
        this.taxGrade = taxGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.rating_org
     *
     * @return the value of t_cpy_tax_level.rating_org
     *
     * @mbg.generated
     */
    public String getRatingOrg() {
        return ratingOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.rating_org
     *
     * @param ratingOrg the value for t_cpy_tax_level.rating_org
     *
     * @mbg.generated
     */
    public void setRatingOrg(String ratingOrg) {
        this.ratingOrg = ratingOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.evaluation_year
     *
     * @return the value of t_cpy_tax_level.evaluation_year
     *
     * @mbg.generated
     */
    public String getEvaluationYear() {
        return evaluationYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.evaluation_year
     *
     * @param evaluationYear the value for t_cpy_tax_level.evaluation_year
     *
     * @mbg.generated
     */
    public void setEvaluationYear(String evaluationYear) {
        this.evaluationYear = evaluationYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.taxpayer_number
     *
     * @return the value of t_cpy_tax_level.taxpayer_number
     *
     * @mbg.generated
     */
    public String getTaxpayerNumber() {
        return taxpayerNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.taxpayer_number
     *
     * @param taxpayerNumber the value for t_cpy_tax_level.taxpayer_number
     *
     * @mbg.generated
     */
    public void setTaxpayerNumber(String taxpayerNumber) {
        this.taxpayerNumber = taxpayerNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.taxpayer_qualification
     *
     * @return the value of t_cpy_tax_level.taxpayer_qualification
     *
     * @mbg.generated
     */
    public String getTaxpayerQualification() {
        return taxpayerQualification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.taxpayer_qualification
     *
     * @param taxpayerQualification the value for t_cpy_tax_level.taxpayer_qualification
     *
     * @mbg.generated
     */
    public void setTaxpayerQualification(String taxpayerQualification) {
        this.taxpayerQualification = taxpayerQualification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.create_person
     *
     * @return the value of t_cpy_tax_level.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.create_person
     *
     * @param createPerson the value for t_cpy_tax_level.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.create_time
     *
     * @return the value of t_cpy_tax_level.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.create_time
     *
     * @param createTime the value for t_cpy_tax_level.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.modify_person
     *
     * @return the value of t_cpy_tax_level.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.modify_person
     *
     * @param modifyPerson the value for t_cpy_tax_level.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.modify_time
     *
     * @return the value of t_cpy_tax_level.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.modify_time
     *
     * @param modifyTime the value for t_cpy_tax_level.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_tax_level.data_resource
     *
     * @return the value of t_cpy_tax_level.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_tax_level.data_resource
     *
     * @param dataResource the value for t_cpy_tax_level.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_tax_level
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
        sb.append(", mainTaxOrg=").append(mainTaxOrg);
        sb.append(", taxGrade=").append(taxGrade);
        sb.append(", ratingOrg=").append(ratingOrg);
        sb.append(", evaluationYear=").append(evaluationYear);
        sb.append(", taxpayerNumber=").append(taxpayerNumber);
        sb.append(", taxpayerQualification=").append(taxpayerQualification);
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
     * This method corresponds to the database table t_cpy_tax_level
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
        TCpyTaxLevel other = (TCpyTaxLevel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getMainTaxOrg() == null ? other.getMainTaxOrg() == null : this.getMainTaxOrg().equals(other.getMainTaxOrg()))
            && (this.getTaxGrade() == null ? other.getTaxGrade() == null : this.getTaxGrade().equals(other.getTaxGrade()))
            && (this.getRatingOrg() == null ? other.getRatingOrg() == null : this.getRatingOrg().equals(other.getRatingOrg()))
            && (this.getEvaluationYear() == null ? other.getEvaluationYear() == null : this.getEvaluationYear().equals(other.getEvaluationYear()))
            && (this.getTaxpayerNumber() == null ? other.getTaxpayerNumber() == null : this.getTaxpayerNumber().equals(other.getTaxpayerNumber()))
            && (this.getTaxpayerQualification() == null ? other.getTaxpayerQualification() == null : this.getTaxpayerQualification().equals(other.getTaxpayerQualification()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_tax_level
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getMainTaxOrg() == null) ? 0 : getMainTaxOrg().hashCode());
        result = prime * result + ((getTaxGrade() == null) ? 0 : getTaxGrade().hashCode());
        result = prime * result + ((getRatingOrg() == null) ? 0 : getRatingOrg().hashCode());
        result = prime * result + ((getEvaluationYear() == null) ? 0 : getEvaluationYear().hashCode());
        result = prime * result + ((getTaxpayerNumber() == null) ? 0 : getTaxpayerNumber().hashCode());
        result = prime * result + ((getTaxpayerQualification() == null) ? 0 : getTaxpayerQualification().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_tax_level
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        mainTaxOrg("main_tax_org", "mainTaxOrg", "VARCHAR", false),
        taxGrade("tax_grade", "taxGrade", "VARCHAR", false),
        ratingOrg("rating_org", "ratingOrg", "VARCHAR", false),
        evaluationYear("evaluation_year", "evaluationYear", "VARCHAR", false),
        taxpayerNumber("taxpayer_number", "taxpayerNumber", "VARCHAR", false),
        taxpayerQualification("taxpayer_qualification", "taxpayerQualification", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_tax_level
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
         * This method corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_tax_level
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
         * This method corresponds to the database table t_cpy_tax_level
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
         * This method corresponds to the database table t_cpy_tax_level
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}