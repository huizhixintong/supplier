package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TFlowStepDefine;
import com.huizhi.supplier.db.model.TFlowStepDefineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TFlowStepDefineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    long countByExample(TFlowStepDefineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    int deleteByExample(TFlowStepDefineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    int insert(TFlowStepDefine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    int insertSelective(TFlowStepDefine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    TFlowStepDefine selectOneByExample(TFlowStepDefineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    TFlowStepDefine selectOneByExampleSelective(@Param("example") TFlowStepDefineExample example, @Param("selective") TFlowStepDefine.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    List<TFlowStepDefine> selectByExampleSelective(@Param("example") TFlowStepDefineExample example, @Param("selective") TFlowStepDefine.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    List<TFlowStepDefine> selectByExample(TFlowStepDefineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    TFlowStepDefine selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TFlowStepDefine.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    TFlowStepDefine selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TFlowStepDefine record, @Param("example") TFlowStepDefineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TFlowStepDefine record, @Param("example") TFlowStepDefineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TFlowStepDefine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_step_define
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TFlowStepDefine record);
}