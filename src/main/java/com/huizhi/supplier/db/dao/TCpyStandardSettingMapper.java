package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyStandardSetting;
import com.huizhi.supplier.db.model.TCpyStandardSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyStandardSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    long countByExample(TCpyStandardSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyStandardSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    int insert(TCpyStandardSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    int insertSelective(TCpyStandardSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    TCpyStandardSetting selectOneByExample(TCpyStandardSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    TCpyStandardSetting selectOneByExampleSelective(@Param("example") TCpyStandardSettingExample example, @Param("selective") TCpyStandardSetting.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    List<TCpyStandardSetting> selectByExampleSelective(@Param("example") TCpyStandardSettingExample example, @Param("selective") TCpyStandardSetting.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    List<TCpyStandardSetting> selectByExample(TCpyStandardSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    TCpyStandardSetting selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyStandardSetting.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    TCpyStandardSetting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyStandardSetting record, @Param("example") TCpyStandardSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyStandardSetting record, @Param("example") TCpyStandardSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyStandardSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_standard_setting
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyStandardSetting record);
}