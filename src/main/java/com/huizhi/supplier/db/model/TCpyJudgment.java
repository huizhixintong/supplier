package com.huizhi.supplier.db.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TCpyJudgment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.cause_action
     *
     * @mbg.generated
     */
    private String causeAction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.litigation_status
     *
     * @mbg.generated
     */
    private String litigationStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.court
     *
     * @mbg.generated
     */
    private String court;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.case_number
     *
     * @mbg.generated
     */
    private String caseNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.judgment_time
     *
     * @mbg.generated
     */
    private LocalDate judgmentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.verdict
     *
     * @mbg.generated
     */
    private String verdict;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.release_date
     *
     * @mbg.generated
     */
    private LocalDate releaseDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.court_url
     *
     * @mbg.generated
     */
    private String courtUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.modify_person
     *
     * @mbg.generated
     */
    private String modifyPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.modify_time
     *
     * @mbg.generated
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cpy_judgment.data_resource
     *
     * @mbg.generated
     */
    private String dataResource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.id
     *
     * @return the value of t_cpy_judgment.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.id
     *
     * @param id the value for t_cpy_judgment.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.company_id
     *
     * @return the value of t_cpy_judgment.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.company_id
     *
     * @param companyId the value for t_cpy_judgment.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.title
     *
     * @return the value of t_cpy_judgment.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.title
     *
     * @param title the value for t_cpy_judgment.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.cause_action
     *
     * @return the value of t_cpy_judgment.cause_action
     *
     * @mbg.generated
     */
    public String getCauseAction() {
        return causeAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.cause_action
     *
     * @param causeAction the value for t_cpy_judgment.cause_action
     *
     * @mbg.generated
     */
    public void setCauseAction(String causeAction) {
        this.causeAction = causeAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.litigation_status
     *
     * @return the value of t_cpy_judgment.litigation_status
     *
     * @mbg.generated
     */
    public String getLitigationStatus() {
        return litigationStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.litigation_status
     *
     * @param litigationStatus the value for t_cpy_judgment.litigation_status
     *
     * @mbg.generated
     */
    public void setLitigationStatus(String litigationStatus) {
        this.litigationStatus = litigationStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.court
     *
     * @return the value of t_cpy_judgment.court
     *
     * @mbg.generated
     */
    public String getCourt() {
        return court;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.court
     *
     * @param court the value for t_cpy_judgment.court
     *
     * @mbg.generated
     */
    public void setCourt(String court) {
        this.court = court;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.case_number
     *
     * @return the value of t_cpy_judgment.case_number
     *
     * @mbg.generated
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.case_number
     *
     * @param caseNumber the value for t_cpy_judgment.case_number
     *
     * @mbg.generated
     */
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.judgment_time
     *
     * @return the value of t_cpy_judgment.judgment_time
     *
     * @mbg.generated
     */
    public LocalDate getJudgmentTime() {
        return judgmentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.judgment_time
     *
     * @param judgmentTime the value for t_cpy_judgment.judgment_time
     *
     * @mbg.generated
     */
    public void setJudgmentTime(LocalDate judgmentTime) {
        this.judgmentTime = judgmentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.verdict
     *
     * @return the value of t_cpy_judgment.verdict
     *
     * @mbg.generated
     */
    public String getVerdict() {
        return verdict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.verdict
     *
     * @param verdict the value for t_cpy_judgment.verdict
     *
     * @mbg.generated
     */
    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.release_date
     *
     * @return the value of t_cpy_judgment.release_date
     *
     * @mbg.generated
     */
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.release_date
     *
     * @param releaseDate the value for t_cpy_judgment.release_date
     *
     * @mbg.generated
     */
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.content
     *
     * @return the value of t_cpy_judgment.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.content
     *
     * @param content the value for t_cpy_judgment.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.court_url
     *
     * @return the value of t_cpy_judgment.court_url
     *
     * @mbg.generated
     */
    public String getCourtUrl() {
        return courtUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.court_url
     *
     * @param courtUrl the value for t_cpy_judgment.court_url
     *
     * @mbg.generated
     */
    public void setCourtUrl(String courtUrl) {
        this.courtUrl = courtUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.create_person
     *
     * @return the value of t_cpy_judgment.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.create_person
     *
     * @param createPerson the value for t_cpy_judgment.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.create_time
     *
     * @return the value of t_cpy_judgment.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.create_time
     *
     * @param createTime the value for t_cpy_judgment.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.modify_person
     *
     * @return the value of t_cpy_judgment.modify_person
     *
     * @mbg.generated
     */
    public String getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.modify_person
     *
     * @param modifyPerson the value for t_cpy_judgment.modify_person
     *
     * @mbg.generated
     */
    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.modify_time
     *
     * @return the value of t_cpy_judgment.modify_time
     *
     * @mbg.generated
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.modify_time
     *
     * @param modifyTime the value for t_cpy_judgment.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cpy_judgment.data_resource
     *
     * @return the value of t_cpy_judgment.data_resource
     *
     * @mbg.generated
     */
    public String getDataResource() {
        return dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cpy_judgment.data_resource
     *
     * @param dataResource the value for t_cpy_judgment.data_resource
     *
     * @mbg.generated
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
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
        sb.append(", title=").append(title);
        sb.append(", causeAction=").append(causeAction);
        sb.append(", litigationStatus=").append(litigationStatus);
        sb.append(", court=").append(court);
        sb.append(", caseNumber=").append(caseNumber);
        sb.append(", judgmentTime=").append(judgmentTime);
        sb.append(", verdict=").append(verdict);
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", content=").append(content);
        sb.append(", courtUrl=").append(courtUrl);
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
     * This method corresponds to the database table t_cpy_judgment
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
        TCpyJudgment other = (TCpyJudgment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCauseAction() == null ? other.getCauseAction() == null : this.getCauseAction().equals(other.getCauseAction()))
            && (this.getLitigationStatus() == null ? other.getLitigationStatus() == null : this.getLitigationStatus().equals(other.getLitigationStatus()))
            && (this.getCourt() == null ? other.getCourt() == null : this.getCourt().equals(other.getCourt()))
            && (this.getCaseNumber() == null ? other.getCaseNumber() == null : this.getCaseNumber().equals(other.getCaseNumber()))
            && (this.getJudgmentTime() == null ? other.getJudgmentTime() == null : this.getJudgmentTime().equals(other.getJudgmentTime()))
            && (this.getVerdict() == null ? other.getVerdict() == null : this.getVerdict().equals(other.getVerdict()))
            && (this.getReleaseDate() == null ? other.getReleaseDate() == null : this.getReleaseDate().equals(other.getReleaseDate()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCourtUrl() == null ? other.getCourtUrl() == null : this.getCourtUrl().equals(other.getCourtUrl()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDataResource() == null ? other.getDataResource() == null : this.getDataResource().equals(other.getDataResource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCauseAction() == null) ? 0 : getCauseAction().hashCode());
        result = prime * result + ((getLitigationStatus() == null) ? 0 : getLitigationStatus().hashCode());
        result = prime * result + ((getCourt() == null) ? 0 : getCourt().hashCode());
        result = prime * result + ((getCaseNumber() == null) ? 0 : getCaseNumber().hashCode());
        result = prime * result + ((getJudgmentTime() == null) ? 0 : getJudgmentTime().hashCode());
        result = prime * result + ((getVerdict() == null) ? 0 : getVerdict().hashCode());
        result = prime * result + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCourtUrl() == null) ? 0 : getCourtUrl().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDataResource() == null) ? 0 : getDataResource().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        title("title", "title", "VARCHAR", false),
        causeAction("cause_action", "causeAction", "VARCHAR", false),
        litigationStatus("litigation_status", "litigationStatus", "VARCHAR", false),
        court("court", "court", "VARCHAR", false),
        caseNumber("case_number", "caseNumber", "VARCHAR", false),
        judgmentTime("judgment_time", "judgmentTime", "DATE", false),
        verdict("verdict", "verdict", "VARCHAR", false),
        releaseDate("release_date", "releaseDate", "DATE", false),
        content("content", "content", "VARCHAR", false),
        courtUrl("court_url", "courtUrl", "VARCHAR", false),
        createPerson("create_person", "createPerson", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyPerson("modify_person", "modifyPerson", "VARCHAR", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false),
        dataResource("data_resource", "dataResource", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_judgment
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
         * This method corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_cpy_judgment
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
         * This method corresponds to the database table t_cpy_judgment
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
         * This method corresponds to the database table t_cpy_judgment
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}