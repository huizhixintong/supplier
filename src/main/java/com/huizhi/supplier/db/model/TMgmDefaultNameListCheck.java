package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TMgmDefaultNameListCheck {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_default_name_list_check.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_default_name_list_check.defaul_id
     *
     * @mbg.generated
     */
    private String defaulId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_default_name_list_check.check_user_id
     *
     * @mbg.generated
     */
    private String checkUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_default_name_list_check.audit_by_reason
     *
     * @mbg.generated
     */
    private String auditByReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_default_name_list_check.check_status
     *
     * @mbg.generated
     */
    private String checkStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_default_name_list_check.check_time
     *
     * @mbg.generated
     */
    private LocalDateTime checkTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_default_name_list_check.id
     *
     * @return the value of t_mgm_default_name_list_check.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_default_name_list_check.id
     *
     * @param id the value for t_mgm_default_name_list_check.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_default_name_list_check.defaul_id
     *
     * @return the value of t_mgm_default_name_list_check.defaul_id
     *
     * @mbg.generated
     */
    public String getDefaulId() {
        return defaulId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_default_name_list_check.defaul_id
     *
     * @param defaulId the value for t_mgm_default_name_list_check.defaul_id
     *
     * @mbg.generated
     */
    public void setDefaulId(String defaulId) {
        this.defaulId = defaulId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_default_name_list_check.check_user_id
     *
     * @return the value of t_mgm_default_name_list_check.check_user_id
     *
     * @mbg.generated
     */
    public String getCheckUserId() {
        return checkUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_default_name_list_check.check_user_id
     *
     * @param checkUserId the value for t_mgm_default_name_list_check.check_user_id
     *
     * @mbg.generated
     */
    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_default_name_list_check.audit_by_reason
     *
     * @return the value of t_mgm_default_name_list_check.audit_by_reason
     *
     * @mbg.generated
     */
    public String getAuditByReason() {
        return auditByReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_default_name_list_check.audit_by_reason
     *
     * @param auditByReason the value for t_mgm_default_name_list_check.audit_by_reason
     *
     * @mbg.generated
     */
    public void setAuditByReason(String auditByReason) {
        this.auditByReason = auditByReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_default_name_list_check.check_status
     *
     * @return the value of t_mgm_default_name_list_check.check_status
     *
     * @mbg.generated
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_default_name_list_check.check_status
     *
     * @param checkStatus the value for t_mgm_default_name_list_check.check_status
     *
     * @mbg.generated
     */
    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_default_name_list_check.check_time
     *
     * @return the value of t_mgm_default_name_list_check.check_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_default_name_list_check.check_time
     *
     * @param checkTime the value for t_mgm_default_name_list_check.check_time
     *
     * @mbg.generated
     */
    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
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
        sb.append(", defaulId=").append(defaulId);
        sb.append(", checkUserId=").append(checkUserId);
        sb.append(", auditByReason=").append(auditByReason);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", checkTime=").append(checkTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
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
        TMgmDefaultNameListCheck other = (TMgmDefaultNameListCheck) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDefaulId() == null ? other.getDefaulId() == null : this.getDefaulId().equals(other.getDefaulId()))
            && (this.getCheckUserId() == null ? other.getCheckUserId() == null : this.getCheckUserId().equals(other.getCheckUserId()))
            && (this.getAuditByReason() == null ? other.getAuditByReason() == null : this.getAuditByReason().equals(other.getAuditByReason()))
            && (this.getCheckStatus() == null ? other.getCheckStatus() == null : this.getCheckStatus().equals(other.getCheckStatus()))
            && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDefaulId() == null) ? 0 : getDefaulId().hashCode());
        result = prime * result + ((getCheckUserId() == null) ? 0 : getCheckUserId().hashCode());
        result = prime * result + ((getAuditByReason() == null) ? 0 : getAuditByReason().hashCode());
        result = prime * result + ((getCheckStatus() == null) ? 0 : getCheckStatus().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "VARCHAR", false),
        defaulId("defaul_id", "defaulId", "VARCHAR", false),
        checkUserId("check_user_id", "checkUserId", "VARCHAR", false),
        auditByReason("audit_by_reason", "auditByReason", "VARCHAR", false),
        checkStatus("check_status", "checkStatus", "VARCHAR", false),
        checkTime("check_time", "checkTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_default_name_list_check
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
         * This method corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_default_name_list_check
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
         * This method corresponds to the database table t_mgm_default_name_list_check
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
         * This method corresponds to the database table t_mgm_default_name_list_check
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}