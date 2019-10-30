package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyJudgment;
import com.huizhi.supplier.db.model.TCpyJudgmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyJudgmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    long countByExample(TCpyJudgmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyJudgmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    int insert(TCpyJudgment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    int insertSelective(TCpyJudgment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    TCpyJudgment selectOneByExample(TCpyJudgmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    TCpyJudgment selectOneByExampleSelective(@Param("example") TCpyJudgmentExample example, @Param("selective") TCpyJudgment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    List<TCpyJudgment> selectByExampleSelective(@Param("example") TCpyJudgmentExample example, @Param("selective") TCpyJudgment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    List<TCpyJudgment> selectByExample(TCpyJudgmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    TCpyJudgment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyJudgment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    TCpyJudgment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyJudgment record, @Param("example") TCpyJudgmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyJudgment record, @Param("example") TCpyJudgmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyJudgment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_judgment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyJudgment record);
}