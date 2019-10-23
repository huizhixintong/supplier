package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TMgmDefaultNameListCheck;
import com.huizhi.supplier.db.model.TMgmDefaultNameListCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMgmDefaultNameListCheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    long countByExample(TMgmDefaultNameListCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    int deleteByExample(TMgmDefaultNameListCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    int insert(TMgmDefaultNameListCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    int insertSelective(TMgmDefaultNameListCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    TMgmDefaultNameListCheck selectOneByExample(TMgmDefaultNameListCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    TMgmDefaultNameListCheck selectOneByExampleSelective(@Param("example") TMgmDefaultNameListCheckExample example, @Param("selective") TMgmDefaultNameListCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    List<TMgmDefaultNameListCheck> selectByExampleSelective(@Param("example") TMgmDefaultNameListCheckExample example, @Param("selective") TMgmDefaultNameListCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    List<TMgmDefaultNameListCheck> selectByExample(TMgmDefaultNameListCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    TMgmDefaultNameListCheck selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TMgmDefaultNameListCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    TMgmDefaultNameListCheck selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TMgmDefaultNameListCheck record, @Param("example") TMgmDefaultNameListCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TMgmDefaultNameListCheck record, @Param("example") TMgmDefaultNameListCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TMgmDefaultNameListCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_default_name_list_check
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TMgmDefaultNameListCheck record);
}