package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyCorporateWelfare;
import com.huizhi.supplier.db.model.TCpyCorporateWelfareExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyCorporateWelfareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    long countByExample(TCpyCorporateWelfareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyCorporateWelfareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    int insert(TCpyCorporateWelfare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    int insertSelective(TCpyCorporateWelfare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    TCpyCorporateWelfare selectOneByExample(TCpyCorporateWelfareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    TCpyCorporateWelfare selectOneByExampleSelective(@Param("example") TCpyCorporateWelfareExample example, @Param("selective") TCpyCorporateWelfare.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    List<TCpyCorporateWelfare> selectByExampleSelective(@Param("example") TCpyCorporateWelfareExample example, @Param("selective") TCpyCorporateWelfare.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    List<TCpyCorporateWelfare> selectByExample(TCpyCorporateWelfareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    TCpyCorporateWelfare selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyCorporateWelfare.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    TCpyCorporateWelfare selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyCorporateWelfare record, @Param("example") TCpyCorporateWelfareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyCorporateWelfare record, @Param("example") TCpyCorporateWelfareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyCorporateWelfare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_corporate_welfare
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyCorporateWelfare record);
}