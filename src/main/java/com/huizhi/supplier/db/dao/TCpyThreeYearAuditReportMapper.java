package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyThreeYearAuditReport;
import com.huizhi.supplier.db.model.TCpyThreeYearAuditReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyThreeYearAuditReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    long countByExample(TCpyThreeYearAuditReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyThreeYearAuditReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    int insert(TCpyThreeYearAuditReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    int insertSelective(TCpyThreeYearAuditReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    TCpyThreeYearAuditReport selectOneByExample(TCpyThreeYearAuditReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    TCpyThreeYearAuditReport selectOneByExampleSelective(@Param("example") TCpyThreeYearAuditReportExample example, @Param("selective") TCpyThreeYearAuditReport.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    List<TCpyThreeYearAuditReport> selectByExampleSelective(@Param("example") TCpyThreeYearAuditReportExample example, @Param("selective") TCpyThreeYearAuditReport.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    List<TCpyThreeYearAuditReport> selectByExample(TCpyThreeYearAuditReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    TCpyThreeYearAuditReport selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyThreeYearAuditReport.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    TCpyThreeYearAuditReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyThreeYearAuditReport record, @Param("example") TCpyThreeYearAuditReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyThreeYearAuditReport record, @Param("example") TCpyThreeYearAuditReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyThreeYearAuditReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_three_year_audit_report
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyThreeYearAuditReport record);
}