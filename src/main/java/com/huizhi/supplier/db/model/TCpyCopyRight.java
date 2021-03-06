package com.huizhi.supplier.db.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyCopyRight {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.work_name
     *
     * @mbg.generated
     */
    private String workName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.work_owner
     *
     * @mbg.generated
     */
    private String workOwner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.announcement_type
     *
     * @mbg.generated
     */
    private String announcementType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.registration_no
     *
     * @mbg.generated
     */
    private String registrationNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.soft_register_no
     *
     * @mbg.generated
     */
    private String softRegisterNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.sort_no
     *
     * @mbg.generated
     */
    private String sortNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.announcement_date
     *
     * @mbg.generated
     */
    private LocalDate announcementDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.registration_date
     *
     * @mbg.generated
     */
    private LocalDate registrationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.publication_date
     *
     * @mbg.generated
     */
    private LocalDate publicationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.soft_file_path
     *
     * @mbg.generated
     */
    private String softFilePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.file_path
     *
     * @mbg.generated
     */
    private String filePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.copyright_book_name
     *
     * @mbg.generated
     */
    private String copyrightBookName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.copyright_book_virtual
     *
     * @mbg.generated
     */
    private String copyrightBookVirtual;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_copy_right.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.id
     *
     * @return the value of t_cpy_copy_right.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.id
     *
     * @param id the value for t_cpy_copy_right.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.company_id
     *
     * @return the value of t_cpy_copy_right.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.company_id
     *
     * @param companyId the value for t_cpy_copy_right.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.work_name
     *
     * @return the value of t_cpy_copy_right.work_name
     *
     * @mbg.generated
     */
    public String getWorkName() {
        return workName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.work_name
     *
     * @param workName the value for t_cpy_copy_right.work_name
     *
     * @mbg.generated
     */
    public void setWorkName(String workName) {
        this.workName = workName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.work_owner
     *
     * @return the value of t_cpy_copy_right.work_owner
     *
     * @mbg.generated
     */
    public String getWorkOwner() {
        return workOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.work_owner
     *
     * @param workOwner the value for t_cpy_copy_right.work_owner
     *
     * @mbg.generated
     */
    public void setWorkOwner(String workOwner) {
        this.workOwner = workOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.announcement_type
     *
     * @return the value of t_cpy_copy_right.announcement_type
     *
     * @mbg.generated
     */
    public String getAnnouncementType() {
        return announcementType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.announcement_type
     *
     * @param announcementType the value for t_cpy_copy_right.announcement_type
     *
     * @mbg.generated
     */
    public void setAnnouncementType(String announcementType) {
        this.announcementType = announcementType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.registration_no
     *
     * @return the value of t_cpy_copy_right.registration_no
     *
     * @mbg.generated
     */
    public String getRegistrationNo() {
        return registrationNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.registration_no
     *
     * @param registrationNo the value for t_cpy_copy_right.registration_no
     *
     * @mbg.generated
     */
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.soft_register_no
     *
     * @return the value of t_cpy_copy_right.soft_register_no
     *
     * @mbg.generated
     */
    public String getSoftRegisterNo() {
        return softRegisterNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.soft_register_no
     *
     * @param softRegisterNo the value for t_cpy_copy_right.soft_register_no
     *
     * @mbg.generated
     */
    public void setSoftRegisterNo(String softRegisterNo) {
        this.softRegisterNo = softRegisterNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.sort_no
     *
     * @return the value of t_cpy_copy_right.sort_no
     *
     * @mbg.generated
     */
    public String getSortNo() {
        return sortNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.sort_no
     *
     * @param sortNo the value for t_cpy_copy_right.sort_no
     *
     * @mbg.generated
     */
    public void setSortNo(String sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.announcement_date
     *
     * @return the value of t_cpy_copy_right.announcement_date
     *
     * @mbg.generated
     */
    public LocalDate getAnnouncementDate() {
        return announcementDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.announcement_date
     *
     * @param announcementDate the value for t_cpy_copy_right.announcement_date
     *
     * @mbg.generated
     */
    public void setAnnouncementDate(LocalDate announcementDate) {
        this.announcementDate = announcementDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.registration_date
     *
     * @return the value of t_cpy_copy_right.registration_date
     *
     * @mbg.generated
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.registration_date
     *
     * @param registrationDate the value for t_cpy_copy_right.registration_date
     *
     * @mbg.generated
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.publication_date
     *
     * @return the value of t_cpy_copy_right.publication_date
     *
     * @mbg.generated
     */
    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.publication_date
     *
     * @param publicationDate the value for t_cpy_copy_right.publication_date
     *
     * @mbg.generated
     */
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.soft_file_path
     *
     * @return the value of t_cpy_copy_right.soft_file_path
     *
     * @mbg.generated
     */
    public String getSoftFilePath() {
        return softFilePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.soft_file_path
     *
     * @param softFilePath the value for t_cpy_copy_right.soft_file_path
     *
     * @mbg.generated
     */
    public void setSoftFilePath(String softFilePath) {
        this.softFilePath = softFilePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.file_path
     *
     * @return the value of t_cpy_copy_right.file_path
     *
     * @mbg.generated
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.file_path
     *
     * @param filePath the value for t_cpy_copy_right.file_path
     *
     * @mbg.generated
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.copyright_book_name
     *
     * @return the value of t_cpy_copy_right.copyright_book_name
     *
     * @mbg.generated
     */
    public String getCopyrightBookName() {
        return copyrightBookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.copyright_book_name
     *
     * @param copyrightBookName the value for t_cpy_copy_right.copyright_book_name
     *
     * @mbg.generated
     */
    public void setCopyrightBookName(String copyrightBookName) {
        this.copyrightBookName = copyrightBookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.copyright_book_virtual
     *
     * @return the value of t_cpy_copy_right.copyright_book_virtual
     *
     * @mbg.generated
     */
    public String getCopyrightBookVirtual() {
        return copyrightBookVirtual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.copyright_book_virtual
     *
     * @param copyrightBookVirtual the value for t_cpy_copy_right.copyright_book_virtual
     *
     * @mbg.generated
     */
    public void setCopyrightBookVirtual(String copyrightBookVirtual) {
        this.copyrightBookVirtual = copyrightBookVirtual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.create_person
     *
     * @return the value of t_cpy_copy_right.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.create_person
     *
     * @param createPerson the value for t_cpy_copy_right.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.create_time
     *
     * @return the value of t_cpy_copy_right.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.create_time
     *
     * @param createTime the value for t_cpy_copy_right.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.modify_person
     *
     * @return the value of t_cpy_copy_right.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.modify_person
     *
     * @param modifyPerson the value for t_cpy_copy_right.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.modify_time
     *
     * @return the value of t_cpy_copy_right.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.modify_time
     *
     * @param modifyTime the value for t_cpy_copy_right.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_copy_right.data_resource
     *
     * @return the value of t_cpy_copy_right.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_copy_right.data_resource
     *
     * @param dataResource the value for t_cpy_copy_right.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_copy_right
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
        sb.append(", workName=").append(workName);
        sb.append(", workOwner=").append(workOwner);
        sb.append(", announcementType=").append(announcementType);
        sb.append(", registrationNo=").append(registrationNo);
        sb.append(", softRegisterNo=").append(softRegisterNo);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", announcementDate=").append(announcementDate);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", publicationDate=").append(publicationDate);
        sb.append(", softFilePath=").append(softFilePath);
        sb.append(", filePath=").append(filePath);
        sb.append(", copyrightBookName=").append(copyrightBookName);
        sb.append(", copyrightBookVirtual=").append(copyrightBookVirtual);
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
     * This method corresponds to the database table t_cpy_copy_right
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
        TCpyCopyRight other = (TCpyCopyRight) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getWorkName() == null ? other.getWorkName() == null : this.getWorkName().equals(other.getWorkName()))
            && (this.getWorkOwner() == null ? other.getWorkOwner() == null : this.getWorkOwner().equals(other.getWorkOwner()))
            && (this.getAnnouncementType() == null ? other.getAnnouncementType() == null : this.getAnnouncementType().equals(other.getAnnouncementType()))
            && (this.getRegistrationNo() == null ? other.getRegistrationNo() == null : this.getRegistrationNo().equals(other.getRegistrationNo()))
            && (this.getSoftRegisterNo() == null ? other.getSoftRegisterNo() == null : this.getSoftRegisterNo().equals(other.getSoftRegisterNo()))
            && (this.getSortNo() == null ? other.getSortNo() == null : this.getSortNo().equals(other.getSortNo()))
            && (this.getAnnouncementDate() == null ? other.getAnnouncementDate() == null : this.getAnnouncementDate().equals(other.getAnnouncementDate()))
            && (this.getRegistrationDate() == null ? other.getRegistrationDate() == null : this.getRegistrationDate().equals(other.getRegistrationDate()))
            && (this.getPublicationDate() == null ? other.getPublicationDate() == null : this.getPublicationDate().equals(other.getPublicationDate()))
            && (this.getSoftFilePath() == null ? other.getSoftFilePath() == null : this.getSoftFilePath().equals(other.getSoftFilePath()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
            && (this.getCopyrightBookName() == null ? other.getCopyrightBookName() == null : this.getCopyrightBookName().equals(other.getCopyrightBookName()))
            && (this.getCopyrightBookVirtual() == null ? other.getCopyrightBookVirtual() == null : this.getCopyrightBookVirtual().equals(other.getCopyrightBookVirtual()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_copy_right
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getWorkName() == null) ? 0 : getWorkName().hashCode());
        result = prime * result + ((getWorkOwner() == null) ? 0 : getWorkOwner().hashCode());
        result = prime * result + ((getAnnouncementType() == null) ? 0 : getAnnouncementType().hashCode());
        result = prime * result + ((getRegistrationNo() == null) ? 0 : getRegistrationNo().hashCode());
        result = prime * result + ((getSoftRegisterNo() == null) ? 0 : getSoftRegisterNo().hashCode());
        result = prime * result + ((getSortNo() == null) ? 0 : getSortNo().hashCode());
        result = prime * result + ((getAnnouncementDate() == null) ? 0 : getAnnouncementDate().hashCode());
        result = prime * result + ((getRegistrationDate() == null) ? 0 : getRegistrationDate().hashCode());
        result = prime * result + ((getPublicationDate() == null) ? 0 : getPublicationDate().hashCode());
        result = prime * result + ((getSoftFilePath() == null) ? 0 : getSoftFilePath().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getCopyrightBookName() == null) ? 0 : getCopyrightBookName().hashCode());
        result = prime * result + ((getCopyrightBookVirtual() == null) ? 0 : getCopyrightBookVirtual().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_copy_right
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        workName("work_name", "workName", "VARCHAR", false),
        workOwner("work_owner", "workOwner", "VARCHAR", false),
        announcementType("announcement_type", "announcementType", "VARCHAR", false),
        registrationNo("registration_no", "registrationNo", "VARCHAR", false),
        softRegisterNo("soft_register_no", "softRegisterNo", "VARCHAR", false),
        sortNo("sort_no", "sortNo", "VARCHAR", false),
        announcementDate("announcement_date", "announcementDate", "DATE", false),
        registrationDate("registration_date", "registrationDate", "DATE", false),
        publicationDate("publication_date", "publicationDate", "DATE", false),
        softFilePath("soft_file_path", "softFilePath", "VARCHAR", false),
        filePath("file_path", "filePath", "VARCHAR", false),
        copyrightBookName("copyright_book_name", "copyrightBookName", "VARCHAR", false),
        copyrightBookVirtual("copyright_book_virtual", "copyrightBookVirtual", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_copy_right
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
         * This method corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_copy_right
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
         * This method corresponds to the database table t_cpy_copy_right
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
         * This method corresponds to the database table t_cpy_copy_right
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}