package com.huizhi.supplier.db.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyDiscreditExecutor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.executor_name
     *
     * @mbg.generated
     */
    private String executorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.identity_number
     *
     * @mbg.generated
     */
    private String identityNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.org_code
     *
     * @mbg.generated
     */
    private String orgCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.responsible_name
     *
     * @mbg.generated
     */
    private String responsibleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.performance_of_the_executor
     *
     * @mbg.generated
     */
    private String performanceOfTheExecutor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.execution_based_unit
     *
     * @mbg.generated
     */
    private String executionBasedUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.execution_court
     *
     * @mbg.generated
     */
    private String executionCourt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.execution_basis
     *
     * @mbg.generated
     */
    private String executionBasis;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.case_no
     *
     * @mbg.generated
     */
    private String caseNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.effective_legal_documents
     *
     * @mbg.generated
     */
    private String effectiveLegalDocuments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.specific_circumstances
     *
     * @mbg.generated
     */
    private String specificCircumstances;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.filing_time
     *
     * @mbg.generated
     */
    private LocalDate filingTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.release_time
     *
     * @mbg.generated
     */
    private LocalDate releaseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_discredit_executor.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.id
     *
     * @return the value of t_cpy_discredit_executor.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.id
     *
     * @param id the value for t_cpy_discredit_executor.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.company_id
     *
     * @return the value of t_cpy_discredit_executor.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.company_id
     *
     * @param companyId the value for t_cpy_discredit_executor.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.executor_name
     *
     * @return the value of t_cpy_discredit_executor.executor_name
     *
     * @mbg.generated
     */
    public String getExecutorName() {
        return executorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.executor_name
     *
     * @param executorName the value for t_cpy_discredit_executor.executor_name
     *
     * @mbg.generated
     */
    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.identity_number
     *
     * @return the value of t_cpy_discredit_executor.identity_number
     *
     * @mbg.generated
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.identity_number
     *
     * @param identityNumber the value for t_cpy_discredit_executor.identity_number
     *
     * @mbg.generated
     */
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.org_code
     *
     * @return the value of t_cpy_discredit_executor.org_code
     *
     * @mbg.generated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.org_code
     *
     * @param orgCode the value for t_cpy_discredit_executor.org_code
     *
     * @mbg.generated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.responsible_name
     *
     * @return the value of t_cpy_discredit_executor.responsible_name
     *
     * @mbg.generated
     */
    public String getResponsibleName() {
        return responsibleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.responsible_name
     *
     * @param responsibleName the value for t_cpy_discredit_executor.responsible_name
     *
     * @mbg.generated
     */
    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.name
     *
     * @return the value of t_cpy_discredit_executor.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.name
     *
     * @param name the value for t_cpy_discredit_executor.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.performance_of_the_executor
     *
     * @return the value of t_cpy_discredit_executor.performance_of_the_executor
     *
     * @mbg.generated
     */
    public String getPerformanceOfTheExecutor() {
        return performanceOfTheExecutor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.performance_of_the_executor
     *
     * @param performanceOfTheExecutor the value for t_cpy_discredit_executor.performance_of_the_executor
     *
     * @mbg.generated
     */
    public void setPerformanceOfTheExecutor(String performanceOfTheExecutor) {
        this.performanceOfTheExecutor = performanceOfTheExecutor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.execution_based_unit
     *
     * @return the value of t_cpy_discredit_executor.execution_based_unit
     *
     * @mbg.generated
     */
    public String getExecutionBasedUnit() {
        return executionBasedUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.execution_based_unit
     *
     * @param executionBasedUnit the value for t_cpy_discredit_executor.execution_based_unit
     *
     * @mbg.generated
     */
    public void setExecutionBasedUnit(String executionBasedUnit) {
        this.executionBasedUnit = executionBasedUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.execution_court
     *
     * @return the value of t_cpy_discredit_executor.execution_court
     *
     * @mbg.generated
     */
    public String getExecutionCourt() {
        return executionCourt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.execution_court
     *
     * @param executionCourt the value for t_cpy_discredit_executor.execution_court
     *
     * @mbg.generated
     */
    public void setExecutionCourt(String executionCourt) {
        this.executionCourt = executionCourt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.execution_basis
     *
     * @return the value of t_cpy_discredit_executor.execution_basis
     *
     * @mbg.generated
     */
    public String getExecutionBasis() {
        return executionBasis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.execution_basis
     *
     * @param executionBasis the value for t_cpy_discredit_executor.execution_basis
     *
     * @mbg.generated
     */
    public void setExecutionBasis(String executionBasis) {
        this.executionBasis = executionBasis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.province
     *
     * @return the value of t_cpy_discredit_executor.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.province
     *
     * @param province the value for t_cpy_discredit_executor.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.case_no
     *
     * @return the value of t_cpy_discredit_executor.case_no
     *
     * @mbg.generated
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.case_no
     *
     * @param caseNo the value for t_cpy_discredit_executor.case_no
     *
     * @mbg.generated
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.effective_legal_documents
     *
     * @return the value of t_cpy_discredit_executor.effective_legal_documents
     *
     * @mbg.generated
     */
    public String getEffectiveLegalDocuments() {
        return effectiveLegalDocuments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.effective_legal_documents
     *
     * @param effectiveLegalDocuments the value for t_cpy_discredit_executor.effective_legal_documents
     *
     * @mbg.generated
     */
    public void setEffectiveLegalDocuments(String effectiveLegalDocuments) {
        this.effectiveLegalDocuments = effectiveLegalDocuments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.specific_circumstances
     *
     * @return the value of t_cpy_discredit_executor.specific_circumstances
     *
     * @mbg.generated
     */
    public String getSpecificCircumstances() {
        return specificCircumstances;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.specific_circumstances
     *
     * @param specificCircumstances the value for t_cpy_discredit_executor.specific_circumstances
     *
     * @mbg.generated
     */
    public void setSpecificCircumstances(String specificCircumstances) {
        this.specificCircumstances = specificCircumstances;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.filing_time
     *
     * @return the value of t_cpy_discredit_executor.filing_time
     *
     * @mbg.generated
     */
    public LocalDate getFilingTime() {
        return filingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.filing_time
     *
     * @param filingTime the value for t_cpy_discredit_executor.filing_time
     *
     * @mbg.generated
     */
    public void setFilingTime(LocalDate filingTime) {
        this.filingTime = filingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.release_time
     *
     * @return the value of t_cpy_discredit_executor.release_time
     *
     * @mbg.generated
     */
    public LocalDate getReleaseTime() {
        return releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.release_time
     *
     * @param releaseTime the value for t_cpy_discredit_executor.release_time
     *
     * @mbg.generated
     */
    public void setReleaseTime(LocalDate releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.create_person
     *
     * @return the value of t_cpy_discredit_executor.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.create_person
     *
     * @param createPerson the value for t_cpy_discredit_executor.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.create_time
     *
     * @return the value of t_cpy_discredit_executor.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.create_time
     *
     * @param createTime the value for t_cpy_discredit_executor.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.modify_person
     *
     * @return the value of t_cpy_discredit_executor.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.modify_person
     *
     * @param modifyPerson the value for t_cpy_discredit_executor.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.modify_time
     *
     * @return the value of t_cpy_discredit_executor.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.modify_time
     *
     * @param modifyTime the value for t_cpy_discredit_executor.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_discredit_executor.data_resource
     *
     * @return the value of t_cpy_discredit_executor.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_discredit_executor.data_resource
     *
     * @param dataResource the value for t_cpy_discredit_executor.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_discredit_executor
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
        sb.append(", executorName=").append(executorName);
        sb.append(", identityNumber=").append(identityNumber);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", responsibleName=").append(responsibleName);
        sb.append(", name=").append(name);
        sb.append(", performanceOfTheExecutor=").append(performanceOfTheExecutor);
        sb.append(", executionBasedUnit=").append(executionBasedUnit);
        sb.append(", executionCourt=").append(executionCourt);
        sb.append(", executionBasis=").append(executionBasis);
        sb.append(", province=").append(province);
        sb.append(", caseNo=").append(caseNo);
        sb.append(", effectiveLegalDocuments=").append(effectiveLegalDocuments);
        sb.append(", specificCircumstances=").append(specificCircumstances);
        sb.append(", filingTime=").append(filingTime);
        sb.append(", releaseTime=").append(releaseTime);
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
     * This method corresponds to the database table t_cpy_discredit_executor
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
        TCpyDiscreditExecutor other = (TCpyDiscreditExecutor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getExecutorName() == null ? other.getExecutorName() == null : this.getExecutorName().equals(other.getExecutorName()))
            && (this.getIdentityNumber() == null ? other.getIdentityNumber() == null : this.getIdentityNumber().equals(other.getIdentityNumber()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getResponsibleName() == null ? other.getResponsibleName() == null : this.getResponsibleName().equals(other.getResponsibleName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPerformanceOfTheExecutor() == null ? other.getPerformanceOfTheExecutor() == null : this.getPerformanceOfTheExecutor().equals(other.getPerformanceOfTheExecutor()))
            && (this.getExecutionBasedUnit() == null ? other.getExecutionBasedUnit() == null : this.getExecutionBasedUnit().equals(other.getExecutionBasedUnit()))
            && (this.getExecutionCourt() == null ? other.getExecutionCourt() == null : this.getExecutionCourt().equals(other.getExecutionCourt()))
            && (this.getExecutionBasis() == null ? other.getExecutionBasis() == null : this.getExecutionBasis().equals(other.getExecutionBasis()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCaseNo() == null ? other.getCaseNo() == null : this.getCaseNo().equals(other.getCaseNo()))
            && (this.getEffectiveLegalDocuments() == null ? other.getEffectiveLegalDocuments() == null : this.getEffectiveLegalDocuments().equals(other.getEffectiveLegalDocuments()))
            && (this.getSpecificCircumstances() == null ? other.getSpecificCircumstances() == null : this.getSpecificCircumstances().equals(other.getSpecificCircumstances()))
            && (this.getFilingTime() == null ? other.getFilingTime() == null : this.getFilingTime().equals(other.getFilingTime()))
            && (this.getReleaseTime() == null ? other.getReleaseTime() == null : this.getReleaseTime().equals(other.getReleaseTime()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_discredit_executor
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getExecutorName() == null) ? 0 : getExecutorName().hashCode());
        result = prime * result + ((getIdentityNumber() == null) ? 0 : getIdentityNumber().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getResponsibleName() == null) ? 0 : getResponsibleName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPerformanceOfTheExecutor() == null) ? 0 : getPerformanceOfTheExecutor().hashCode());
        result = prime * result + ((getExecutionBasedUnit() == null) ? 0 : getExecutionBasedUnit().hashCode());
        result = prime * result + ((getExecutionCourt() == null) ? 0 : getExecutionCourt().hashCode());
        result = prime * result + ((getExecutionBasis() == null) ? 0 : getExecutionBasis().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCaseNo() == null) ? 0 : getCaseNo().hashCode());
        result = prime * result + ((getEffectiveLegalDocuments() == null) ? 0 : getEffectiveLegalDocuments().hashCode());
        result = prime * result + ((getSpecificCircumstances() == null) ? 0 : getSpecificCircumstances().hashCode());
        result = prime * result + ((getFilingTime() == null) ? 0 : getFilingTime().hashCode());
        result = prime * result + ((getReleaseTime() == null) ? 0 : getReleaseTime().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_discredit_executor
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        executorName("executor_name", "executorName", "VARCHAR", false),
        identityNumber("identity_number", "identityNumber", "VARCHAR", false),
        orgCode("org_code", "orgCode", "VARCHAR", false),
        responsibleName("responsible_name", "responsibleName", "VARCHAR", false),
        name("name", "name", "VARCHAR", true),
        performanceOfTheExecutor("performance_of_the_executor", "performanceOfTheExecutor", "VARCHAR", false),
        executionBasedUnit("execution_based_unit", "executionBasedUnit", "VARCHAR", false),
        executionCourt("execution_court", "executionCourt", "VARCHAR", false),
        executionBasis("execution_basis", "executionBasis", "VARCHAR", false),
        province("province", "province", "VARCHAR", false),
        caseNo("case_no", "caseNo", "VARCHAR", false),
        effectiveLegalDocuments("effective_legal_documents", "effectiveLegalDocuments", "VARCHAR", false),
        specificCircumstances("specific_circumstances", "specificCircumstances", "VARCHAR", false),
        filingTime("filing_time", "filingTime", "DATE", false),
        releaseTime("release_time", "releaseTime", "DATE", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_discredit_executor
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
         * This method corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_discredit_executor
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
         * This method corresponds to the database table t_cpy_discredit_executor
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
         * This method corresponds to the database table t_cpy_discredit_executor
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}