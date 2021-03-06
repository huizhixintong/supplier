package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyCustomer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.customer_name
     *
     * @mbg.generated
     */
    private String customerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.customer_credit_code
     *
     * @mbg.generated
     */
    private String customerCreditCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.customer_org_code
     *
     * @mbg.generated
     */
    private String customerOrgCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.customer_register_code
     *
     * @mbg.generated
     */
    private String customerRegisterCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_customer.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.id
     *
     * @return the value of t_cpy_customer.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.id
     *
     * @param id the value for t_cpy_customer.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.company_id
     *
     * @return the value of t_cpy_customer.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.company_id
     *
     * @param companyId the value for t_cpy_customer.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.customer_name
     *
     * @return the value of t_cpy_customer.customer_name
     *
     * @mbg.generated
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.customer_name
     *
     * @param customerName the value for t_cpy_customer.customer_name
     *
     * @mbg.generated
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.customer_credit_code
     *
     * @return the value of t_cpy_customer.customer_credit_code
     *
     * @mbg.generated
     */
    public String getCustomerCreditCode() {
        return customerCreditCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.customer_credit_code
     *
     * @param customerCreditCode the value for t_cpy_customer.customer_credit_code
     *
     * @mbg.generated
     */
    public void setCustomerCreditCode(String customerCreditCode) {
        this.customerCreditCode = customerCreditCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.customer_org_code
     *
     * @return the value of t_cpy_customer.customer_org_code
     *
     * @mbg.generated
     */
    public String getCustomerOrgCode() {
        return customerOrgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.customer_org_code
     *
     * @param customerOrgCode the value for t_cpy_customer.customer_org_code
     *
     * @mbg.generated
     */
    public void setCustomerOrgCode(String customerOrgCode) {
        this.customerOrgCode = customerOrgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.customer_register_code
     *
     * @return the value of t_cpy_customer.customer_register_code
     *
     * @mbg.generated
     */
    public String getCustomerRegisterCode() {
        return customerRegisterCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.customer_register_code
     *
     * @param customerRegisterCode the value for t_cpy_customer.customer_register_code
     *
     * @mbg.generated
     */
    public void setCustomerRegisterCode(String customerRegisterCode) {
        this.customerRegisterCode = customerRegisterCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.create_person
     *
     * @return the value of t_cpy_customer.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.create_person
     *
     * @param createPerson the value for t_cpy_customer.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.create_time
     *
     * @return the value of t_cpy_customer.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.create_time
     *
     * @param createTime the value for t_cpy_customer.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.modify_person
     *
     * @return the value of t_cpy_customer.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.modify_person
     *
     * @param modifyPerson the value for t_cpy_customer.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.modify_time
     *
     * @return the value of t_cpy_customer.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.modify_time
     *
     * @param modifyTime the value for t_cpy_customer.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_customer.data_resource
     *
     * @return the value of t_cpy_customer.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_customer.data_resource
     *
     * @param dataResource the value for t_cpy_customer.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
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
        sb.append(", customerName=").append(customerName);
        sb.append(", customerCreditCode=").append(customerCreditCode);
        sb.append(", customerOrgCode=").append(customerOrgCode);
        sb.append(", customerRegisterCode=").append(customerRegisterCode);
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
     * This method corresponds to the database table t_cpy_customer
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
        TCpyCustomer other = (TCpyCustomer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerCreditCode() == null ? other.getCustomerCreditCode() == null : this.getCustomerCreditCode().equals(other.getCustomerCreditCode()))
            && (this.getCustomerOrgCode() == null ? other.getCustomerOrgCode() == null : this.getCustomerOrgCode().equals(other.getCustomerOrgCode()))
            && (this.getCustomerRegisterCode() == null ? other.getCustomerRegisterCode() == null : this.getCustomerRegisterCode().equals(other.getCustomerRegisterCode()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerCreditCode() == null) ? 0 : getCustomerCreditCode().hashCode());
        result = prime * result + ((getCustomerOrgCode() == null) ? 0 : getCustomerOrgCode().hashCode());
        result = prime * result + ((getCustomerRegisterCode() == null) ? 0 : getCustomerRegisterCode().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        customerName("customer_name", "customerName", "VARCHAR", false),
        customerCreditCode("customer_credit_code", "customerCreditCode", "VARCHAR", false),
        customerOrgCode("customer_org_code", "customerOrgCode", "VARCHAR", false),
        customerRegisterCode("customer_register_code", "customerRegisterCode", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_customer
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
         * This method corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_customer
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
         * This method corresponds to the database table t_cpy_customer
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
         * This method corresponds to the database table t_cpy_customer
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}