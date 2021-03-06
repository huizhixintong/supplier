package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TMgmObjectionHandling {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.dissenter
     *
     * @mbg.generated
     */
    private String dissenter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.objection_time
     *
     * @mbg.generated
     */
    private LocalDateTime objectionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.objection_details
     *
     * @mbg.generated
     */
    private String objectionDetails;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.company_name
     *
     * @mbg.generated
     */
    private String companyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.handling_time
     *
     * @mbg.generated
     */
    private LocalDateTime handlingTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.feedback
     *
     * @mbg.generated
     */
    private String feedback;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.table_type
     *
     * @mbg.generated
     */
    private String tableType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_objection_handling.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.id
     *
     * @return the value of t_mgm_objection_handling.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.id
     *
     * @param id the value for t_mgm_objection_handling.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.dissenter
     *
     * @return the value of t_mgm_objection_handling.dissenter
     *
     * @mbg.generated
     */
    public String getDissenter() {
        return dissenter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.dissenter
     *
     * @param dissenter the value for t_mgm_objection_handling.dissenter
     *
     * @mbg.generated
     */
    public void setDissenter(String dissenter) {
        this.dissenter = dissenter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.objection_time
     *
     * @return the value of t_mgm_objection_handling.objection_time
     *
     * @mbg.generated
     */
    public LocalDateTime getObjectionTime() {
        return objectionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.objection_time
     *
     * @param objectionTime the value for t_mgm_objection_handling.objection_time
     *
     * @mbg.generated
     */
    public void setObjectionTime(LocalDateTime objectionTime) {
        this.objectionTime = objectionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.objection_details
     *
     * @return the value of t_mgm_objection_handling.objection_details
     *
     * @mbg.generated
     */
    public String getObjectionDetails() {
        return objectionDetails;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.objection_details
     *
     * @param objectionDetails the value for t_mgm_objection_handling.objection_details
     *
     * @mbg.generated
     */
    public void setObjectionDetails(String objectionDetails) {
        this.objectionDetails = objectionDetails;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.company_name
     *
     * @return the value of t_mgm_objection_handling.company_name
     *
     * @mbg.generated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.company_name
     *
     * @param companyName the value for t_mgm_objection_handling.company_name
     *
     * @mbg.generated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.mobile
     *
     * @return the value of t_mgm_objection_handling.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.mobile
     *
     * @param mobile the value for t_mgm_objection_handling.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.handling_time
     *
     * @return the value of t_mgm_objection_handling.handling_time
     *
     * @mbg.generated
     */
    public LocalDateTime getHandlingTime() {
        return handlingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.handling_time
     *
     * @param handlingTime the value for t_mgm_objection_handling.handling_time
     *
     * @mbg.generated
     */
    public void setHandlingTime(LocalDateTime handlingTime) {
        this.handlingTime = handlingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.feedback
     *
     * @return the value of t_mgm_objection_handling.feedback
     *
     * @mbg.generated
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.feedback
     *
     * @param feedback the value for t_mgm_objection_handling.feedback
     *
     * @mbg.generated
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.state
     *
     * @return the value of t_mgm_objection_handling.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.state
     *
     * @param state the value for t_mgm_objection_handling.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.table_type
     *
     * @return the value of t_mgm_objection_handling.table_type
     *
     * @mbg.generated
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.table_type
     *
     * @param tableType the value for t_mgm_objection_handling.table_type
     *
     * @mbg.generated
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.create_person
     *
     * @return the value of t_mgm_objection_handling.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.create_person
     *
     * @param createPerson the value for t_mgm_objection_handling.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.create_time
     *
     * @return the value of t_mgm_objection_handling.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.create_time
     *
     * @param createTime the value for t_mgm_objection_handling.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.modify_person
     *
     * @return the value of t_mgm_objection_handling.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.modify_person
     *
     * @param modifyPerson the value for t_mgm_objection_handling.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_objection_handling.modify_time
     *
     * @return the value of t_mgm_objection_handling.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_objection_handling.modify_time
     *
     * @param modifyTime the value for t_mgm_objection_handling.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
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
        sb.append(", dissenter=").append(dissenter);
        sb.append(", objectionTime=").append(objectionTime);
        sb.append(", objectionDetails=").append(objectionDetails);
        sb.append(", companyName=").append(companyName);
        sb.append(", mobile=").append(mobile);
        sb.append(", handlingTime=").append(handlingTime);
        sb.append(", feedback=").append(feedback);
        sb.append(", state=").append(state);
        sb.append(", tableType=").append(tableType);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyPerson=").append(modifyPerson);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
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
        TMgmObjectionHandling other = (TMgmObjectionHandling) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDissenter() == null ? other.getDissenter() == null : this.getDissenter().equals(other.getDissenter()))
            && (this.getObjectionTime() == null ? other.getObjectionTime() == null : this.getObjectionTime().equals(other.getObjectionTime()))
            && (this.getObjectionDetails() == null ? other.getObjectionDetails() == null : this.getObjectionDetails().equals(other.getObjectionDetails()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getHandlingTime() == null ? other.getHandlingTime() == null : this.getHandlingTime().equals(other.getHandlingTime()))
            && (this.getFeedback() == null ? other.getFeedback() == null : this.getFeedback().equals(other.getFeedback()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getTableType() == null ? other.getTableType() == null : this.getTableType().equals(other.getTableType()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDissenter() == null) ? 0 : getDissenter().hashCode());
        result = prime * result + ((getObjectionTime() == null) ? 0 : getObjectionTime().hashCode());
        result = prime * result + ((getObjectionDetails() == null) ? 0 : getObjectionDetails().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getHandlingTime() == null) ? 0 : getHandlingTime().hashCode());
        result = prime * result + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getTableType() == null) ? 0 : getTableType().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        dissenter("dissenter", "dissenter", "CHAR", false),
        objectionTime("objection_time", "objectionTime", "TIMESTAMP", false),
        objectionDetails("objection_details", "objectionDetails", "VARCHAR", false),
        companyName("company_name", "companyName", "VARCHAR", false),
        mobile("mobile", "mobile", "VARCHAR", false),
        handlingTime("handling_time", "handlingTime", "TIMESTAMP", false),
        feedback("feedback", "feedback", "VARCHAR", false),
        state("state", "state", "INTEGER", true),
        tableType("table_type", "tableType", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_objection_handling
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
         * This method corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_objection_handling
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
         * This method corresponds to the database table t_mgm_objection_handling
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
         * This method corresponds to the database table t_mgm_objection_handling
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}