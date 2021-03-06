package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyCorporateWelfare {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.social_security_type
     *
     * @mbg.generated
     */
    private String socialSecurityType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.social_security_number
     *
     * @mbg.generated
     */
    private Integer socialSecurityNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.social_security_certificate_path
     *
     * @mbg.generated
     */
    private String socialSecurityCertificatePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.is_by_rule_pay_social_insurance
     *
     * @mbg.generated
     */
    private String isByRulePaySocialInsurance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.is_have_safety_related_insurance
     *
     * @mbg.generated
     */
    private String isHaveSafetyRelatedInsurance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.labor_contract_number_of_people
     *
     * @mbg.generated
     */
    private String laborContractNumberOfPeople;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.provident_fund_personal
     *
     * @mbg.generated
     */
    private String providentFundPersonal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.provident_fund_unit
     *
     * @mbg.generated
     */
    private String providentFundUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.provident_fund_unit_status
     *
     * @mbg.generated
     */
    private String providentFundUnitStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_corporate_welfare.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.id
     *
     * @return the value of t_cpy_corporate_welfare.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.id
     *
     * @param id the value for t_cpy_corporate_welfare.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.company_id
     *
     * @return the value of t_cpy_corporate_welfare.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.company_id
     *
     * @param companyId the value for t_cpy_corporate_welfare.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.social_security_type
     *
     * @return the value of t_cpy_corporate_welfare.social_security_type
     *
     * @mbg.generated
     */
    public String getSocialSecurityType() {
        return socialSecurityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.social_security_type
     *
     * @param socialSecurityType the value for t_cpy_corporate_welfare.social_security_type
     *
     * @mbg.generated
     */
    public void setSocialSecurityType(String socialSecurityType) {
        this.socialSecurityType = socialSecurityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.social_security_number
     *
     * @return the value of t_cpy_corporate_welfare.social_security_number
     *
     * @mbg.generated
     */
    public Integer getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.social_security_number
     *
     * @param socialSecurityNumber the value for t_cpy_corporate_welfare.social_security_number
     *
     * @mbg.generated
     */
    public void setSocialSecurityNumber(Integer socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.social_security_certificate_path
     *
     * @return the value of t_cpy_corporate_welfare.social_security_certificate_path
     *
     * @mbg.generated
     */
    public String getSocialSecurityCertificatePath() {
        return socialSecurityCertificatePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.social_security_certificate_path
     *
     * @param socialSecurityCertificatePath the value for t_cpy_corporate_welfare.social_security_certificate_path
     *
     * @mbg.generated
     */
    public void setSocialSecurityCertificatePath(String socialSecurityCertificatePath) {
        this.socialSecurityCertificatePath = socialSecurityCertificatePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.is_by_rule_pay_social_insurance
     *
     * @return the value of t_cpy_corporate_welfare.is_by_rule_pay_social_insurance
     *
     * @mbg.generated
     */
    public String getIsByRulePaySocialInsurance() {
        return isByRulePaySocialInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.is_by_rule_pay_social_insurance
     *
     * @param isByRulePaySocialInsurance the value for t_cpy_corporate_welfare.is_by_rule_pay_social_insurance
     *
     * @mbg.generated
     */
    public void setIsByRulePaySocialInsurance(String isByRulePaySocialInsurance) {
        this.isByRulePaySocialInsurance = isByRulePaySocialInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.is_have_safety_related_insurance
     *
     * @return the value of t_cpy_corporate_welfare.is_have_safety_related_insurance
     *
     * @mbg.generated
     */
    public String getIsHaveSafetyRelatedInsurance() {
        return isHaveSafetyRelatedInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.is_have_safety_related_insurance
     *
     * @param isHaveSafetyRelatedInsurance the value for t_cpy_corporate_welfare.is_have_safety_related_insurance
     *
     * @mbg.generated
     */
    public void setIsHaveSafetyRelatedInsurance(String isHaveSafetyRelatedInsurance) {
        this.isHaveSafetyRelatedInsurance = isHaveSafetyRelatedInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.labor_contract_number_of_people
     *
     * @return the value of t_cpy_corporate_welfare.labor_contract_number_of_people
     *
     * @mbg.generated
     */
    public String getLaborContractNumberOfPeople() {
        return laborContractNumberOfPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.labor_contract_number_of_people
     *
     * @param laborContractNumberOfPeople the value for t_cpy_corporate_welfare.labor_contract_number_of_people
     *
     * @mbg.generated
     */
    public void setLaborContractNumberOfPeople(String laborContractNumberOfPeople) {
        this.laborContractNumberOfPeople = laborContractNumberOfPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.provident_fund_personal
     *
     * @return the value of t_cpy_corporate_welfare.provident_fund_personal
     *
     * @mbg.generated
     */
    public String getProvidentFundPersonal() {
        return providentFundPersonal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.provident_fund_personal
     *
     * @param providentFundPersonal the value for t_cpy_corporate_welfare.provident_fund_personal
     *
     * @mbg.generated
     */
    public void setProvidentFundPersonal(String providentFundPersonal) {
        this.providentFundPersonal = providentFundPersonal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.provident_fund_unit
     *
     * @return the value of t_cpy_corporate_welfare.provident_fund_unit
     *
     * @mbg.generated
     */
    public String getProvidentFundUnit() {
        return providentFundUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.provident_fund_unit
     *
     * @param providentFundUnit the value for t_cpy_corporate_welfare.provident_fund_unit
     *
     * @mbg.generated
     */
    public void setProvidentFundUnit(String providentFundUnit) {
        this.providentFundUnit = providentFundUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.provident_fund_unit_status
     *
     * @return the value of t_cpy_corporate_welfare.provident_fund_unit_status
     *
     * @mbg.generated
     */
    public String getProvidentFundUnitStatus() {
        return providentFundUnitStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.provident_fund_unit_status
     *
     * @param providentFundUnitStatus the value for t_cpy_corporate_welfare.provident_fund_unit_status
     *
     * @mbg.generated
     */
    public void setProvidentFundUnitStatus(String providentFundUnitStatus) {
        this.providentFundUnitStatus = providentFundUnitStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.create_person
     *
     * @return the value of t_cpy_corporate_welfare.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.create_person
     *
     * @param createPerson the value for t_cpy_corporate_welfare.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.create_time
     *
     * @return the value of t_cpy_corporate_welfare.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.create_time
     *
     * @param createTime the value for t_cpy_corporate_welfare.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.modify_person
     *
     * @return the value of t_cpy_corporate_welfare.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.modify_person
     *
     * @param modifyPerson the value for t_cpy_corporate_welfare.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.modify_time
     *
     * @return the value of t_cpy_corporate_welfare.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.modify_time
     *
     * @param modifyTime the value for t_cpy_corporate_welfare.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_corporate_welfare.data_resource
     *
     * @return the value of t_cpy_corporate_welfare.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_corporate_welfare.data_resource
     *
     * @param dataResource the value for t_cpy_corporate_welfare.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
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
        sb.append(", socialSecurityType=").append(socialSecurityType);
        sb.append(", socialSecurityNumber=").append(socialSecurityNumber);
        sb.append(", socialSecurityCertificatePath=").append(socialSecurityCertificatePath);
        sb.append(", isByRulePaySocialInsurance=").append(isByRulePaySocialInsurance);
        sb.append(", isHaveSafetyRelatedInsurance=").append(isHaveSafetyRelatedInsurance);
        sb.append(", laborContractNumberOfPeople=").append(laborContractNumberOfPeople);
        sb.append(", providentFundPersonal=").append(providentFundPersonal);
        sb.append(", providentFundUnit=").append(providentFundUnit);
        sb.append(", providentFundUnitStatus=").append(providentFundUnitStatus);
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
     * This method corresponds to the database table t_cpy_corporate_welfare
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
        TCpyCorporateWelfare other = (TCpyCorporateWelfare) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getSocialSecurityType() == null ? other.getSocialSecurityType() == null : this.getSocialSecurityType().equals(other.getSocialSecurityType()))
            && (this.getSocialSecurityNumber() == null ? other.getSocialSecurityNumber() == null : this.getSocialSecurityNumber().equals(other.getSocialSecurityNumber()))
            && (this.getSocialSecurityCertificatePath() == null ? other.getSocialSecurityCertificatePath() == null : this.getSocialSecurityCertificatePath().equals(other.getSocialSecurityCertificatePath()))
            && (this.getIsByRulePaySocialInsurance() == null ? other.getIsByRulePaySocialInsurance() == null : this.getIsByRulePaySocialInsurance().equals(other.getIsByRulePaySocialInsurance()))
            && (this.getIsHaveSafetyRelatedInsurance() == null ? other.getIsHaveSafetyRelatedInsurance() == null : this.getIsHaveSafetyRelatedInsurance().equals(other.getIsHaveSafetyRelatedInsurance()))
            && (this.getLaborContractNumberOfPeople() == null ? other.getLaborContractNumberOfPeople() == null : this.getLaborContractNumberOfPeople().equals(other.getLaborContractNumberOfPeople()))
            && (this.getProvidentFundPersonal() == null ? other.getProvidentFundPersonal() == null : this.getProvidentFundPersonal().equals(other.getProvidentFundPersonal()))
            && (this.getProvidentFundUnit() == null ? other.getProvidentFundUnit() == null : this.getProvidentFundUnit().equals(other.getProvidentFundUnit()))
            && (this.getProvidentFundUnitStatus() == null ? other.getProvidentFundUnitStatus() == null : this.getProvidentFundUnitStatus().equals(other.getProvidentFundUnitStatus()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getSocialSecurityType() == null) ? 0 : getSocialSecurityType().hashCode());
        result = prime * result + ((getSocialSecurityNumber() == null) ? 0 : getSocialSecurityNumber().hashCode());
        result = prime * result + ((getSocialSecurityCertificatePath() == null) ? 0 : getSocialSecurityCertificatePath().hashCode());
        result = prime * result + ((getIsByRulePaySocialInsurance() == null) ? 0 : getIsByRulePaySocialInsurance().hashCode());
        result = prime * result + ((getIsHaveSafetyRelatedInsurance() == null) ? 0 : getIsHaveSafetyRelatedInsurance().hashCode());
        result = prime * result + ((getLaborContractNumberOfPeople() == null) ? 0 : getLaborContractNumberOfPeople().hashCode());
        result = prime * result + ((getProvidentFundPersonal() == null) ? 0 : getProvidentFundPersonal().hashCode());
        result = prime * result + ((getProvidentFundUnit() == null) ? 0 : getProvidentFundUnit().hashCode());
        result = prime * result + ((getProvidentFundUnitStatus() == null) ? 0 : getProvidentFundUnitStatus().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        socialSecurityType("social_security_type", "socialSecurityType", "VARCHAR", false),
        socialSecurityNumber("social_security_number", "socialSecurityNumber", "INTEGER", false),
        socialSecurityCertificatePath("social_security_certificate_path", "socialSecurityCertificatePath", "VARCHAR", false),
        isByRulePaySocialInsurance("is_by_rule_pay_social_insurance", "isByRulePaySocialInsurance", "CHAR", false),
        isHaveSafetyRelatedInsurance("is_have_safety_related_insurance", "isHaveSafetyRelatedInsurance", "CHAR", false),
        laborContractNumberOfPeople("labor_contract_number_of_people", "laborContractNumberOfPeople", "VARCHAR", false),
        providentFundPersonal("provident_fund_personal", "providentFundPersonal", "VARCHAR", false),
        providentFundUnit("provident_fund_unit", "providentFundUnit", "VARCHAR", false),
        providentFundUnitStatus("provident_fund_unit_status", "providentFundUnitStatus", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_corporate_welfare
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
         * This method corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_corporate_welfare
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
         * This method corresponds to the database table t_cpy_corporate_welfare
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
         * This method corresponds to the database table t_cpy_corporate_welfare
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}