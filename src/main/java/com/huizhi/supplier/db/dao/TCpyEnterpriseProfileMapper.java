package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyEnterpriseProfile;
import com.huizhi.supplier.db.model.TCpyEnterpriseProfileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyEnterpriseProfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    long countByExample(TCpyEnterpriseProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyEnterpriseProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    int insert(TCpyEnterpriseProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    int insertSelective(TCpyEnterpriseProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    TCpyEnterpriseProfile selectOneByExample(TCpyEnterpriseProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    TCpyEnterpriseProfile selectOneByExampleSelective(@Param("example") TCpyEnterpriseProfileExample example, @Param("selective") TCpyEnterpriseProfile.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    List<TCpyEnterpriseProfile> selectByExampleSelective(@Param("example") TCpyEnterpriseProfileExample example, @Param("selective") TCpyEnterpriseProfile.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    List<TCpyEnterpriseProfile> selectByExample(TCpyEnterpriseProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    TCpyEnterpriseProfile selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyEnterpriseProfile.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    TCpyEnterpriseProfile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyEnterpriseProfile record, @Param("example") TCpyEnterpriseProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyEnterpriseProfile record, @Param("example") TCpyEnterpriseProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyEnterpriseProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_profile
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyEnterpriseProfile record);
}