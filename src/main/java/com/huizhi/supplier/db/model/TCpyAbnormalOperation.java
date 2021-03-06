package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyAbnormalOperation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.operating_anomalies
     *
     * @mbg.generated
     */
    private String operatingAnomalies;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.date_inclusion
     *
     * @mbg.generated
     */
    private LocalDateTime dateInclusion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.decision_in
     *
     * @mbg.generated
     */
    private String decisionIn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.decision_move
     *
     * @mbg.generated
     */
    private String decisionMove;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.exception_list
     *
     * @mbg.generated
     */
    private String exceptionList;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.date_move
     *
     * @mbg.generated
     */
    private LocalDateTime dateMove;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_abnormal_operation.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.id
     *
     * @return the value of t_cpy_abnormal_operation.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.id
     *
     * @param id the value for t_cpy_abnormal_operation.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.company_id
     *
     * @return the value of t_cpy_abnormal_operation.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.company_id
     *
     * @param companyId the value for t_cpy_abnormal_operation.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.operating_anomalies
     *
     * @return the value of t_cpy_abnormal_operation.operating_anomalies
     *
     * @mbg.generated
     */
    public String getOperatingAnomalies() {
        return operatingAnomalies;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.operating_anomalies
     *
     * @param operatingAnomalies the value for t_cpy_abnormal_operation.operating_anomalies
     *
     * @mbg.generated
     */
    public void setOperatingAnomalies(String operatingAnomalies) {
        this.operatingAnomalies = operatingAnomalies;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.date_inclusion
     *
     * @return the value of t_cpy_abnormal_operation.date_inclusion
     *
     * @mbg.generated
     */
    public LocalDateTime getDateInclusion() {
        return dateInclusion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.date_inclusion
     *
     * @param dateInclusion the value for t_cpy_abnormal_operation.date_inclusion
     *
     * @mbg.generated
     */
    public void setDateInclusion(LocalDateTime dateInclusion) {
        this.dateInclusion = dateInclusion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.decision_in
     *
     * @return the value of t_cpy_abnormal_operation.decision_in
     *
     * @mbg.generated
     */
    public String getDecisionIn() {
        return decisionIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.decision_in
     *
     * @param decisionIn the value for t_cpy_abnormal_operation.decision_in
     *
     * @mbg.generated
     */
    public void setDecisionIn(String decisionIn) {
        this.decisionIn = decisionIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.decision_move
     *
     * @return the value of t_cpy_abnormal_operation.decision_move
     *
     * @mbg.generated
     */
    public String getDecisionMove() {
        return decisionMove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.decision_move
     *
     * @param decisionMove the value for t_cpy_abnormal_operation.decision_move
     *
     * @mbg.generated
     */
    public void setDecisionMove(String decisionMove) {
        this.decisionMove = decisionMove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.exception_list
     *
     * @return the value of t_cpy_abnormal_operation.exception_list
     *
     * @mbg.generated
     */
    public String getExceptionList() {
        return exceptionList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.exception_list
     *
     * @param exceptionList the value for t_cpy_abnormal_operation.exception_list
     *
     * @mbg.generated
     */
    public void setExceptionList(String exceptionList) {
        this.exceptionList = exceptionList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.date_move
     *
     * @return the value of t_cpy_abnormal_operation.date_move
     *
     * @mbg.generated
     */
    public LocalDateTime getDateMove() {
        return dateMove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.date_move
     *
     * @param dateMove the value for t_cpy_abnormal_operation.date_move
     *
     * @mbg.generated
     */
    public void setDateMove(LocalDateTime dateMove) {
        this.dateMove = dateMove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.create_person
     *
     * @return the value of t_cpy_abnormal_operation.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.create_person
     *
     * @param createPerson the value for t_cpy_abnormal_operation.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.create_time
     *
     * @return the value of t_cpy_abnormal_operation.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.create_time
     *
     * @param createTime the value for t_cpy_abnormal_operation.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.modify_person
     *
     * @return the value of t_cpy_abnormal_operation.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.modify_person
     *
     * @param modifyPerson the value for t_cpy_abnormal_operation.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.modify_time
     *
     * @return the value of t_cpy_abnormal_operation.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.modify_time
     *
     * @param modifyTime the value for t_cpy_abnormal_operation.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_abnormal_operation.data_resource
     *
     * @return the value of t_cpy_abnormal_operation.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_abnormal_operation.data_resource
     *
     * @param dataResource the value for t_cpy_abnormal_operation.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_abnormal_operation
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
        sb.append(", operatingAnomalies=").append(operatingAnomalies);
        sb.append(", dateInclusion=").append(dateInclusion);
        sb.append(", decisionIn=").append(decisionIn);
        sb.append(", decisionMove=").append(decisionMove);
        sb.append(", exceptionList=").append(exceptionList);
        sb.append(", dateMove=").append(dateMove);
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
     * This method corresponds to the database table t_cpy_abnormal_operation
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
        TCpyAbnormalOperation other = (TCpyAbnormalOperation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getOperatingAnomalies() == null ? other.getOperatingAnomalies() == null : this.getOperatingAnomalies().equals(other.getOperatingAnomalies()))
            && (this.getDateInclusion() == null ? other.getDateInclusion() == null : this.getDateInclusion().equals(other.getDateInclusion()))
            && (this.getDecisionIn() == null ? other.getDecisionIn() == null : this.getDecisionIn().equals(other.getDecisionIn()))
            && (this.getDecisionMove() == null ? other.getDecisionMove() == null : this.getDecisionMove().equals(other.getDecisionMove()))
            && (this.getExceptionList() == null ? other.getExceptionList() == null : this.getExceptionList().equals(other.getExceptionList()))
            && (this.getDateMove() == null ? other.getDateMove() == null : this.getDateMove().equals(other.getDateMove()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_abnormal_operation
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getOperatingAnomalies() == null) ? 0 : getOperatingAnomalies().hashCode());
        result = prime * result + ((getDateInclusion() == null) ? 0 : getDateInclusion().hashCode());
        result = prime * result + ((getDecisionIn() == null) ? 0 : getDecisionIn().hashCode());
        result = prime * result + ((getDecisionMove() == null) ? 0 : getDecisionMove().hashCode());
        result = prime * result + ((getExceptionList() == null) ? 0 : getExceptionList().hashCode());
        result = prime * result + ((getDateMove() == null) ? 0 : getDateMove().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_abnormal_operation
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        operatingAnomalies("operating_anomalies", "operatingAnomalies", "VARCHAR", false),
        dateInclusion("date_inclusion", "dateInclusion", "TIMESTAMP", false),
        decisionIn("decision_in", "decisionIn", "VARCHAR", false),
        decisionMove("decision_move", "decisionMove", "VARCHAR", false),
        exceptionList("exception_list", "exceptionList", "VARCHAR", false),
        dateMove("date_move", "dateMove", "TIMESTAMP", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_abnormal_operation
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
         * This method corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_abnormal_operation
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
         * This method corresponds to the database table t_cpy_abnormal_operation
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
         * This method corresponds to the database table t_cpy_abnormal_operation
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}