package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyCreditGrade;
import com.huizhi.supplier.db.model.TCpyCreditGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyCreditGradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    long countByExample(TCpyCreditGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyCreditGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    int insert(TCpyCreditGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    int insertSelective(TCpyCreditGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    TCpyCreditGrade selectOneByExample(TCpyCreditGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    TCpyCreditGrade selectOneByExampleSelective(@Param("example") TCpyCreditGradeExample example, @Param("selective") TCpyCreditGrade.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    List<TCpyCreditGrade> selectByExampleSelective(@Param("example") TCpyCreditGradeExample example, @Param("selective") TCpyCreditGrade.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    List<TCpyCreditGrade> selectByExample(TCpyCreditGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    TCpyCreditGrade selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyCreditGrade.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    TCpyCreditGrade selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyCreditGrade record, @Param("example") TCpyCreditGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyCreditGrade record, @Param("example") TCpyCreditGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyCreditGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_credit_grade
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyCreditGrade record);
}