package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TMgmDefaultNameList;
import com.huizhi.supplier.db.model.TMgmDefaultNameListExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TMgmDefaultNameListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    long countByExample(TMgmDefaultNameListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    int deleteByExample(TMgmDefaultNameListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    int insert(TMgmDefaultNameList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    int insertSelective(TMgmDefaultNameList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    TMgmDefaultNameList selectOneByExample(TMgmDefaultNameListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    TMgmDefaultNameList selectOneByExampleSelective(@Param("example") TMgmDefaultNameListExample example, @Param("selective") TMgmDefaultNameList.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    List<TMgmDefaultNameList> selectByExampleSelective(@Param("example") TMgmDefaultNameListExample example, @Param("selective") TMgmDefaultNameList.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    List<TMgmDefaultNameList> selectByExample(TMgmDefaultNameListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    TMgmDefaultNameList selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TMgmDefaultNameList.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    TMgmDefaultNameList selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TMgmDefaultNameList record, @Param("example") TMgmDefaultNameListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TMgmDefaultNameList record, @Param("example") TMgmDefaultNameListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TMgmDefaultNameList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TMgmDefaultNameList record);
}