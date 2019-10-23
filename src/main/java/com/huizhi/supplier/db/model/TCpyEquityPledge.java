package com.huizhi.supplier.db.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyEquityPledge {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.pledgor
     *
     * @mbg.generated
     */
    private String pledgor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.quality_target
     *
     * @mbg.generated
     */
    private String qualityTarget;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.amount_of_pledged_equity
     *
     * @mbg.generated
     */
    private String amountOfPledgedEquity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.cancellation_reason
     *
     * @mbg.generated
     */
    private String cancellationReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.logout_date
     *
     * @mbg.generated
     */
    private LocalDateTime logoutDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.pledged_equity_company
     *
     * @mbg.generated
     */
    private String pledgedEquityCompany;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.registration_date
     *
     * @mbg.generated
     */
    private LocalDate registrationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.registration_number
     *
     * @mbg.generated
     */
    private String registrationNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.pledgee
     *
     * @mbg.generated
     */
    private String pledgee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_equity_pledge.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.id
     *
     * @return the value of t_cpy_equity_pledge.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.id
     *
     * @param id the value for t_cpy_equity_pledge.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.company_id
     *
     * @return the value of t_cpy_equity_pledge.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.company_id
     *
     * @param companyId the value for t_cpy_equity_pledge.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.pledgor
     *
     * @return the value of t_cpy_equity_pledge.pledgor
     *
     * @mbg.generated
     */
    public String getPledgor() {
        return pledgor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.pledgor
     *
     * @param pledgor the value for t_cpy_equity_pledge.pledgor
     *
     * @mbg.generated
     */
    public void setPledgor(String pledgor) {
        this.pledgor = pledgor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.quality_target
     *
     * @return the value of t_cpy_equity_pledge.quality_target
     *
     * @mbg.generated
     */
    public String getQualityTarget() {
        return qualityTarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.quality_target
     *
     * @param qualityTarget the value for t_cpy_equity_pledge.quality_target
     *
     * @mbg.generated
     */
    public void setQualityTarget(String qualityTarget) {
        this.qualityTarget = qualityTarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.remarks
     *
     * @return the value of t_cpy_equity_pledge.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.remarks
     *
     * @param remarks the value for t_cpy_equity_pledge.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.amount_of_pledged_equity
     *
     * @return the value of t_cpy_equity_pledge.amount_of_pledged_equity
     *
     * @mbg.generated
     */
    public String getAmountOfPledgedEquity() {
        return amountOfPledgedEquity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.amount_of_pledged_equity
     *
     * @param amountOfPledgedEquity the value for t_cpy_equity_pledge.amount_of_pledged_equity
     *
     * @mbg.generated
     */
    public void setAmountOfPledgedEquity(String amountOfPledgedEquity) {
        this.amountOfPledgedEquity = amountOfPledgedEquity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.cancellation_reason
     *
     * @return the value of t_cpy_equity_pledge.cancellation_reason
     *
     * @mbg.generated
     */
    public String getCancellationReason() {
        return cancellationReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.cancellation_reason
     *
     * @param cancellationReason the value for t_cpy_equity_pledge.cancellation_reason
     *
     * @mbg.generated
     */
    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.logout_date
     *
     * @return the value of t_cpy_equity_pledge.logout_date
     *
     * @mbg.generated
     */
    public LocalDateTime getLogoutDate() {
        return logoutDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.logout_date
     *
     * @param logoutDate the value for t_cpy_equity_pledge.logout_date
     *
     * @mbg.generated
     */
    public void setLogoutDate(LocalDateTime logoutDate) {
        this.logoutDate = logoutDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.status
     *
     * @return the value of t_cpy_equity_pledge.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.status
     *
     * @param status the value for t_cpy_equity_pledge.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.pledged_equity_company
     *
     * @return the value of t_cpy_equity_pledge.pledged_equity_company
     *
     * @mbg.generated
     */
    public String getPledgedEquityCompany() {
        return pledgedEquityCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.pledged_equity_company
     *
     * @param pledgedEquityCompany the value for t_cpy_equity_pledge.pledged_equity_company
     *
     * @mbg.generated
     */
    public void setPledgedEquityCompany(String pledgedEquityCompany) {
        this.pledgedEquityCompany = pledgedEquityCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.registration_date
     *
     * @return the value of t_cpy_equity_pledge.registration_date
     *
     * @mbg.generated
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.registration_date
     *
     * @param registrationDate the value for t_cpy_equity_pledge.registration_date
     *
     * @mbg.generated
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.registration_number
     *
     * @return the value of t_cpy_equity_pledge.registration_number
     *
     * @mbg.generated
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.registration_number
     *
     * @param registrationNumber the value for t_cpy_equity_pledge.registration_number
     *
     * @mbg.generated
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.pledgee
     *
     * @return the value of t_cpy_equity_pledge.pledgee
     *
     * @mbg.generated
     */
    public String getPledgee() {
        return pledgee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.pledgee
     *
     * @param pledgee the value for t_cpy_equity_pledge.pledgee
     *
     * @mbg.generated
     */
    public void setPledgee(String pledgee) {
        this.pledgee = pledgee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.create_person
     *
     * @return the value of t_cpy_equity_pledge.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.create_person
     *
     * @param createPerson the value for t_cpy_equity_pledge.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.create_time
     *
     * @return the value of t_cpy_equity_pledge.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.create_time
     *
     * @param createTime the value for t_cpy_equity_pledge.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.modify_person
     *
     * @return the value of t_cpy_equity_pledge.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.modify_person
     *
     * @param modifyPerson the value for t_cpy_equity_pledge.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.modify_time
     *
     * @return the value of t_cpy_equity_pledge.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.modify_time
     *
     * @param modifyTime the value for t_cpy_equity_pledge.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_equity_pledge.data_resource
     *
     * @return the value of t_cpy_equity_pledge.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_equity_pledge.data_resource
     *
     * @param dataResource the value for t_cpy_equity_pledge.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_equity_pledge
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
        sb.append(", pledgor=").append(pledgor);
        sb.append(", qualityTarget=").append(qualityTarget);
        sb.append(", remarks=").append(remarks);
        sb.append(", amountOfPledgedEquity=").append(amountOfPledgedEquity);
        sb.append(", cancellationReason=").append(cancellationReason);
        sb.append(", logoutDate=").append(logoutDate);
        sb.append(", status=").append(status);
        sb.append(", pledgedEquityCompany=").append(pledgedEquityCompany);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", registrationNumber=").append(registrationNumber);
        sb.append(", pledgee=").append(pledgee);
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
     * This method corresponds to the database table t_cpy_equity_pledge
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
        TCpyEquityPledge other = (TCpyEquityPledge) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getPledgor() == null ? other.getPledgor() == null : this.getPledgor().equals(other.getPledgor()))
            && (this.getQualityTarget() == null ? other.getQualityTarget() == null : this.getQualityTarget().equals(other.getQualityTarget()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getAmountOfPledgedEquity() == null ? other.getAmountOfPledgedEquity() == null : this.getAmountOfPledgedEquity().equals(other.getAmountOfPledgedEquity()))
            && (this.getCancellationReason() == null ? other.getCancellationReason() == null : this.getCancellationReason().equals(other.getCancellationReason()))
            && (this.getLogoutDate() == null ? other.getLogoutDate() == null : this.getLogoutDate().equals(other.getLogoutDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPledgedEquityCompany() == null ? other.getPledgedEquityCompany() == null : this.getPledgedEquityCompany().equals(other.getPledgedEquityCompany()))
            && (this.getRegistrationDate() == null ? other.getRegistrationDate() == null : this.getRegistrationDate().equals(other.getRegistrationDate()))
            && (this.getRegistrationNumber() == null ? other.getRegistrationNumber() == null : this.getRegistrationNumber().equals(other.getRegistrationNumber()))
            && (this.getPledgee() == null ? other.getPledgee() == null : this.getPledgee().equals(other.getPledgee()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_equity_pledge
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getPledgor() == null) ? 0 : getPledgor().hashCode());
        result = prime * result + ((getQualityTarget() == null) ? 0 : getQualityTarget().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getAmountOfPledgedEquity() == null) ? 0 : getAmountOfPledgedEquity().hashCode());
        result = prime * result + ((getCancellationReason() == null) ? 0 : getCancellationReason().hashCode());
        result = prime * result + ((getLogoutDate() == null) ? 0 : getLogoutDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPledgedEquityCompany() == null) ? 0 : getPledgedEquityCompany().hashCode());
        result = prime * result + ((getRegistrationDate() == null) ? 0 : getRegistrationDate().hashCode());
        result = prime * result + ((getRegistrationNumber() == null) ? 0 : getRegistrationNumber().hashCode());
        result = prime * result + ((getPledgee() == null) ? 0 : getPledgee().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_equity_pledge
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "VARCHAR", false),
        companyId("company_id", "companyId", "VARCHAR", false),
        pledgor("pledgor", "pledgor", "VARCHAR", false),
        qualityTarget("quality_target", "qualityTarget", "VARCHAR", false),
        remarks("remarks", "remarks", "VARCHAR", false),
        amountOfPledgedEquity("amount_of_pledged_equity", "amountOfPledgedEquity", "VARCHAR", false),
        cancellationReason("cancellation_reason", "cancellationReason", "VARCHAR", false),
        logoutDate("logout_date", "logoutDate", "TIMESTAMP", false),
        status("status", "status", "VARCHAR", true),
        pledgedEquityCompany("pledged_equity_company", "pledgedEquityCompany", "VARCHAR", false),
        registrationDate("registration_date", "registrationDate", "DATE", false),
        registrationNumber("registration_number", "registrationNumber", "VARCHAR", false),
        pledgee("pledgee", "pledgee", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_equity_pledge
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
         * This method corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_equity_pledge
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
         * This method corresponds to the database table t_cpy_equity_pledge
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
         * This method corresponds to the database table t_cpy_equity_pledge
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}