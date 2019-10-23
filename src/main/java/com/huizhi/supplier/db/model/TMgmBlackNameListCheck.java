package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TMgmBlackNameListCheck {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.black_id
     *
     * @mbg.generated
     */
    private String blackId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.credit_code
     *
     * @mbg.generated
     */
    private String creditCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.org_code
     *
     * @mbg.generated
     */
    private String orgCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.register_code
     *
     * @mbg.generated
     */
    private String registerCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.Join_the_blacklist
     *
     * @mbg.generated
     */
    private String joinTheBlacklist;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.approved_the_blacklist
     *
     * @mbg.generated
     */
    private String approvedTheBlacklist;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.audit_not_through_the_blacklist
     *
     * @mbg.generated
     */
    private String auditNotThroughTheBlacklist;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.cancel_the_blacklist_reason
     *
     * @mbg.generated
     */
    private String cancelTheBlacklistReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.approved_cancel_the_blacklist
     *
     * @mbg.generated
     */
    private String approvedCancelTheBlacklist;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.audit_is_not_by_eliminating_blacklist
     *
     * @mbg.generated
     */
    private String auditIsNotByEliminatingBlacklist;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.apply_user_id
     *
     * @mbg.generated
     */
    private String applyUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.apply_user_name
     *
     * @mbg.generated
     */
    private String applyUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.apply_time
     *
     * @mbg.generated
     */
    private LocalDateTime applyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.check_user_name
     *
     * @mbg.generated
     */
    private String checkUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.check_user_id
     *
     * @mbg.generated
     */
    private String checkUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mgm_black_name_list_check.check_time
     *
     * @mbg.generated
     */
    private LocalDateTime checkTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.id
     *
     * @return the value of t_mgm_black_name_list_check.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.id
     *
     * @param id the value for t_mgm_black_name_list_check.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.black_id
     *
     * @return the value of t_mgm_black_name_list_check.black_id
     *
     * @mbg.generated
     */
    public String getBlackId() {
        return blackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.black_id
     *
     * @param blackId the value for t_mgm_black_name_list_check.black_id
     *
     * @mbg.generated
     */
    public void setBlackId(String blackId) {
        this.blackId = blackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.name
     *
     * @return the value of t_mgm_black_name_list_check.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.name
     *
     * @param name the value for t_mgm_black_name_list_check.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.credit_code
     *
     * @return the value of t_mgm_black_name_list_check.credit_code
     *
     * @mbg.generated
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.credit_code
     *
     * @param creditCode the value for t_mgm_black_name_list_check.credit_code
     *
     * @mbg.generated
     */
    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.org_code
     *
     * @return the value of t_mgm_black_name_list_check.org_code
     *
     * @mbg.generated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.org_code
     *
     * @param orgCode the value for t_mgm_black_name_list_check.org_code
     *
     * @mbg.generated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.register_code
     *
     * @return the value of t_mgm_black_name_list_check.register_code
     *
     * @mbg.generated
     */
    public String getRegisterCode() {
        return registerCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.register_code
     *
     * @param registerCode the value for t_mgm_black_name_list_check.register_code
     *
     * @mbg.generated
     */
    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.state
     *
     * @return the value of t_mgm_black_name_list_check.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.state
     *
     * @param state the value for t_mgm_black_name_list_check.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.Join_the_blacklist
     *
     * @return the value of t_mgm_black_name_list_check.Join_the_blacklist
     *
     * @mbg.generated
     */
    public String getJoinTheBlacklist() {
        return joinTheBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.Join_the_blacklist
     *
     * @param joinTheBlacklist the value for t_mgm_black_name_list_check.Join_the_blacklist
     *
     * @mbg.generated
     */
    public void setJoinTheBlacklist(String joinTheBlacklist) {
        this.joinTheBlacklist = joinTheBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.approved_the_blacklist
     *
     * @return the value of t_mgm_black_name_list_check.approved_the_blacklist
     *
     * @mbg.generated
     */
    public String getApprovedTheBlacklist() {
        return approvedTheBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.approved_the_blacklist
     *
     * @param approvedTheBlacklist the value for t_mgm_black_name_list_check.approved_the_blacklist
     *
     * @mbg.generated
     */
    public void setApprovedTheBlacklist(String approvedTheBlacklist) {
        this.approvedTheBlacklist = approvedTheBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.audit_not_through_the_blacklist
     *
     * @return the value of t_mgm_black_name_list_check.audit_not_through_the_blacklist
     *
     * @mbg.generated
     */
    public String getAuditNotThroughTheBlacklist() {
        return auditNotThroughTheBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.audit_not_through_the_blacklist
     *
     * @param auditNotThroughTheBlacklist the value for t_mgm_black_name_list_check.audit_not_through_the_blacklist
     *
     * @mbg.generated
     */
    public void setAuditNotThroughTheBlacklist(String auditNotThroughTheBlacklist) {
        this.auditNotThroughTheBlacklist = auditNotThroughTheBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.cancel_the_blacklist_reason
     *
     * @return the value of t_mgm_black_name_list_check.cancel_the_blacklist_reason
     *
     * @mbg.generated
     */
    public String getCancelTheBlacklistReason() {
        return cancelTheBlacklistReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.cancel_the_blacklist_reason
     *
     * @param cancelTheBlacklistReason the value for t_mgm_black_name_list_check.cancel_the_blacklist_reason
     *
     * @mbg.generated
     */
    public void setCancelTheBlacklistReason(String cancelTheBlacklistReason) {
        this.cancelTheBlacklistReason = cancelTheBlacklistReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.approved_cancel_the_blacklist
     *
     * @return the value of t_mgm_black_name_list_check.approved_cancel_the_blacklist
     *
     * @mbg.generated
     */
    public String getApprovedCancelTheBlacklist() {
        return approvedCancelTheBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.approved_cancel_the_blacklist
     *
     * @param approvedCancelTheBlacklist the value for t_mgm_black_name_list_check.approved_cancel_the_blacklist
     *
     * @mbg.generated
     */
    public void setApprovedCancelTheBlacklist(String approvedCancelTheBlacklist) {
        this.approvedCancelTheBlacklist = approvedCancelTheBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.audit_is_not_by_eliminating_blacklist
     *
     * @return the value of t_mgm_black_name_list_check.audit_is_not_by_eliminating_blacklist
     *
     * @mbg.generated
     */
    public String getAuditIsNotByEliminatingBlacklist() {
        return auditIsNotByEliminatingBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.audit_is_not_by_eliminating_blacklist
     *
     * @param auditIsNotByEliminatingBlacklist the value for t_mgm_black_name_list_check.audit_is_not_by_eliminating_blacklist
     *
     * @mbg.generated
     */
    public void setAuditIsNotByEliminatingBlacklist(String auditIsNotByEliminatingBlacklist) {
        this.auditIsNotByEliminatingBlacklist = auditIsNotByEliminatingBlacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.apply_user_id
     *
     * @return the value of t_mgm_black_name_list_check.apply_user_id
     *
     * @mbg.generated
     */
    public String getApplyUserId() {
        return applyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.apply_user_id
     *
     * @param applyUserId the value for t_mgm_black_name_list_check.apply_user_id
     *
     * @mbg.generated
     */
    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.apply_user_name
     *
     * @return the value of t_mgm_black_name_list_check.apply_user_name
     *
     * @mbg.generated
     */
    public String getApplyUserName() {
        return applyUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.apply_user_name
     *
     * @param applyUserName the value for t_mgm_black_name_list_check.apply_user_name
     *
     * @mbg.generated
     */
    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.apply_time
     *
     * @return the value of t_mgm_black_name_list_check.apply_time
     *
     * @mbg.generated
     */
    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.apply_time
     *
     * @param applyTime the value for t_mgm_black_name_list_check.apply_time
     *
     * @mbg.generated
     */
    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.check_user_name
     *
     * @return the value of t_mgm_black_name_list_check.check_user_name
     *
     * @mbg.generated
     */
    public String getCheckUserName() {
        return checkUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.check_user_name
     *
     * @param checkUserName the value for t_mgm_black_name_list_check.check_user_name
     *
     * @mbg.generated
     */
    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.check_user_id
     *
     * @return the value of t_mgm_black_name_list_check.check_user_id
     *
     * @mbg.generated
     */
    public String getCheckUserId() {
        return checkUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.check_user_id
     *
     * @param checkUserId the value for t_mgm_black_name_list_check.check_user_id
     *
     * @mbg.generated
     */
    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mgm_black_name_list_check.check_time
     *
     * @return the value of t_mgm_black_name_list_check.check_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mgm_black_name_list_check.check_time
     *
     * @param checkTime the value for t_mgm_black_name_list_check.check_time
     *
     * @mbg.generated
     */
    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_black_name_list_check
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
        sb.append(", blackId=").append(blackId);
        sb.append(", name=").append(name);
        sb.append(", creditCode=").append(creditCode);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", registerCode=").append(registerCode);
        sb.append(", state=").append(state);
        sb.append(", joinTheBlacklist=").append(joinTheBlacklist);
        sb.append(", approvedTheBlacklist=").append(approvedTheBlacklist);
        sb.append(", auditNotThroughTheBlacklist=").append(auditNotThroughTheBlacklist);
        sb.append(", cancelTheBlacklistReason=").append(cancelTheBlacklistReason);
        sb.append(", approvedCancelTheBlacklist=").append(approvedCancelTheBlacklist);
        sb.append(", auditIsNotByEliminatingBlacklist=").append(auditIsNotByEliminatingBlacklist);
        sb.append(", applyUserId=").append(applyUserId);
        sb.append(", applyUserName=").append(applyUserName);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", checkUserName=").append(checkUserName);
        sb.append(", checkUserId=").append(checkUserId);
        sb.append(", checkTime=").append(checkTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_black_name_list_check
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
        TMgmBlackNameListCheck other = (TMgmBlackNameListCheck) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBlackId() == null ? other.getBlackId() == null : this.getBlackId().equals(other.getBlackId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreditCode() == null ? other.getCreditCode() == null : this.getCreditCode().equals(other.getCreditCode()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getRegisterCode() == null ? other.getRegisterCode() == null : this.getRegisterCode().equals(other.getRegisterCode()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getJoinTheBlacklist() == null ? other.getJoinTheBlacklist() == null : this.getJoinTheBlacklist().equals(other.getJoinTheBlacklist()))
            && (this.getApprovedTheBlacklist() == null ? other.getApprovedTheBlacklist() == null : this.getApprovedTheBlacklist().equals(other.getApprovedTheBlacklist()))
            && (this.getAuditNotThroughTheBlacklist() == null ? other.getAuditNotThroughTheBlacklist() == null : this.getAuditNotThroughTheBlacklist().equals(other.getAuditNotThroughTheBlacklist()))
            && (this.getCancelTheBlacklistReason() == null ? other.getCancelTheBlacklistReason() == null : this.getCancelTheBlacklistReason().equals(other.getCancelTheBlacklistReason()))
            && (this.getApprovedCancelTheBlacklist() == null ? other.getApprovedCancelTheBlacklist() == null : this.getApprovedCancelTheBlacklist().equals(other.getApprovedCancelTheBlacklist()))
            && (this.getAuditIsNotByEliminatingBlacklist() == null ? other.getAuditIsNotByEliminatingBlacklist() == null : this.getAuditIsNotByEliminatingBlacklist().equals(other.getAuditIsNotByEliminatingBlacklist()))
            && (this.getApplyUserId() == null ? other.getApplyUserId() == null : this.getApplyUserId().equals(other.getApplyUserId()))
            && (this.getApplyUserName() == null ? other.getApplyUserName() == null : this.getApplyUserName().equals(other.getApplyUserName()))
            && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
            && (this.getCheckUserName() == null ? other.getCheckUserName() == null : this.getCheckUserName().equals(other.getCheckUserName()))
            && (this.getCheckUserId() == null ? other.getCheckUserId() == null : this.getCheckUserId().equals(other.getCheckUserId()))
            && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_black_name_list_check
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBlackId() == null) ? 0 : getBlackId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreditCode() == null) ? 0 : getCreditCode().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getRegisterCode() == null) ? 0 : getRegisterCode().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getJoinTheBlacklist() == null) ? 0 : getJoinTheBlacklist().hashCode());
        result = prime * result + ((getApprovedTheBlacklist() == null) ? 0 : getApprovedTheBlacklist().hashCode());
        result = prime * result + ((getAuditNotThroughTheBlacklist() == null) ? 0 : getAuditNotThroughTheBlacklist().hashCode());
        result = prime * result + ((getCancelTheBlacklistReason() == null) ? 0 : getCancelTheBlacklistReason().hashCode());
        result = prime * result + ((getApprovedCancelTheBlacklist() == null) ? 0 : getApprovedCancelTheBlacklist().hashCode());
        result = prime * result + ((getAuditIsNotByEliminatingBlacklist() == null) ? 0 : getAuditIsNotByEliminatingBlacklist().hashCode());
        result = prime * result + ((getApplyUserId() == null) ? 0 : getApplyUserId().hashCode());
        result = prime * result + ((getApplyUserName() == null) ? 0 : getApplyUserName().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getCheckUserName() == null) ? 0 : getCheckUserName().hashCode());
        result = prime * result + ((getCheckUserId() == null) ? 0 : getCheckUserId().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_mgm_black_name_list_check
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "VARCHAR", false),
        blackId("black_id", "blackId", "VARCHAR", false),
        name("name", "name", "VARCHAR", true),
        creditCode("credit_code", "creditCode", "VARCHAR", false),
        orgCode("org_code", "orgCode", "VARCHAR", false),
        registerCode("register_code", "registerCode", "VARCHAR", false),
        state("state", "state", "CHAR", true),
        joinTheBlacklist("Join_the_blacklist", "joinTheBlacklist", "VARCHAR", false),
        approvedTheBlacklist("approved_the_blacklist", "approvedTheBlacklist", "VARCHAR", false),
        auditNotThroughTheBlacklist("audit_not_through_the_blacklist", "auditNotThroughTheBlacklist", "VARCHAR", false),
        cancelTheBlacklistReason("cancel_the_blacklist_reason", "cancelTheBlacklistReason", "VARCHAR", false),
        approvedCancelTheBlacklist("approved_cancel_the_blacklist", "approvedCancelTheBlacklist", "VARCHAR", false),
        auditIsNotByEliminatingBlacklist("audit_is_not_by_eliminating_blacklist", "auditIsNotByEliminatingBlacklist", "VARCHAR", false),
        applyUserId("apply_user_id", "applyUserId", "VARCHAR", false),
        applyUserName("apply_user_name", "applyUserName", "VARCHAR", false),
        applyTime("apply_time", "applyTime", "TIMESTAMP", false),
        checkUserName("check_user_name", "checkUserName", "VARCHAR", false),
        checkUserId("check_user_id", "checkUserId", "VARCHAR", false),
        checkTime("check_time", "checkTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_black_name_list_check
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
         * This method corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_mgm_black_name_list_check
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
         * This method corresponds to the database table t_mgm_black_name_list_check
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
         * This method corresponds to the database table t_mgm_black_name_list_check
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}