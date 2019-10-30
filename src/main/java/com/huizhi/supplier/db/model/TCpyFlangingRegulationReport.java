package com.huizhi.supplier.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyFlangingRegulationReport {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_flanging_regulation_report.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_flanging_regulation_report.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_flanging_regulation_report.report_generate_path
     *
     * @mbg.generated
     */
    private String reportGeneratePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_flanging_regulation_report.report_generate_time
     *
     * @mbg.generated
     */
    private LocalDateTime reportGenerateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_flanging_regulation_report.download_count
     *
     * @mbg.generated
     */
    private Integer downloadCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_flanging_regulation_report.id
     *
     * @return the value of t_cpy_flanging_regulation_report.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_flanging_regulation_report.id
     *
     * @param id the value for t_cpy_flanging_regulation_report.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_flanging_regulation_report.company_id
     *
     * @return the value of t_cpy_flanging_regulation_report.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_flanging_regulation_report.company_id
     *
     * @param companyId the value for t_cpy_flanging_regulation_report.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_flanging_regulation_report.report_generate_path
     *
     * @return the value of t_cpy_flanging_regulation_report.report_generate_path
     *
     * @mbg.generated
     */
    public String getReportGeneratePath() {
        return reportGeneratePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_flanging_regulation_report.report_generate_path
     *
     * @param reportGeneratePath the value for t_cpy_flanging_regulation_report.report_generate_path
     *
     * @mbg.generated
     */
    public void setReportGeneratePath(String reportGeneratePath) {
        this.reportGeneratePath = reportGeneratePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_flanging_regulation_report.report_generate_time
     *
     * @return the value of t_cpy_flanging_regulation_report.report_generate_time
     *
     * @mbg.generated
     */
    public LocalDateTime getReportGenerateTime() {
        return reportGenerateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_flanging_regulation_report.report_generate_time
     *
     * @param reportGenerateTime the value for t_cpy_flanging_regulation_report.report_generate_time
     *
     * @mbg.generated
     */
    public void setReportGenerateTime(LocalDateTime reportGenerateTime) {
        this.reportGenerateTime = reportGenerateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_flanging_regulation_report.download_count
     *
     * @return the value of t_cpy_flanging_regulation_report.download_count
     *
     * @mbg.generated
     */
    public Integer getDownloadCount() {
        return downloadCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_flanging_regulation_report.download_count
     *
     * @param downloadCount the value for t_cpy_flanging_regulation_report.download_count
     *
     * @mbg.generated
     */
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
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
        sb.append(", reportGeneratePath=").append(reportGeneratePath);
        sb.append(", reportGenerateTime=").append(reportGenerateTime);
        sb.append(", downloadCount=").append(downloadCount);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
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
        TCpyFlangingRegulationReport other = (TCpyFlangingRegulationReport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getReportGeneratePath() == null ? other.getReportGeneratePath() == null : this.getReportGeneratePath().equals(other.getReportGeneratePath()))
            && (this.getReportGenerateTime() == null ? other.getReportGenerateTime() == null : this.getReportGenerateTime().equals(other.getReportGenerateTime()))
            && (this.getDownloadCount() == null ? other.getDownloadCount() == null : this.getDownloadCount().equals(other.getDownloadCount()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getReportGeneratePath() == null) ? 0 : getReportGeneratePath().hashCode());
        result = prime * result + ((getReportGenerateTime() == null) ? 0 : getReportGenerateTime().hashCode());
        result = prime * result + ((getDownloadCount() == null) ? 0 : getDownloadCount().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_flanging_regulation_report
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "VARCHAR", false),
        reportGeneratePath("report_generate_path", "reportGeneratePath", "VARCHAR", false),
        reportGenerateTime("report_generate_time", "reportGenerateTime", "TIMESTAMP", false),
        downloadCount("download_count", "downloadCount", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
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
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_flanging_regulation_report
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
         * This method corresponds to the database table t_cpy_flanging_regulation_report
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
         * This method corresponds to the database table t_cpy_flanging_regulation_report
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}