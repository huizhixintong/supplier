package com.huizhi.supplier.db.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyStandardSetting {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.standard_number
     *
     * @mbg.generated
     */
    private String standardNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.standard_name
     *
     * @mbg.generated
     */
    private String standardName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.publish_date
     *
     * @mbg.generated
     */
    private LocalDate publishDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.standard_path
     *
     * @mbg.generated
     */
    private String standardPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.standard_type
     *
     * @mbg.generated
     */
    private String standardType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.standard_count
     *
     * @mbg.generated
     */
    private Integer standardCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.attachment
     *
     * @mbg.generated
     */
    private String attachment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_standard_setting.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.id
     *
     * @return the value of t_cpy_standard_setting.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.id
     *
     * @param id the value for t_cpy_standard_setting.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.company_id
     *
     * @return the value of t_cpy_standard_setting.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.company_id
     *
     * @param companyId the value for t_cpy_standard_setting.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.standard_number
     *
     * @return the value of t_cpy_standard_setting.standard_number
     *
     * @mbg.generated
     */
    public String getStandardNumber() {
        return standardNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.standard_number
     *
     * @param standardNumber the value for t_cpy_standard_setting.standard_number
     *
     * @mbg.generated
     */
    public void setStandardNumber(String standardNumber) {
        this.standardNumber = standardNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.standard_name
     *
     * @return the value of t_cpy_standard_setting.standard_name
     *
     * @mbg.generated
     */
    public String getStandardName() {
        return standardName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.standard_name
     *
     * @param standardName the value for t_cpy_standard_setting.standard_name
     *
     * @mbg.generated
     */
    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.publish_date
     *
     * @return the value of t_cpy_standard_setting.publish_date
     *
     * @mbg.generated
     */
    public LocalDate getPublishDate() {
        return publishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.publish_date
     *
     * @param publishDate the value for t_cpy_standard_setting.publish_date
     *
     * @mbg.generated
     */
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.standard_path
     *
     * @return the value of t_cpy_standard_setting.standard_path
     *
     * @mbg.generated
     */
    public String getStandardPath() {
        return standardPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.standard_path
     *
     * @param standardPath the value for t_cpy_standard_setting.standard_path
     *
     * @mbg.generated
     */
    public void setStandardPath(String standardPath) {
        this.standardPath = standardPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.standard_type
     *
     * @return the value of t_cpy_standard_setting.standard_type
     *
     * @mbg.generated
     */
    public String getStandardType() {
        return standardType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.standard_type
     *
     * @param standardType the value for t_cpy_standard_setting.standard_type
     *
     * @mbg.generated
     */
    public void setStandardType(String standardType) {
        this.standardType = standardType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.standard_count
     *
     * @return the value of t_cpy_standard_setting.standard_count
     *
     * @mbg.generated
     */
    public Integer getStandardCount() {
        return standardCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.standard_count
     *
     * @param standardCount the value for t_cpy_standard_setting.standard_count
     *
     * @mbg.generated
     */
    public void setStandardCount(Integer standardCount) {
        this.standardCount = standardCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.attachment
     *
     * @return the value of t_cpy_standard_setting.attachment
     *
     * @mbg.generated
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.attachment
     *
     * @param attachment the value for t_cpy_standard_setting.attachment
     *
     * @mbg.generated
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.create_person
     *
     * @return the value of t_cpy_standard_setting.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.create_person
     *
     * @param createPerson the value for t_cpy_standard_setting.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.create_time
     *
     * @return the value of t_cpy_standard_setting.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.create_time
     *
     * @param createTime the value for t_cpy_standard_setting.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.modify_person
     *
     * @return the value of t_cpy_standard_setting.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.modify_person
     *
     * @param modifyPerson the value for t_cpy_standard_setting.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.modify_time
     *
     * @return the value of t_cpy_standard_setting.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.modify_time
     *
     * @param modifyTime the value for t_cpy_standard_setting.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_standard_setting.data_resource
     *
     * @return the value of t_cpy_standard_setting.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_standard_setting.data_resource
     *
     * @param dataResource the value for t_cpy_standard_setting.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
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
        sb.append(", standardNumber=").append(standardNumber);
        sb.append(", standardName=").append(standardName);
        sb.append(", publishDate=").append(publishDate);
        sb.append(", standardPath=").append(standardPath);
        sb.append(", standardType=").append(standardType);
        sb.append(", standardCount=").append(standardCount);
        sb.append(", attachment=").append(attachment);
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
     * This method corresponds to the database table t_cpy_standard_setting
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
        TCpyStandardSetting other = (TCpyStandardSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getStandardNumber() == null ? other.getStandardNumber() == null : this.getStandardNumber().equals(other.getStandardNumber()))
            && (this.getStandardName() == null ? other.getStandardName() == null : this.getStandardName().equals(other.getStandardName()))
            && (this.getPublishDate() == null ? other.getPublishDate() == null : this.getPublishDate().equals(other.getPublishDate()))
            && (this.getStandardPath() == null ? other.getStandardPath() == null : this.getStandardPath().equals(other.getStandardPath()))
            && (this.getStandardType() == null ? other.getStandardType() == null : this.getStandardType().equals(other.getStandardType()))
            && (this.getStandardCount() == null ? other.getStandardCount() == null : this.getStandardCount().equals(other.getStandardCount()))
            && (this.getAttachment() == null ? other.getAttachment() == null : this.getAttachment().equals(other.getAttachment()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getStandardNumber() == null) ? 0 : getStandardNumber().hashCode());
        result = prime * result + ((getStandardName() == null) ? 0 : getStandardName().hashCode());
        result = prime * result + ((getPublishDate() == null) ? 0 : getPublishDate().hashCode());
        result = prime * result + ((getStandardPath() == null) ? 0 : getStandardPath().hashCode());
        result = prime * result + ((getStandardType() == null) ? 0 : getStandardType().hashCode());
        result = prime * result + ((getStandardCount() == null) ? 0 : getStandardCount().hashCode());
        result = prime * result + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        standardNumber("standard_number", "standardNumber", "VARCHAR", false),
        standardName("standard_name", "standardName", "VARCHAR", false),
        publishDate("publish_date", "publishDate", "DATE", false),
        standardPath("standard_path", "standardPath", "VARCHAR", false),
        standardType("standard_type", "standardType", "VARCHAR", false),
        standardCount("standard_count", "standardCount", "INTEGER", false),
        attachment("attachment", "attachment", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_standard_setting
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
         * This method corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_standard_setting
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
         * This method corresponds to the database table t_cpy_standard_setting
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
         * This method corresponds to the database table t_cpy_standard_setting
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}