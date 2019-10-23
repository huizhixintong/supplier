package com.huizhi.supplier.db.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyLegalCar {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.plate_number
     *
     * @mbg.generated
     */
    private String plateNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.brand_model
     *
     * @mbg.generated
     */
    private String brandModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.frame_no
     *
     * @mbg.generated
     */
    private String frameNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.car_registerdate
     *
     * @mbg.generated
     */
    private LocalDate carRegisterdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.car_purchasedate
     *
     * @mbg.generated
     */
    private LocalDate carPurchasedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.car_purchasemoney
     *
     * @mbg.generated
     */
    private BigDecimal carPurchasemoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.propertytax_payment
     *
     * @mbg.generated
     */
    private String propertytaxPayment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.test_proof
     *
     * @mbg.generated
     */
    private String testProof;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_legal_car.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.id
     *
     * @return the value of t_cpy_legal_car.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.id
     *
     * @param id the value for t_cpy_legal_car.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.company_id
     *
     * @return the value of t_cpy_legal_car.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.company_id
     *
     * @param companyId the value for t_cpy_legal_car.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.plate_number
     *
     * @return the value of t_cpy_legal_car.plate_number
     *
     * @mbg.generated
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.plate_number
     *
     * @param plateNumber the value for t_cpy_legal_car.plate_number
     *
     * @mbg.generated
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.brand_model
     *
     * @return the value of t_cpy_legal_car.brand_model
     *
     * @mbg.generated
     */
    public String getBrandModel() {
        return brandModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.brand_model
     *
     * @param brandModel the value for t_cpy_legal_car.brand_model
     *
     * @mbg.generated
     */
    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.frame_no
     *
     * @return the value of t_cpy_legal_car.frame_no
     *
     * @mbg.generated
     */
    public String getFrameNo() {
        return frameNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.frame_no
     *
     * @param frameNo the value for t_cpy_legal_car.frame_no
     *
     * @mbg.generated
     */
    public void setFrameNo(String frameNo) {
        this.frameNo = frameNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.car_registerdate
     *
     * @return the value of t_cpy_legal_car.car_registerdate
     *
     * @mbg.generated
     */
    public LocalDate getCarRegisterdate() {
        return carRegisterdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.car_registerdate
     *
     * @param carRegisterdate the value for t_cpy_legal_car.car_registerdate
     *
     * @mbg.generated
     */
    public void setCarRegisterdate(LocalDate carRegisterdate) {
        this.carRegisterdate = carRegisterdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.car_purchasedate
     *
     * @return the value of t_cpy_legal_car.car_purchasedate
     *
     * @mbg.generated
     */
    public LocalDate getCarPurchasedate() {
        return carPurchasedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.car_purchasedate
     *
     * @param carPurchasedate the value for t_cpy_legal_car.car_purchasedate
     *
     * @mbg.generated
     */
    public void setCarPurchasedate(LocalDate carPurchasedate) {
        this.carPurchasedate = carPurchasedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.car_purchasemoney
     *
     * @return the value of t_cpy_legal_car.car_purchasemoney
     *
     * @mbg.generated
     */
    public BigDecimal getCarPurchasemoney() {
        return carPurchasemoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.car_purchasemoney
     *
     * @param carPurchasemoney the value for t_cpy_legal_car.car_purchasemoney
     *
     * @mbg.generated
     */
    public void setCarPurchasemoney(BigDecimal carPurchasemoney) {
        this.carPurchasemoney = carPurchasemoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.propertytax_payment
     *
     * @return the value of t_cpy_legal_car.propertytax_payment
     *
     * @mbg.generated
     */
    public String getPropertytaxPayment() {
        return propertytaxPayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.propertytax_payment
     *
     * @param propertytaxPayment the value for t_cpy_legal_car.propertytax_payment
     *
     * @mbg.generated
     */
    public void setPropertytaxPayment(String propertytaxPayment) {
        this.propertytaxPayment = propertytaxPayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.test_proof
     *
     * @return the value of t_cpy_legal_car.test_proof
     *
     * @mbg.generated
     */
    public String getTestProof() {
        return testProof;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.test_proof
     *
     * @param testProof the value for t_cpy_legal_car.test_proof
     *
     * @mbg.generated
     */
    public void setTestProof(String testProof) {
        this.testProof = testProof;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.create_person
     *
     * @return the value of t_cpy_legal_car.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.create_person
     *
     * @param createPerson the value for t_cpy_legal_car.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.create_time
     *
     * @return the value of t_cpy_legal_car.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.create_time
     *
     * @param createTime the value for t_cpy_legal_car.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.modify_person
     *
     * @return the value of t_cpy_legal_car.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.modify_person
     *
     * @param modifyPerson the value for t_cpy_legal_car.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.modify_time
     *
     * @return the value of t_cpy_legal_car.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.modify_time
     *
     * @param modifyTime the value for t_cpy_legal_car.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_legal_car.data_resource
     *
     * @return the value of t_cpy_legal_car.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_legal_car.data_resource
     *
     * @param dataResource the value for t_cpy_legal_car.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_car
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
        sb.append(", plateNumber=").append(plateNumber);
        sb.append(", brandModel=").append(brandModel);
        sb.append(", frameNo=").append(frameNo);
        sb.append(", carRegisterdate=").append(carRegisterdate);
        sb.append(", carPurchasedate=").append(carPurchasedate);
        sb.append(", carPurchasemoney=").append(carPurchasemoney);
        sb.append(", propertytaxPayment=").append(propertytaxPayment);
        sb.append(", testProof=").append(testProof);
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
     * This method corresponds to the database table t_cpy_legal_car
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
        TCpyLegalCar other = (TCpyLegalCar) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getPlateNumber() == null ? other.getPlateNumber() == null : this.getPlateNumber().equals(other.getPlateNumber()))
            && (this.getBrandModel() == null ? other.getBrandModel() == null : this.getBrandModel().equals(other.getBrandModel()))
            && (this.getFrameNo() == null ? other.getFrameNo() == null : this.getFrameNo().equals(other.getFrameNo()))
            && (this.getCarRegisterdate() == null ? other.getCarRegisterdate() == null : this.getCarRegisterdate().equals(other.getCarRegisterdate()))
            && (this.getCarPurchasedate() == null ? other.getCarPurchasedate() == null : this.getCarPurchasedate().equals(other.getCarPurchasedate()))
            && (this.getCarPurchasemoney() == null ? other.getCarPurchasemoney() == null : this.getCarPurchasemoney().equals(other.getCarPurchasemoney()))
            && (this.getPropertytaxPayment() == null ? other.getPropertytaxPayment() == null : this.getPropertytaxPayment().equals(other.getPropertytaxPayment()))
            && (this.getTestProof() == null ? other.getTestProof() == null : this.getTestProof().equals(other.getTestProof()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_car
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getPlateNumber() == null) ? 0 : getPlateNumber().hashCode());
        result = prime * result + ((getBrandModel() == null) ? 0 : getBrandModel().hashCode());
        result = prime * result + ((getFrameNo() == null) ? 0 : getFrameNo().hashCode());
        result = prime * result + ((getCarRegisterdate() == null) ? 0 : getCarRegisterdate().hashCode());
        result = prime * result + ((getCarPurchasedate() == null) ? 0 : getCarPurchasedate().hashCode());
        result = prime * result + ((getCarPurchasemoney() == null) ? 0 : getCarPurchasemoney().hashCode());
        result = prime * result + ((getPropertytaxPayment() == null) ? 0 : getPropertytaxPayment().hashCode());
        result = prime * result + ((getTestProof() == null) ? 0 : getTestProof().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_legal_car
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "VARCHAR", false),
        companyId("company_id", "companyId", "VARCHAR", false),
        plateNumber("plate_number", "plateNumber", "VARCHAR", false),
        brandModel("brand_model", "brandModel", "VARCHAR", false),
        frameNo("frame_no", "frameNo", "VARCHAR", false),
        carRegisterdate("car_registerdate", "carRegisterdate", "DATE", false),
        carPurchasedate("car_purchasedate", "carPurchasedate", "DATE", false),
        carPurchasemoney("car_purchasemoney", "carPurchasemoney", "DECIMAL", false),
        propertytaxPayment("propertytax_payment", "propertytaxPayment", "VARCHAR", false),
        testProof("test_proof", "testProof", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_car
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
         * This method corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_legal_car
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
         * This method corresponds to the database table t_cpy_legal_car
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
         * This method corresponds to the database table t_cpy_legal_car
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}