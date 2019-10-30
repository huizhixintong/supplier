package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyYearCheck;
import com.huizhi.supplier.db.model.TCpyYearCheckExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@MybatisUserInfo
public interface TCpyYearCheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    long countByExample(TCpyYearCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyYearCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    int insert(TCpyYearCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    int insertSelective(TCpyYearCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    TCpyYearCheck selectOneByExample(TCpyYearCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    TCpyYearCheck selectOneByExampleSelective(@Param("example") TCpyYearCheckExample example, @Param("selective") TCpyYearCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    List<TCpyYearCheck> selectByExampleSelective(@Param("example") TCpyYearCheckExample example, @Param("selective") TCpyYearCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    List<TCpyYearCheck> selectByExample(TCpyYearCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    TCpyYearCheck selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyYearCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    TCpyYearCheck selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyYearCheck record, @Param("example") TCpyYearCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyYearCheck record, @Param("example") TCpyYearCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyYearCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_check
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyYearCheck record);
}