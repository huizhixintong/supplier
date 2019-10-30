package com.huizhi.supplier.db.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyScientificResearchTechnicalServices {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.year
     *
     * @mbg.generated
     */
    private String year;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.total_research_expenditure
     *
     * @mbg.generated
     */
    private BigDecimal totalResearchExpenditure;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.achievement_count
     *
     * @mbg.generated
     */
    private Integer achievementCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.achievement_money
     *
     * @mbg.generated
     */
    private BigDecimal achievementMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.year_built_production_project_count
     *
     * @mbg.generated
     */
    private Integer yearBuiltProductionProjectCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.year_official_construction_projects_count
     *
     * @mbg.generated
     */
    private String yearOfficialConstructionProjectsCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.technical_cost
     *
     * @mbg.generated
     */
    private BigDecimal technicalCost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.annual_sales_revenue
     *
     * @mbg.generated
     */
    private BigDecimal annualSalesRevenue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_scientific_research_technical_services.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.id
     *
     * @return the value of t_cpy_scientific_research_technical_services.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.id
     *
     * @param id the value for t_cpy_scientific_research_technical_services.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.company_id
     *
     * @return the value of t_cpy_scientific_research_technical_services.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.company_id
     *
     * @param companyId the value for t_cpy_scientific_research_technical_services.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.year
     *
     * @return the value of t_cpy_scientific_research_technical_services.year
     *
     * @mbg.generated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.year
     *
     * @param year the value for t_cpy_scientific_research_technical_services.year
     *
     * @mbg.generated
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.total_research_expenditure
     *
     * @return the value of t_cpy_scientific_research_technical_services.total_research_expenditure
     *
     * @mbg.generated
     */
    public BigDecimal getTotalResearchExpenditure() {
        return totalResearchExpenditure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.total_research_expenditure
     *
     * @param totalResearchExpenditure the value for t_cpy_scientific_research_technical_services.total_research_expenditure
     *
     * @mbg.generated
     */
    public void setTotalResearchExpenditure(BigDecimal totalResearchExpenditure) {
        this.totalResearchExpenditure = totalResearchExpenditure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.achievement_count
     *
     * @return the value of t_cpy_scientific_research_technical_services.achievement_count
     *
     * @mbg.generated
     */
    public Integer getAchievementCount() {
        return achievementCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.achievement_count
     *
     * @param achievementCount the value for t_cpy_scientific_research_technical_services.achievement_count
     *
     * @mbg.generated
     */
    public void setAchievementCount(Integer achievementCount) {
        this.achievementCount = achievementCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.achievement_money
     *
     * @return the value of t_cpy_scientific_research_technical_services.achievement_money
     *
     * @mbg.generated
     */
    public BigDecimal getAchievementMoney() {
        return achievementMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.achievement_money
     *
     * @param achievementMoney the value for t_cpy_scientific_research_technical_services.achievement_money
     *
     * @mbg.generated
     */
    public void setAchievementMoney(BigDecimal achievementMoney) {
        this.achievementMoney = achievementMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.year_built_production_project_count
     *
     * @return the value of t_cpy_scientific_research_technical_services.year_built_production_project_count
     *
     * @mbg.generated
     */
    public Integer getYearBuiltProductionProjectCount() {
        return yearBuiltProductionProjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.year_built_production_project_count
     *
     * @param yearBuiltProductionProjectCount the value for t_cpy_scientific_research_technical_services.year_built_production_project_count
     *
     * @mbg.generated
     */
    public void setYearBuiltProductionProjectCount(Integer yearBuiltProductionProjectCount) {
        this.yearBuiltProductionProjectCount = yearBuiltProductionProjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.year_official_construction_projects_count
     *
     * @return the value of t_cpy_scientific_research_technical_services.year_official_construction_projects_count
     *
     * @mbg.generated
     */
    public String getYearOfficialConstructionProjectsCount() {
        return yearOfficialConstructionProjectsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.year_official_construction_projects_count
     *
     * @param yearOfficialConstructionProjectsCount the value for t_cpy_scientific_research_technical_services.year_official_construction_projects_count
     *
     * @mbg.generated
     */
    public void setYearOfficialConstructionProjectsCount(String yearOfficialConstructionProjectsCount) {
        this.yearOfficialConstructionProjectsCount = yearOfficialConstructionProjectsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.technical_cost
     *
     * @return the value of t_cpy_scientific_research_technical_services.technical_cost
     *
     * @mbg.generated
     */
    public BigDecimal getTechnicalCost() {
        return technicalCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.technical_cost
     *
     * @param technicalCost the value for t_cpy_scientific_research_technical_services.technical_cost
     *
     * @mbg.generated
     */
    public void setTechnicalCost(BigDecimal technicalCost) {
        this.technicalCost = technicalCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.annual_sales_revenue
     *
     * @return the value of t_cpy_scientific_research_technical_services.annual_sales_revenue
     *
     * @mbg.generated
     */
    public BigDecimal getAnnualSalesRevenue() {
        return annualSalesRevenue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.annual_sales_revenue
     *
     * @param annualSalesRevenue the value for t_cpy_scientific_research_technical_services.annual_sales_revenue
     *
     * @mbg.generated
     */
    public void setAnnualSalesRevenue(BigDecimal annualSalesRevenue) {
        this.annualSalesRevenue = annualSalesRevenue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.create_person
     *
     * @return the value of t_cpy_scientific_research_technical_services.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.create_person
     *
     * @param createPerson the value for t_cpy_scientific_research_technical_services.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.create_time
     *
     * @return the value of t_cpy_scientific_research_technical_services.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.create_time
     *
     * @param createTime the value for t_cpy_scientific_research_technical_services.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.modify_person
     *
     * @return the value of t_cpy_scientific_research_technical_services.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.modify_person
     *
     * @param modifyPerson the value for t_cpy_scientific_research_technical_services.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.modify_time
     *
     * @return the value of t_cpy_scientific_research_technical_services.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.modify_time
     *
     * @param modifyTime the value for t_cpy_scientific_research_technical_services.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_scientific_research_technical_services.data_resource
     *
     * @return the value of t_cpy_scientific_research_technical_services.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_scientific_research_technical_services.data_resource
     *
     * @param dataResource the value for t_cpy_scientific_research_technical_services.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_scientific_research_technical_services
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
        sb.append(", totalResearchExpenditure=").append(totalResearchExpenditure);
        sb.append(", achievementCount=").append(achievementCount);
        sb.append(", achievementMoney=").append(achievementMoney);
        sb.append(", yearBuiltProductionProjectCount=").append(yearBuiltProductionProjectCount);
        sb.append(", yearOfficialConstructionProjectsCount=").append(yearOfficialConstructionProjectsCount);
        sb.append(", technicalCost=").append(technicalCost);
        sb.append(", annualSalesRevenue=").append(annualSalesRevenue);
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
     * This method corresponds to the database table t_cpy_scientific_research_technical_services
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
        TCpyScientificResearchTechnicalServices other = (TCpyScientificResearchTechnicalServices) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getTotalResearchExpenditure() == null ? other.getTotalResearchExpenditure() == null : this.getTotalResearchExpenditure().equals(other.getTotalResearchExpenditure()))
            && (this.getAchievementCount() == null ? other.getAchievementCount() == null : this.getAchievementCount().equals(other.getAchievementCount()))
            && (this.getAchievementMoney() == null ? other.getAchievementMoney() == null : this.getAchievementMoney().equals(other.getAchievementMoney()))
            && (this.getYearBuiltProductionProjectCount() == null ? other.getYearBuiltProductionProjectCount() == null : this.getYearBuiltProductionProjectCount().equals(other.getYearBuiltProductionProjectCount()))
            && (this.getYearOfficialConstructionProjectsCount() == null ? other.getYearOfficialConstructionProjectsCount() == null : this.getYearOfficialConstructionProjectsCount().equals(other.getYearOfficialConstructionProjectsCount()))
            && (this.getTechnicalCost() == null ? other.getTechnicalCost() == null : this.getTechnicalCost().equals(other.getTechnicalCost()))
            && (this.getAnnualSalesRevenue() == null ? other.getAnnualSalesRevenue() == null : this.getAnnualSalesRevenue().equals(other.getAnnualSalesRevenue()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_scientific_research_technical_services
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
        result = prime * result + ((getTotalResearchExpenditure() == null) ? 0 : getTotalResearchExpenditure().hashCode());
        result = prime * result + ((getAchievementCount() == null) ? 0 : getAchievementCount().hashCode());
        result = prime * result + ((getAchievementMoney() == null) ? 0 : getAchievementMoney().hashCode());
        result = prime * result + ((getYearBuiltProductionProjectCount() == null) ? 0 : getYearBuiltProductionProjectCount().hashCode());
        result = prime * result + ((getYearOfficialConstructionProjectsCount() == null) ? 0 : getYearOfficialConstructionProjectsCount().hashCode());
        result = prime * result + ((getTechnicalCost() == null) ? 0 : getTechnicalCost().hashCode());
        result = prime * result + ((getAnnualSalesRevenue() == null) ? 0 : getAnnualSalesRevenue().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_scientific_research_technical_services
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "VARCHAR", false),
        year("year", "year", "CHAR", true),
        totalResearchExpenditure("total_research_expenditure", "totalResearchExpenditure", "DECIMAL", false),
        achievementCount("achievement_count", "achievementCount", "INTEGER", false),
        achievementMoney("achievement_money", "achievementMoney", "DECIMAL", false),
        yearBuiltProductionProjectCount("year_built_production_project_count", "yearBuiltProductionProjectCount", "INTEGER", false),
        yearOfficialConstructionProjectsCount("year_official_construction_projects_count", "yearOfficialConstructionProjectsCount", "VARCHAR", false),
        technicalCost("technical_cost", "technicalCost", "DECIMAL", false),
        annualSalesRevenue("annual_sales_revenue", "annualSalesRevenue", "DECIMAL", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
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
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
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
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
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
         * This method corresponds to the database table t_cpy_scientific_research_technical_services
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}