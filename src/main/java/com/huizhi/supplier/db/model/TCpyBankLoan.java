package com.huizhi.supplier.db.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyBankLoan {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.bank_credit_grade
     *
     * @mbg.generated
     */
    private String bankCreditGrade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.overdue_account_num
     *
     * @mbg.generated
     */
    private String overdueAccountNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.overdue_amount
     *
     * @mbg.generated
     */
    private BigDecimal overdueAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.unpaid_credit
     *
     * @mbg.generated
     */
    private BigDecimal unpaidCredit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.paid_credit
     *
     * @mbg.generated
     */
    private BigDecimal paidCredit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.unpaid_bond
     *
     * @mbg.generated
     */
    private BigDecimal unpaidBond;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.paid_bond
     *
     * @mbg.generated
     */
    private BigDecimal paidBond;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_bank_loan.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.id
     *
     * @return the value of t_cpy_bank_loan.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.id
     *
     * @param id the value for t_cpy_bank_loan.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.company_id
     *
     * @return the value of t_cpy_bank_loan.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.company_id
     *
     * @param companyId the value for t_cpy_bank_loan.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.bank_credit_grade
     *
     * @return the value of t_cpy_bank_loan.bank_credit_grade
     *
     * @mbg.generated
     */
    public String getBankCreditGrade() {
        return bankCreditGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.bank_credit_grade
     *
     * @param bankCreditGrade the value for t_cpy_bank_loan.bank_credit_grade
     *
     * @mbg.generated
     */
    public void setBankCreditGrade(String bankCreditGrade) {
        this.bankCreditGrade = bankCreditGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.overdue_account_num
     *
     * @return the value of t_cpy_bank_loan.overdue_account_num
     *
     * @mbg.generated
     */
    public String getOverdueAccountNum() {
        return overdueAccountNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.overdue_account_num
     *
     * @param overdueAccountNum the value for t_cpy_bank_loan.overdue_account_num
     *
     * @mbg.generated
     */
    public void setOverdueAccountNum(String overdueAccountNum) {
        this.overdueAccountNum = overdueAccountNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.overdue_amount
     *
     * @return the value of t_cpy_bank_loan.overdue_amount
     *
     * @mbg.generated
     */
    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.overdue_amount
     *
     * @param overdueAmount the value for t_cpy_bank_loan.overdue_amount
     *
     * @mbg.generated
     */
    public void setOverdueAmount(BigDecimal overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.unpaid_credit
     *
     * @return the value of t_cpy_bank_loan.unpaid_credit
     *
     * @mbg.generated
     */
    public BigDecimal getUnpaidCredit() {
        return unpaidCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.unpaid_credit
     *
     * @param unpaidCredit the value for t_cpy_bank_loan.unpaid_credit
     *
     * @mbg.generated
     */
    public void setUnpaidCredit(BigDecimal unpaidCredit) {
        this.unpaidCredit = unpaidCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.paid_credit
     *
     * @return the value of t_cpy_bank_loan.paid_credit
     *
     * @mbg.generated
     */
    public BigDecimal getPaidCredit() {
        return paidCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.paid_credit
     *
     * @param paidCredit the value for t_cpy_bank_loan.paid_credit
     *
     * @mbg.generated
     */
    public void setPaidCredit(BigDecimal paidCredit) {
        this.paidCredit = paidCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.unpaid_bond
     *
     * @return the value of t_cpy_bank_loan.unpaid_bond
     *
     * @mbg.generated
     */
    public BigDecimal getUnpaidBond() {
        return unpaidBond;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.unpaid_bond
     *
     * @param unpaidBond the value for t_cpy_bank_loan.unpaid_bond
     *
     * @mbg.generated
     */
    public void setUnpaidBond(BigDecimal unpaidBond) {
        this.unpaidBond = unpaidBond;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.paid_bond
     *
     * @return the value of t_cpy_bank_loan.paid_bond
     *
     * @mbg.generated
     */
    public BigDecimal getPaidBond() {
        return paidBond;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.paid_bond
     *
     * @param paidBond the value for t_cpy_bank_loan.paid_bond
     *
     * @mbg.generated
     */
    public void setPaidBond(BigDecimal paidBond) {
        this.paidBond = paidBond;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.create_person
     *
     * @return the value of t_cpy_bank_loan.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.create_person
     *
     * @param createPerson the value for t_cpy_bank_loan.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.create_time
     *
     * @return the value of t_cpy_bank_loan.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.create_time
     *
     * @param createTime the value for t_cpy_bank_loan.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.modify_person
     *
     * @return the value of t_cpy_bank_loan.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.modify_person
     *
     * @param modifyPerson the value for t_cpy_bank_loan.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.modify_time
     *
     * @return the value of t_cpy_bank_loan.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.modify_time
     *
     * @param modifyTime the value for t_cpy_bank_loan.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_bank_loan.data_resource
     *
     * @return the value of t_cpy_bank_loan.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_bank_loan.data_resource
     *
     * @param dataResource the value for t_cpy_bank_loan.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_loan
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
        sb.append(", bankCreditGrade=").append(bankCreditGrade);
        sb.append(", overdueAccountNum=").append(overdueAccountNum);
        sb.append(", overdueAmount=").append(overdueAmount);
        sb.append(", unpaidCredit=").append(unpaidCredit);
        sb.append(", paidCredit=").append(paidCredit);
        sb.append(", unpaidBond=").append(unpaidBond);
        sb.append(", paidBond=").append(paidBond);
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
     * This method corresponds to the database table t_cpy_bank_loan
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
        TCpyBankLoan other = (TCpyBankLoan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getBankCreditGrade() == null ? other.getBankCreditGrade() == null : this.getBankCreditGrade().equals(other.getBankCreditGrade()))
            && (this.getOverdueAccountNum() == null ? other.getOverdueAccountNum() == null : this.getOverdueAccountNum().equals(other.getOverdueAccountNum()))
            && (this.getOverdueAmount() == null ? other.getOverdueAmount() == null : this.getOverdueAmount().equals(other.getOverdueAmount()))
            && (this.getUnpaidCredit() == null ? other.getUnpaidCredit() == null : this.getUnpaidCredit().equals(other.getUnpaidCredit()))
            && (this.getPaidCredit() == null ? other.getPaidCredit() == null : this.getPaidCredit().equals(other.getPaidCredit()))
            && (this.getUnpaidBond() == null ? other.getUnpaidBond() == null : this.getUnpaidBond().equals(other.getUnpaidBond()))
            && (this.getPaidBond() == null ? other.getPaidBond() == null : this.getPaidBond().equals(other.getPaidBond()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_loan
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getBankCreditGrade() == null) ? 0 : getBankCreditGrade().hashCode());
        result = prime * result + ((getOverdueAccountNum() == null) ? 0 : getOverdueAccountNum().hashCode());
        result = prime * result + ((getOverdueAmount() == null) ? 0 : getOverdueAmount().hashCode());
        result = prime * result + ((getUnpaidCredit() == null) ? 0 : getUnpaidCredit().hashCode());
        result = prime * result + ((getPaidCredit() == null) ? 0 : getPaidCredit().hashCode());
        result = prime * result + ((getUnpaidBond() == null) ? 0 : getUnpaidBond().hashCode());
        result = prime * result + ((getPaidBond() == null) ? 0 : getPaidBond().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_bank_loan
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        bankCreditGrade("bank_credit_grade", "bankCreditGrade", "VARCHAR", false),
        overdueAccountNum("overdue_account_num", "overdueAccountNum", "VARCHAR", false),
        overdueAmount("overdue_amount", "overdueAmount", "DECIMAL", false),
        unpaidCredit("unpaid_credit", "unpaidCredit", "DECIMAL", false),
        paidCredit("paid_credit", "paidCredit", "DECIMAL", false),
        unpaidBond("unpaid_bond", "unpaidBond", "DECIMAL", false),
        paidBond("paid_bond", "paidBond", "DECIMAL", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_bank_loan
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
         * This method corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_bank_loan
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
         * This method corresponds to the database table t_cpy_bank_loan
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
         * This method corresponds to the database table t_cpy_bank_loan
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}