package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TCpyFlangingRegulationReportExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public TCpyFlangingRegulationReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public TCpyFlangingRegulationReportExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public TCpyFlangingRegulationReportExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public static Criteria newAndCreateCriteria() {
        TCpyFlangingRegulationReportExample example = new TCpyFlangingRegulationReportExample();
        return example.createCriteria();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public TCpyFlangingRegulationReportExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public TCpyFlangingRegulationReportExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andIdEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andIdNotEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andIdGreaterThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andIdGreaterThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andIdLessThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andIdLessThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andCompanyIdEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("company_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andCompanyIdNotEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("company_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andCompanyIdGreaterThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("company_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andCompanyIdGreaterThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("company_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andCompanyIdLessThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("company_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andCompanyIdLessThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("company_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathIsNull() {
            addCriterion("report_generate_path is null");
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathIsNotNull() {
            addCriterion("report_generate_path is not null");
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathEqualTo(String value) {
            addCriterion("report_generate_path =", value, "reportGeneratePath");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGeneratePathEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_path = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathNotEqualTo(String value) {
            addCriterion("report_generate_path <>", value, "reportGeneratePath");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGeneratePathNotEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_path <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathGreaterThan(String value) {
            addCriterion("report_generate_path >", value, "reportGeneratePath");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGeneratePathGreaterThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_path > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathGreaterThanOrEqualTo(String value) {
            addCriterion("report_generate_path >=", value, "reportGeneratePath");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGeneratePathGreaterThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_path >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathLessThan(String value) {
            addCriterion("report_generate_path <", value, "reportGeneratePath");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGeneratePathLessThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_path < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathLessThanOrEqualTo(String value) {
            addCriterion("report_generate_path <=", value, "reportGeneratePath");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGeneratePathLessThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_path <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathLike(String value) {
            addCriterion("report_generate_path like", value, "reportGeneratePath");
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathNotLike(String value) {
            addCriterion("report_generate_path not like", value, "reportGeneratePath");
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathIn(List<String> values) {
            addCriterion("report_generate_path in", values, "reportGeneratePath");
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathNotIn(List<String> values) {
            addCriterion("report_generate_path not in", values, "reportGeneratePath");
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathBetween(String value1, String value2) {
            addCriterion("report_generate_path between", value1, value2, "reportGeneratePath");
            return (Criteria) this;
        }

        public Criteria andReportGeneratePathNotBetween(String value1, String value2) {
            addCriterion("report_generate_path not between", value1, value2, "reportGeneratePath");
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeIsNull() {
            addCriterion("report_generate_time is null");
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeIsNotNull() {
            addCriterion("report_generate_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeEqualTo(LocalDateTime value) {
            addCriterion("report_generate_time =", value, "reportGenerateTime");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGenerateTimeEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("report_generate_time <>", value, "reportGenerateTime");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGenerateTimeNotEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeGreaterThan(LocalDateTime value) {
            addCriterion("report_generate_time >", value, "reportGenerateTime");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGenerateTimeGreaterThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("report_generate_time >=", value, "reportGenerateTime");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGenerateTimeGreaterThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeLessThan(LocalDateTime value) {
            addCriterion("report_generate_time <", value, "reportGenerateTime");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGenerateTimeLessThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("report_generate_time <=", value, "reportGenerateTime");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andReportGenerateTimeLessThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("report_generate_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeIn(List<LocalDateTime> values) {
            addCriterion("report_generate_time in", values, "reportGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("report_generate_time not in", values, "reportGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("report_generate_time between", value1, value2, "reportGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReportGenerateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("report_generate_time not between", value1, value2, "reportGenerateTime");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNull() {
            addCriterion("download_count is null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNotNull() {
            addCriterion("download_count is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountEqualTo(Integer value) {
            addCriterion("download_count =", value, "downloadCount");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andDownloadCountEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("download_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotEqualTo(Integer value) {
            addCriterion("download_count <>", value, "downloadCount");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andDownloadCountNotEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("download_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThan(Integer value) {
            addCriterion("download_count >", value, "downloadCount");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andDownloadCountGreaterThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("download_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_count >=", value, "downloadCount");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andDownloadCountGreaterThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("download_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThan(Integer value) {
            addCriterion("download_count <", value, "downloadCount");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andDownloadCountLessThanColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("download_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThanOrEqualTo(Integer value) {
            addCriterion("download_count <=", value, "downloadCount");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria andDownloadCountLessThanOrEqualToColumn(TCpyFlangingRegulationReport.Column column) {
            addCriterion(new StringBuilder("download_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDownloadCountIn(List<Integer> values) {
            addCriterion("download_count in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotIn(List<Integer> values) {
            addCriterion("download_count not in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountBetween(Integer value1, Integer value2) {
            addCriterion("download_count between", value1, value2, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("download_count not between", value1, value2, "downloadCount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        private TCpyFlangingRegulationReportExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        protected Criteria(TCpyFlangingRegulationReportExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public TCpyFlangingRegulationReportExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table t_cpy_flanging_regulation_report
             *
             * @mbg.generated
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        void example(com.huizhi.supplier.db.model.TCpyFlangingRegulationReportExample example);
    }
}