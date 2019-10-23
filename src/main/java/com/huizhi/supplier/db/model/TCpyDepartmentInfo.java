package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyDepartmentInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.year
     *
     * @mbg.generated
     */
    private String year;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.is_have_info_manage_dept
     *
     * @mbg.generated
     */
    private String isHaveInfoManageDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.is_have_safety_manage_dept
     *
     * @mbg.generated
     */
    private String isHaveSafetyManageDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.is_have_environmental_dept
     *
     * @mbg.generated
     */
    private String isHaveEnvironmentalDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.is_have_quality_control_department
     *
     * @mbg.generated
     */
    private String isHaveQualityControlDepartment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.is_have_equipment_dept
     *
     * @mbg.generated
     */
    private String isHaveEquipmentDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.is_have_development_department
     *
     * @mbg.generated
     */
    private String isHaveDevelopmentDepartment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_department_info.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.id
     *
     * @return the value of t_cpy_department_info.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.id
     *
     * @param id the value for t_cpy_department_info.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.company_id
     *
     * @return the value of t_cpy_department_info.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.company_id
     *
     * @param companyId the value for t_cpy_department_info.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.year
     *
     * @return the value of t_cpy_department_info.year
     *
     * @mbg.generated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.year
     *
     * @param year the value for t_cpy_department_info.year
     *
     * @mbg.generated
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.is_have_info_manage_dept
     *
     * @return the value of t_cpy_department_info.is_have_info_manage_dept
     *
     * @mbg.generated
     */
    public String getIsHaveInfoManageDept() {
        return isHaveInfoManageDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.is_have_info_manage_dept
     *
     * @param isHaveInfoManageDept the value for t_cpy_department_info.is_have_info_manage_dept
     *
     * @mbg.generated
     */
    public void setIsHaveInfoManageDept(String isHaveInfoManageDept) {
        this.isHaveInfoManageDept = isHaveInfoManageDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.is_have_safety_manage_dept
     *
     * @return the value of t_cpy_department_info.is_have_safety_manage_dept
     *
     * @mbg.generated
     */
    public String getIsHaveSafetyManageDept() {
        return isHaveSafetyManageDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.is_have_safety_manage_dept
     *
     * @param isHaveSafetyManageDept the value for t_cpy_department_info.is_have_safety_manage_dept
     *
     * @mbg.generated
     */
    public void setIsHaveSafetyManageDept(String isHaveSafetyManageDept) {
        this.isHaveSafetyManageDept = isHaveSafetyManageDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.is_have_environmental_dept
     *
     * @return the value of t_cpy_department_info.is_have_environmental_dept
     *
     * @mbg.generated
     */
    public String getIsHaveEnvironmentalDept() {
        return isHaveEnvironmentalDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.is_have_environmental_dept
     *
     * @param isHaveEnvironmentalDept the value for t_cpy_department_info.is_have_environmental_dept
     *
     * @mbg.generated
     */
    public void setIsHaveEnvironmentalDept(String isHaveEnvironmentalDept) {
        this.isHaveEnvironmentalDept = isHaveEnvironmentalDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.is_have_quality_control_department
     *
     * @return the value of t_cpy_department_info.is_have_quality_control_department
     *
     * @mbg.generated
     */
    public String getIsHaveQualityControlDepartment() {
        return isHaveQualityControlDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.is_have_quality_control_department
     *
     * @param isHaveQualityControlDepartment the value for t_cpy_department_info.is_have_quality_control_department
     *
     * @mbg.generated
     */
    public void setIsHaveQualityControlDepartment(String isHaveQualityControlDepartment) {
        this.isHaveQualityControlDepartment = isHaveQualityControlDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.is_have_equipment_dept
     *
     * @return the value of t_cpy_department_info.is_have_equipment_dept
     *
     * @mbg.generated
     */
    public String getIsHaveEquipmentDept() {
        return isHaveEquipmentDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.is_have_equipment_dept
     *
     * @param isHaveEquipmentDept the value for t_cpy_department_info.is_have_equipment_dept
     *
     * @mbg.generated
     */
    public void setIsHaveEquipmentDept(String isHaveEquipmentDept) {
        this.isHaveEquipmentDept = isHaveEquipmentDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.is_have_development_department
     *
     * @return the value of t_cpy_department_info.is_have_development_department
     *
     * @mbg.generated
     */
    public String getIsHaveDevelopmentDepartment() {
        return isHaveDevelopmentDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.is_have_development_department
     *
     * @param isHaveDevelopmentDepartment the value for t_cpy_department_info.is_have_development_department
     *
     * @mbg.generated
     */
    public void setIsHaveDevelopmentDepartment(String isHaveDevelopmentDepartment) {
        this.isHaveDevelopmentDepartment = isHaveDevelopmentDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.create_person
     *
     * @return the value of t_cpy_department_info.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.create_person
     *
     * @param createPerson the value for t_cpy_department_info.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.create_time
     *
     * @return the value of t_cpy_department_info.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.create_time
     *
     * @param createTime the value for t_cpy_department_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.modify_person
     *
     * @return the value of t_cpy_department_info.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.modify_person
     *
     * @param modifyPerson the value for t_cpy_department_info.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.modify_time
     *
     * @return the value of t_cpy_department_info.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.modify_time
     *
     * @param modifyTime the value for t_cpy_department_info.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_department_info.data_resource
     *
     * @return the value of t_cpy_department_info.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_department_info.data_resource
     *
     * @param dataResource the value for t_cpy_department_info.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
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
        sb.append(", isHaveInfoManageDept=").append(isHaveInfoManageDept);
        sb.append(", isHaveSafetyManageDept=").append(isHaveSafetyManageDept);
        sb.append(", isHaveEnvironmentalDept=").append(isHaveEnvironmentalDept);
        sb.append(", isHaveQualityControlDepartment=").append(isHaveQualityControlDepartment);
        sb.append(", isHaveEquipmentDept=").append(isHaveEquipmentDept);
        sb.append(", isHaveDevelopmentDepartment=").append(isHaveDevelopmentDepartment);
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
     * This method corresponds to the database table t_cpy_department_info
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
        TCpyDepartmentInfo other = (TCpyDepartmentInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getIsHaveInfoManageDept() == null ? other.getIsHaveInfoManageDept() == null : this.getIsHaveInfoManageDept().equals(other.getIsHaveInfoManageDept()))
            && (this.getIsHaveSafetyManageDept() == null ? other.getIsHaveSafetyManageDept() == null : this.getIsHaveSafetyManageDept().equals(other.getIsHaveSafetyManageDept()))
            && (this.getIsHaveEnvironmentalDept() == null ? other.getIsHaveEnvironmentalDept() == null : this.getIsHaveEnvironmentalDept().equals(other.getIsHaveEnvironmentalDept()))
            && (this.getIsHaveQualityControlDepartment() == null ? other.getIsHaveQualityControlDepartment() == null : this.getIsHaveQualityControlDepartment().equals(other.getIsHaveQualityControlDepartment()))
            && (this.getIsHaveEquipmentDept() == null ? other.getIsHaveEquipmentDept() == null : this.getIsHaveEquipmentDept().equals(other.getIsHaveEquipmentDept()))
            && (this.getIsHaveDevelopmentDepartment() == null ? other.getIsHaveDevelopmentDepartment() == null : this.getIsHaveDevelopmentDepartment().equals(other.getIsHaveDevelopmentDepartment()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
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
        result = prime * result + ((getIsHaveInfoManageDept() == null) ? 0 : getIsHaveInfoManageDept().hashCode());
        result = prime * result + ((getIsHaveSafetyManageDept() == null) ? 0 : getIsHaveSafetyManageDept().hashCode());
        result = prime * result + ((getIsHaveEnvironmentalDept() == null) ? 0 : getIsHaveEnvironmentalDept().hashCode());
        result = prime * result + ((getIsHaveQualityControlDepartment() == null) ? 0 : getIsHaveQualityControlDepartment().hashCode());
        result = prime * result + ((getIsHaveEquipmentDept() == null) ? 0 : getIsHaveEquipmentDept().hashCode());
        result = prime * result + ((getIsHaveDevelopmentDepartment() == null) ? 0 : getIsHaveDevelopmentDepartment().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "VARCHAR", false),
        companyId("company_id", "companyId", "VARCHAR", false),
        year("year", "year", "CHAR", true),
        isHaveInfoManageDept("is_have_info_manage_dept", "isHaveInfoManageDept", "CHAR", false),
        isHaveSafetyManageDept("is_have_safety_manage_dept", "isHaveSafetyManageDept", "CHAR", false),
        isHaveEnvironmentalDept("is_have_environmental_dept", "isHaveEnvironmentalDept", "CHAR", false),
        isHaveQualityControlDepartment("is_have_quality_control_department", "isHaveQualityControlDepartment", "CHAR", false),
        isHaveEquipmentDept("is_have_equipment_dept", "isHaveEquipmentDept", "CHAR", false),
        isHaveDevelopmentDepartment("is_have_development_department", "isHaveDevelopmentDepartment", "CHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_department_info
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
         * This method corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_department_info
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
         * This method corresponds to the database table t_cpy_department_info
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
         * This method corresponds to the database table t_cpy_department_info
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}