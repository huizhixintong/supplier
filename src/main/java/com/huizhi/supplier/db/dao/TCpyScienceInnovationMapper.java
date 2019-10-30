package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyScienceInnovation;
import com.huizhi.supplier.db.model.TCpyScienceInnovationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyScienceInnovationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    long countByExample(TCpyScienceInnovationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyScienceInnovationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    int insert(TCpyScienceInnovation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    int insertSelective(TCpyScienceInnovation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    TCpyScienceInnovation selectOneByExample(TCpyScienceInnovationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    TCpyScienceInnovation selectOneByExampleSelective(@Param("example") TCpyScienceInnovationExample example, @Param("selective") TCpyScienceInnovation.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    List<TCpyScienceInnovation> selectByExampleSelective(@Param("example") TCpyScienceInnovationExample example, @Param("selective") TCpyScienceInnovation.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    List<TCpyScienceInnovation> selectByExample(TCpyScienceInnovationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    TCpyScienceInnovation selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyScienceInnovation.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    TCpyScienceInnovation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyScienceInnovation record, @Param("example") TCpyScienceInnovationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyScienceInnovation record, @Param("example") TCpyScienceInnovationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyScienceInnovation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_science_innovation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyScienceInnovation record);
}