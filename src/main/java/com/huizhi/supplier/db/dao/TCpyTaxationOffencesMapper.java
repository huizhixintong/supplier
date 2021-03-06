package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyTaxationOffences;
import com.huizhi.supplier.db.model.TCpyTaxationOffencesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyTaxationOffencesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    long countByExample(TCpyTaxationOffencesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyTaxationOffencesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    int insert(TCpyTaxationOffences record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    int insertSelective(TCpyTaxationOffences record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    TCpyTaxationOffences selectOneByExample(TCpyTaxationOffencesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    TCpyTaxationOffences selectOneByExampleSelective(@Param("example") TCpyTaxationOffencesExample example, @Param("selective") TCpyTaxationOffences.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    List<TCpyTaxationOffences> selectByExampleSelective(@Param("example") TCpyTaxationOffencesExample example, @Param("selective") TCpyTaxationOffences.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    List<TCpyTaxationOffences> selectByExample(TCpyTaxationOffencesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    TCpyTaxationOffences selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyTaxationOffences.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    TCpyTaxationOffences selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyTaxationOffences record, @Param("example") TCpyTaxationOffencesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyTaxationOffences record, @Param("example") TCpyTaxationOffencesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyTaxationOffences record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_taxation_offences
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyTaxationOffences record);
}