package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TVcsCompanyEvaluateScore;
import com.huizhi.supplier.db.model.TVcsCompanyEvaluateScoreExample;
import com.huizhi.supplier.db.model.TVcsCompanyEvaluateScoreWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TVcsCompanyEvaluateScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    long countByExample(TVcsCompanyEvaluateScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int deleteByExample(TVcsCompanyEvaluateScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int insert(TVcsCompanyEvaluateScoreWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int insertSelective(TVcsCompanyEvaluateScoreWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    TVcsCompanyEvaluateScore selectOneByExample(TVcsCompanyEvaluateScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    TVcsCompanyEvaluateScoreWithBLOBs selectOneByExampleSelective(@Param("example") TVcsCompanyEvaluateScoreExample example, @Param("selective") TVcsCompanyEvaluateScoreWithBLOBs.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    TVcsCompanyEvaluateScoreWithBLOBs selectOneByExampleWithBLOBs(TVcsCompanyEvaluateScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    List<TVcsCompanyEvaluateScoreWithBLOBs> selectByExampleSelective(@Param("example") TVcsCompanyEvaluateScoreExample example, @Param("selective") TVcsCompanyEvaluateScoreWithBLOBs.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    List<TVcsCompanyEvaluateScoreWithBLOBs> selectByExampleWithBLOBs(TVcsCompanyEvaluateScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    List<TVcsCompanyEvaluateScore> selectByExample(TVcsCompanyEvaluateScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    TVcsCompanyEvaluateScoreWithBLOBs selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TVcsCompanyEvaluateScoreWithBLOBs.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    TVcsCompanyEvaluateScoreWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TVcsCompanyEvaluateScoreWithBLOBs record, @Param("example") TVcsCompanyEvaluateScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TVcsCompanyEvaluateScoreWithBLOBs record, @Param("example") TVcsCompanyEvaluateScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TVcsCompanyEvaluateScore record, @Param("example") TVcsCompanyEvaluateScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TVcsCompanyEvaluateScoreWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TVcsCompanyEvaluateScoreWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_vcs_company_evaluate_score
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TVcsCompanyEvaluateScore record);
}