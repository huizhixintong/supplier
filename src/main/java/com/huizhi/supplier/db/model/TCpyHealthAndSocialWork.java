package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyHealthAndSocialWork {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.year
     *
     * @mbg.generated
     */
    private String year;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.drug_copay
     *
     * @mbg.generated
     */
    private String drugCopay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.antibiotic_intensity
     *
     * @mbg.generated
     */
    private String antibioticIntensity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.equipment_novelty_factor
     *
     * @mbg.generated
     */
    private Double equipmentNoveltyFactor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.recovered_patients_proportion
     *
     * @mbg.generated
     */
    private Double recoveredPatientsProportion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.medical_errors_ten_thousand_patients
     *
     * @mbg.generated
     */
    private Integer medicalErrorsTenThousandPatients;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.medical_informatization_level
     *
     * @mbg.generated
     */
    private String medicalInformatizationLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.medical_management_system
     *
     * @mbg.generated
     */
    private String medicalManagementSystem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.bed_number
     *
     * @mbg.generated
     */
    private Integer bedNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.open_proportion
     *
     * @mbg.generated
     */
    private Double openProportion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.is_intake_government_budget
     *
     * @mbg.generated
     */
    private String isIntakeGovernmentBudget;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.major_projects_capital_arrival_rate
     *
     * @mbg.generated
     */
    private Double majorProjectsCapitalArrivalRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.social_capital_cooperation_model
     *
     * @mbg.generated
     */
    private String socialCapitalCooperationModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.health_authorities_monitor_penalties
     *
     * @mbg.generated
     */
    private String healthAuthoritiesMonitorPenalties;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_health_and_social_work.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.id
     *
     * @return the value of t_cpy_health_and_social_work.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.id
     *
     * @param id the value for t_cpy_health_and_social_work.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.company_id
     *
     * @return the value of t_cpy_health_and_social_work.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.company_id
     *
     * @param companyId the value for t_cpy_health_and_social_work.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.year
     *
     * @return the value of t_cpy_health_and_social_work.year
     *
     * @mbg.generated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.year
     *
     * @param year the value for t_cpy_health_and_social_work.year
     *
     * @mbg.generated
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.drug_copay
     *
     * @return the value of t_cpy_health_and_social_work.drug_copay
     *
     * @mbg.generated
     */
    public String getDrugCopay() {
        return drugCopay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.drug_copay
     *
     * @param drugCopay the value for t_cpy_health_and_social_work.drug_copay
     *
     * @mbg.generated
     */
    public void setDrugCopay(String drugCopay) {
        this.drugCopay = drugCopay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.antibiotic_intensity
     *
     * @return the value of t_cpy_health_and_social_work.antibiotic_intensity
     *
     * @mbg.generated
     */
    public String getAntibioticIntensity() {
        return antibioticIntensity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.antibiotic_intensity
     *
     * @param antibioticIntensity the value for t_cpy_health_and_social_work.antibiotic_intensity
     *
     * @mbg.generated
     */
    public void setAntibioticIntensity(String antibioticIntensity) {
        this.antibioticIntensity = antibioticIntensity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.equipment_novelty_factor
     *
     * @return the value of t_cpy_health_and_social_work.equipment_novelty_factor
     *
     * @mbg.generated
     */
    public Double getEquipmentNoveltyFactor() {
        return equipmentNoveltyFactor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.equipment_novelty_factor
     *
     * @param equipmentNoveltyFactor the value for t_cpy_health_and_social_work.equipment_novelty_factor
     *
     * @mbg.generated
     */
    public void setEquipmentNoveltyFactor(Double equipmentNoveltyFactor) {
        this.equipmentNoveltyFactor = equipmentNoveltyFactor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.recovered_patients_proportion
     *
     * @return the value of t_cpy_health_and_social_work.recovered_patients_proportion
     *
     * @mbg.generated
     */
    public Double getRecoveredPatientsProportion() {
        return recoveredPatientsProportion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.recovered_patients_proportion
     *
     * @param recoveredPatientsProportion the value for t_cpy_health_and_social_work.recovered_patients_proportion
     *
     * @mbg.generated
     */
    public void setRecoveredPatientsProportion(Double recoveredPatientsProportion) {
        this.recoveredPatientsProportion = recoveredPatientsProportion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.medical_errors_ten_thousand_patients
     *
     * @return the value of t_cpy_health_and_social_work.medical_errors_ten_thousand_patients
     *
     * @mbg.generated
     */
    public Integer getMedicalErrorsTenThousandPatients() {
        return medicalErrorsTenThousandPatients;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.medical_errors_ten_thousand_patients
     *
     * @param medicalErrorsTenThousandPatients the value for t_cpy_health_and_social_work.medical_errors_ten_thousand_patients
     *
     * @mbg.generated
     */
    public void setMedicalErrorsTenThousandPatients(Integer medicalErrorsTenThousandPatients) {
        this.medicalErrorsTenThousandPatients = medicalErrorsTenThousandPatients;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.medical_informatization_level
     *
     * @return the value of t_cpy_health_and_social_work.medical_informatization_level
     *
     * @mbg.generated
     */
    public String getMedicalInformatizationLevel() {
        return medicalInformatizationLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.medical_informatization_level
     *
     * @param medicalInformatizationLevel the value for t_cpy_health_and_social_work.medical_informatization_level
     *
     * @mbg.generated
     */
    public void setMedicalInformatizationLevel(String medicalInformatizationLevel) {
        this.medicalInformatizationLevel = medicalInformatizationLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.medical_management_system
     *
     * @return the value of t_cpy_health_and_social_work.medical_management_system
     *
     * @mbg.generated
     */
    public String getMedicalManagementSystem() {
        return medicalManagementSystem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.medical_management_system
     *
     * @param medicalManagementSystem the value for t_cpy_health_and_social_work.medical_management_system
     *
     * @mbg.generated
     */
    public void setMedicalManagementSystem(String medicalManagementSystem) {
        this.medicalManagementSystem = medicalManagementSystem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.bed_number
     *
     * @return the value of t_cpy_health_and_social_work.bed_number
     *
     * @mbg.generated
     */
    public Integer getBedNumber() {
        return bedNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.bed_number
     *
     * @param bedNumber the value for t_cpy_health_and_social_work.bed_number
     *
     * @mbg.generated
     */
    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.open_proportion
     *
     * @return the value of t_cpy_health_and_social_work.open_proportion
     *
     * @mbg.generated
     */
    public Double getOpenProportion() {
        return openProportion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.open_proportion
     *
     * @param openProportion the value for t_cpy_health_and_social_work.open_proportion
     *
     * @mbg.generated
     */
    public void setOpenProportion(Double openProportion) {
        this.openProportion = openProportion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.is_intake_government_budget
     *
     * @return the value of t_cpy_health_and_social_work.is_intake_government_budget
     *
     * @mbg.generated
     */
    public String getIsIntakeGovernmentBudget() {
        return isIntakeGovernmentBudget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.is_intake_government_budget
     *
     * @param isIntakeGovernmentBudget the value for t_cpy_health_and_social_work.is_intake_government_budget
     *
     * @mbg.generated
     */
    public void setIsIntakeGovernmentBudget(String isIntakeGovernmentBudget) {
        this.isIntakeGovernmentBudget = isIntakeGovernmentBudget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.major_projects_capital_arrival_rate
     *
     * @return the value of t_cpy_health_and_social_work.major_projects_capital_arrival_rate
     *
     * @mbg.generated
     */
    public Double getMajorProjectsCapitalArrivalRate() {
        return majorProjectsCapitalArrivalRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.major_projects_capital_arrival_rate
     *
     * @param majorProjectsCapitalArrivalRate the value for t_cpy_health_and_social_work.major_projects_capital_arrival_rate
     *
     * @mbg.generated
     */
    public void setMajorProjectsCapitalArrivalRate(Double majorProjectsCapitalArrivalRate) {
        this.majorProjectsCapitalArrivalRate = majorProjectsCapitalArrivalRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.social_capital_cooperation_model
     *
     * @return the value of t_cpy_health_and_social_work.social_capital_cooperation_model
     *
     * @mbg.generated
     */
    public String getSocialCapitalCooperationModel() {
        return socialCapitalCooperationModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.social_capital_cooperation_model
     *
     * @param socialCapitalCooperationModel the value for t_cpy_health_and_social_work.social_capital_cooperation_model
     *
     * @mbg.generated
     */
    public void setSocialCapitalCooperationModel(String socialCapitalCooperationModel) {
        this.socialCapitalCooperationModel = socialCapitalCooperationModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.health_authorities_monitor_penalties
     *
     * @return the value of t_cpy_health_and_social_work.health_authorities_monitor_penalties
     *
     * @mbg.generated
     */
    public String getHealthAuthoritiesMonitorPenalties() {
        return healthAuthoritiesMonitorPenalties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.health_authorities_monitor_penalties
     *
     * @param healthAuthoritiesMonitorPenalties the value for t_cpy_health_and_social_work.health_authorities_monitor_penalties
     *
     * @mbg.generated
     */
    public void setHealthAuthoritiesMonitorPenalties(String healthAuthoritiesMonitorPenalties) {
        this.healthAuthoritiesMonitorPenalties = healthAuthoritiesMonitorPenalties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.create_person
     *
     * @return the value of t_cpy_health_and_social_work.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.create_person
     *
     * @param createPerson the value for t_cpy_health_and_social_work.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.create_time
     *
     * @return the value of t_cpy_health_and_social_work.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.create_time
     *
     * @param createTime the value for t_cpy_health_and_social_work.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.modify_person
     *
     * @return the value of t_cpy_health_and_social_work.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.modify_person
     *
     * @param modifyPerson the value for t_cpy_health_and_social_work.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.modify_time
     *
     * @return the value of t_cpy_health_and_social_work.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.modify_time
     *
     * @param modifyTime the value for t_cpy_health_and_social_work.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_health_and_social_work.data_resource
     *
     * @return the value of t_cpy_health_and_social_work.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_health_and_social_work.data_resource
     *
     * @param dataResource the value for t_cpy_health_and_social_work.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_health_and_social_work
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
        sb.append(", year=").append(year);
        sb.append(", drugCopay=").append(drugCopay);
        sb.append(", antibioticIntensity=").append(antibioticIntensity);
        sb.append(", equipmentNoveltyFactor=").append(equipmentNoveltyFactor);
        sb.append(", recoveredPatientsProportion=").append(recoveredPatientsProportion);
        sb.append(", medicalErrorsTenThousandPatients=").append(medicalErrorsTenThousandPatients);
        sb.append(", medicalInformatizationLevel=").append(medicalInformatizationLevel);
        sb.append(", medicalManagementSystem=").append(medicalManagementSystem);
        sb.append(", bedNumber=").append(bedNumber);
        sb.append(", openProportion=").append(openProportion);
        sb.append(", isIntakeGovernmentBudget=").append(isIntakeGovernmentBudget);
        sb.append(", majorProjectsCapitalArrivalRate=").append(majorProjectsCapitalArrivalRate);
        sb.append(", socialCapitalCooperationModel=").append(socialCapitalCooperationModel);
        sb.append(", healthAuthoritiesMonitorPenalties=").append(healthAuthoritiesMonitorPenalties);
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
     * This method corresponds to the database table t_cpy_health_and_social_work
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
        TCpyHealthAndSocialWork other = (TCpyHealthAndSocialWork) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getDrugCopay() == null ? other.getDrugCopay() == null : this.getDrugCopay().equals(other.getDrugCopay()))
            && (this.getAntibioticIntensity() == null ? other.getAntibioticIntensity() == null : this.getAntibioticIntensity().equals(other.getAntibioticIntensity()))
            && (this.getEquipmentNoveltyFactor() == null ? other.getEquipmentNoveltyFactor() == null : this.getEquipmentNoveltyFactor().equals(other.getEquipmentNoveltyFactor()))
            && (this.getRecoveredPatientsProportion() == null ? other.getRecoveredPatientsProportion() == null : this.getRecoveredPatientsProportion().equals(other.getRecoveredPatientsProportion()))
            && (this.getMedicalErrorsTenThousandPatients() == null ? other.getMedicalErrorsTenThousandPatients() == null : this.getMedicalErrorsTenThousandPatients().equals(other.getMedicalErrorsTenThousandPatients()))
            && (this.getMedicalInformatizationLevel() == null ? other.getMedicalInformatizationLevel() == null : this.getMedicalInformatizationLevel().equals(other.getMedicalInformatizationLevel()))
            && (this.getMedicalManagementSystem() == null ? other.getMedicalManagementSystem() == null : this.getMedicalManagementSystem().equals(other.getMedicalManagementSystem()))
            && (this.getBedNumber() == null ? other.getBedNumber() == null : this.getBedNumber().equals(other.getBedNumber()))
            && (this.getOpenProportion() == null ? other.getOpenProportion() == null : this.getOpenProportion().equals(other.getOpenProportion()))
            && (this.getIsIntakeGovernmentBudget() == null ? other.getIsIntakeGovernmentBudget() == null : this.getIsIntakeGovernmentBudget().equals(other.getIsIntakeGovernmentBudget()))
            && (this.getMajorProjectsCapitalArrivalRate() == null ? other.getMajorProjectsCapitalArrivalRate() == null : this.getMajorProjectsCapitalArrivalRate().equals(other.getMajorProjectsCapitalArrivalRate()))
            && (this.getSocialCapitalCooperationModel() == null ? other.getSocialCapitalCooperationModel() == null : this.getSocialCapitalCooperationModel().equals(other.getSocialCapitalCooperationModel()))
            && (this.getHealthAuthoritiesMonitorPenalties() == null ? other.getHealthAuthoritiesMonitorPenalties() == null : this.getHealthAuthoritiesMonitorPenalties().equals(other.getHealthAuthoritiesMonitorPenalties()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_health_and_social_work
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getDrugCopay() == null) ? 0 : getDrugCopay().hashCode());
        result = prime * result + ((getAntibioticIntensity() == null) ? 0 : getAntibioticIntensity().hashCode());
        result = prime * result + ((getEquipmentNoveltyFactor() == null) ? 0 : getEquipmentNoveltyFactor().hashCode());
        result = prime * result + ((getRecoveredPatientsProportion() == null) ? 0 : getRecoveredPatientsProportion().hashCode());
        result = prime * result + ((getMedicalErrorsTenThousandPatients() == null) ? 0 : getMedicalErrorsTenThousandPatients().hashCode());
        result = prime * result + ((getMedicalInformatizationLevel() == null) ? 0 : getMedicalInformatizationLevel().hashCode());
        result = prime * result + ((getMedicalManagementSystem() == null) ? 0 : getMedicalManagementSystem().hashCode());
        result = prime * result + ((getBedNumber() == null) ? 0 : getBedNumber().hashCode());
        result = prime * result + ((getOpenProportion() == null) ? 0 : getOpenProportion().hashCode());
        result = prime * result + ((getIsIntakeGovernmentBudget() == null) ? 0 : getIsIntakeGovernmentBudget().hashCode());
        result = prime * result + ((getMajorProjectsCapitalArrivalRate() == null) ? 0 : getMajorProjectsCapitalArrivalRate().hashCode());
        result = prime * result + ((getSocialCapitalCooperationModel() == null) ? 0 : getSocialCapitalCooperationModel().hashCode());
        result = prime * result + ((getHealthAuthoritiesMonitorPenalties() == null) ? 0 : getHealthAuthoritiesMonitorPenalties().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_health_and_social_work
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "VARCHAR", false),
        year("year", "year", "CHAR", true),
        drugCopay("drug_copay", "drugCopay", "CHAR", false),
        antibioticIntensity("antibiotic_intensity", "antibioticIntensity", "CHAR", false),
        equipmentNoveltyFactor("equipment_novelty_factor", "equipmentNoveltyFactor", "DOUBLE", false),
        recoveredPatientsProportion("recovered_patients_proportion", "recoveredPatientsProportion", "DOUBLE", false),
        medicalErrorsTenThousandPatients("medical_errors_ten_thousand_patients", "medicalErrorsTenThousandPatients", "INTEGER", false),
        medicalInformatizationLevel("medical_informatization_level", "medicalInformatizationLevel", "VARCHAR", false),
        medicalManagementSystem("medical_management_system", "medicalManagementSystem", "VARCHAR", false),
        bedNumber("bed_number", "bedNumber", "INTEGER", false),
        openProportion("open_proportion", "openProportion", "DOUBLE", false),
        isIntakeGovernmentBudget("is_intake_government_budget", "isIntakeGovernmentBudget", "CHAR", false),
        majorProjectsCapitalArrivalRate("major_projects_capital_arrival_rate", "majorProjectsCapitalArrivalRate", "DOUBLE", false),
        socialCapitalCooperationModel("social_capital_cooperation_model", "socialCapitalCooperationModel", "CHAR", false),
        healthAuthoritiesMonitorPenalties("health_authorities_monitor_penalties", "healthAuthoritiesMonitorPenalties", "CHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_health_and_social_work
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
         * This method corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_health_and_social_work
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
         * This method corresponds to the database table t_cpy_health_and_social_work
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
         * This method corresponds to the database table t_cpy_health_and_social_work
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}