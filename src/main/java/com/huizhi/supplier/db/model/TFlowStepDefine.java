package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TFlowStepDefine {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.flow_code
     *
     * @mbg.generated
     */
    private String flowCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.point_id
     *
     * @mbg.generated
     */
    private Integer pointId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.point_type
     *
     * @mbg.generated
     */
    private String pointType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.superior_point
     *
     * @mbg.generated
     */
    private Integer superiorPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.point_name
     *
     * @mbg.generated
     */
    private String pointName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.enter_condition
     *
     * @mbg.generated
     */
    private String enterCondition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.manual_operation
     *
     * @mbg.generated
     */
    private String manualOperation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.execute_movement
     *
     * @mbg.generated
     */
    private String executeMovement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.operate_content
     *
     * @mbg.generated
     */
    private String operateContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.create_date
     *
     * @mbg.generated
     */
    private LocalDateTime createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flow_step_define.point_class
     *
     * @mbg.generated
     */
    private String pointClass;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.id
     *
     * @return the value of t_flow_step_define.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.id
     *
     * @param id the value for t_flow_step_define.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.flow_code
     *
     * @return the value of t_flow_step_define.flow_code
     *
     * @mbg.generated
     */
    public String getFlowCode() {
        return flowCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.flow_code
     *
     * @param flowCode the value for t_flow_step_define.flow_code
     *
     * @mbg.generated
     */
    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.point_id
     *
     * @return the value of t_flow_step_define.point_id
     *
     * @mbg.generated
     */
    public Integer getPointId() {
        return pointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.point_id
     *
     * @param pointId the value for t_flow_step_define.point_id
     *
     * @mbg.generated
     */
    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.point_type
     *
     * @return the value of t_flow_step_define.point_type
     *
     * @mbg.generated
     */
    public String getPointType() {
        return pointType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.point_type
     *
     * @param pointType the value for t_flow_step_define.point_type
     *
     * @mbg.generated
     */
    public void setPointType(String pointType) {
        this.pointType = pointType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.superior_point
     *
     * @return the value of t_flow_step_define.superior_point
     *
     * @mbg.generated
     */
    public Integer getSuperiorPoint() {
        return superiorPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.superior_point
     *
     * @param superiorPoint the value for t_flow_step_define.superior_point
     *
     * @mbg.generated
     */
    public void setSuperiorPoint(Integer superiorPoint) {
        this.superiorPoint = superiorPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.point_name
     *
     * @return the value of t_flow_step_define.point_name
     *
     * @mbg.generated
     */
    public String getPointName() {
        return pointName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.point_name
     *
     * @param pointName the value for t_flow_step_define.point_name
     *
     * @mbg.generated
     */
    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.enter_condition
     *
     * @return the value of t_flow_step_define.enter_condition
     *
     * @mbg.generated
     */
    public String getEnterCondition() {
        return enterCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.enter_condition
     *
     * @param enterCondition the value for t_flow_step_define.enter_condition
     *
     * @mbg.generated
     */
    public void setEnterCondition(String enterCondition) {
        this.enterCondition = enterCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.manual_operation
     *
     * @return the value of t_flow_step_define.manual_operation
     *
     * @mbg.generated
     */
    public String getManualOperation() {
        return manualOperation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.manual_operation
     *
     * @param manualOperation the value for t_flow_step_define.manual_operation
     *
     * @mbg.generated
     */
    public void setManualOperation(String manualOperation) {
        this.manualOperation = manualOperation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.execute_movement
     *
     * @return the value of t_flow_step_define.execute_movement
     *
     * @mbg.generated
     */
    public String getExecuteMovement() {
        return executeMovement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.execute_movement
     *
     * @param executeMovement the value for t_flow_step_define.execute_movement
     *
     * @mbg.generated
     */
    public void setExecuteMovement(String executeMovement) {
        this.executeMovement = executeMovement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.operate_content
     *
     * @return the value of t_flow_step_define.operate_content
     *
     * @mbg.generated
     */
    public String getOperateContent() {
        return operateContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.operate_content
     *
     * @param operateContent the value for t_flow_step_define.operate_content
     *
     * @mbg.generated
     */
    public void setOperateContent(String operateContent) {
        this.operateContent = operateContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.create_user
     *
     * @return the value of t_flow_step_define.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.create_user
     *
     * @param createUser the value for t_flow_step_define.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.create_date
     *
     * @return the value of t_flow_step_define.create_date
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.create_date
     *
     * @param createDate the value for t_flow_step_define.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flow_step_define.point_class
     *
     * @return the value of t_flow_step_define.point_class
     *
     * @mbg.generated
     */
    public String getPointClass() {
        return pointClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flow_step_define.point_class
     *
     * @param pointClass the value for t_flow_step_define.point_class
     *
     * @mbg.generated
     */
    public void setPointClass(String pointClass) {
        this.pointClass = pointClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
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
        sb.append(", flowCode=").append(flowCode);
        sb.append(", pointId=").append(pointId);
        sb.append(", pointType=").append(pointType);
        sb.append(", superiorPoint=").append(superiorPoint);
        sb.append(", pointName=").append(pointName);
        sb.append(", enterCondition=").append(enterCondition);
        sb.append(", manualOperation=").append(manualOperation);
        sb.append(", executeMovement=").append(executeMovement);
        sb.append(", operateContent=").append(operateContent);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", pointClass=").append(pointClass);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
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
        TFlowStepDefine other = (TFlowStepDefine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlowCode() == null ? other.getFlowCode() == null : this.getFlowCode().equals(other.getFlowCode()))
            && (this.getPointId() == null ? other.getPointId() == null : this.getPointId().equals(other.getPointId()))
            && (this.getPointType() == null ? other.getPointType() == null : this.getPointType().equals(other.getPointType()))
            && (this.getSuperiorPoint() == null ? other.getSuperiorPoint() == null : this.getSuperiorPoint().equals(other.getSuperiorPoint()))
            && (this.getPointName() == null ? other.getPointName() == null : this.getPointName().equals(other.getPointName()))
            && (this.getEnterCondition() == null ? other.getEnterCondition() == null : this.getEnterCondition().equals(other.getEnterCondition()))
            && (this.getManualOperation() == null ? other.getManualOperation() == null : this.getManualOperation().equals(other.getManualOperation()))
            && (this.getExecuteMovement() == null ? other.getExecuteMovement() == null : this.getExecuteMovement().equals(other.getExecuteMovement()))
            && (this.getOperateContent() == null ? other.getOperateContent() == null : this.getOperateContent().equals(other.getOperateContent()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getPointClass() == null ? other.getPointClass() == null : this.getPointClass().equals(other.getPointClass()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlowCode() == null) ? 0 : getFlowCode().hashCode());
        result = prime * result + ((getPointId() == null) ? 0 : getPointId().hashCode());
        result = prime * result + ((getPointType() == null) ? 0 : getPointType().hashCode());
        result = prime * result + ((getSuperiorPoint() == null) ? 0 : getSuperiorPoint().hashCode());
        result = prime * result + ((getPointName() == null) ? 0 : getPointName().hashCode());
        result = prime * result + ((getEnterCondition() == null) ? 0 : getEnterCondition().hashCode());
        result = prime * result + ((getManualOperation() == null) ? 0 : getManualOperation().hashCode());
        result = prime * result + ((getExecuteMovement() == null) ? 0 : getExecuteMovement().hashCode());
        result = prime * result + ((getOperateContent() == null) ? 0 : getOperateContent().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getPointClass() == null) ? 0 : getPointClass().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        flowCode("flow_code", "flowCode", "VARCHAR", false),
        pointId("point_id", "pointId", "INTEGER", false),
        pointType("point_type", "pointType", "CHAR", false),
        superiorPoint("superior_point", "superiorPoint", "INTEGER", false),
        pointName("point_name", "pointName", "VARCHAR", false),
        enterCondition("enter_condition", "enterCondition", "CHAR", false),
        manualOperation("manual_operation", "manualOperation", "CHAR", false),
        executeMovement("execute_movement", "executeMovement", "CHAR", false),
        operateContent("operate_content", "operateContent", "VARCHAR", false),
        createUser("create_user", "createUser", "VARCHAR", false),
        createDate("create_date", "createDate", "TIMESTAMP", false),
        pointClass("point_class", "pointClass", "CHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_flow_step_define
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
         * This method corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_flow_step_define
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
         * This method corresponds to the database table t_flow_step_define
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
         * This method corresponds to the database table t_flow_step_define
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}