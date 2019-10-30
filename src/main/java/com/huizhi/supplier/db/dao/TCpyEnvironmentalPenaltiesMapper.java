package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyEnvironmentalPenalties;
import com.huizhi.supplier.db.model.TCpyEnvironmentalPenaltiesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyEnvironmentalPenaltiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    long countByExample(TCpyEnvironmentalPenaltiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyEnvironmentalPenaltiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    int insert(TCpyEnvironmentalPenalties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    int insertSelective(TCpyEnvironmentalPenalties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    TCpyEnvironmentalPenalties selectOneByExample(TCpyEnvironmentalPenaltiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    TCpyEnvironmentalPenalties selectOneByExampleSelective(@Param("example") TCpyEnvironmentalPenaltiesExample example, @Param("selective") TCpyEnvironmentalPenalties.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    List<TCpyEnvironmentalPenalties> selectByExampleSelective(@Param("example") TCpyEnvironmentalPenaltiesExample example, @Param("selective") TCpyEnvironmentalPenalties.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    List<TCpyEnvironmentalPenalties> selectByExample(TCpyEnvironmentalPenaltiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    TCpyEnvironmentalPenalties selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyEnvironmentalPenalties.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    TCpyEnvironmentalPenalties selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyEnvironmentalPenalties record, @Param("example") TCpyEnvironmentalPenaltiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyEnvironmentalPenalties record, @Param("example") TCpyEnvironmentalPenaltiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyEnvironmentalPenalties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_environmental_penalties
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyEnvironmentalPenalties record);
}