package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TMgmObjectionHandling;
import com.huizhi.supplier.db.model.TMgmObjectionHandlingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TMgmObjectionHandlingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    long countByExample(TMgmObjectionHandlingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    int deleteByExample(TMgmObjectionHandlingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    int insert(TMgmObjectionHandling record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    int insertSelective(TMgmObjectionHandling record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    TMgmObjectionHandling selectOneByExample(TMgmObjectionHandlingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    TMgmObjectionHandling selectOneByExampleSelective(@Param("example") TMgmObjectionHandlingExample example, @Param("selective") TMgmObjectionHandling.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    List<TMgmObjectionHandling> selectByExampleSelective(@Param("example") TMgmObjectionHandlingExample example, @Param("selective") TMgmObjectionHandling.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    List<TMgmObjectionHandling> selectByExample(TMgmObjectionHandlingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TMgmObjectionHandling record, @Param("example") TMgmObjectionHandlingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_objection_handling
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TMgmObjectionHandling record, @Param("example") TMgmObjectionHandlingExample example);
}