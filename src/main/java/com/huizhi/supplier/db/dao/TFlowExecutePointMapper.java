package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TFlowExecutePoint;
import com.huizhi.supplier.db.model.TFlowExecutePointExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TFlowExecutePointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    long countByExample(TFlowExecutePointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    int deleteByExample(TFlowExecutePointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    int insert(TFlowExecutePoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    int insertSelective(TFlowExecutePoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    TFlowExecutePoint selectOneByExample(TFlowExecutePointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    TFlowExecutePoint selectOneByExampleSelective(@Param("example") TFlowExecutePointExample example, @Param("selective") TFlowExecutePoint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    List<TFlowExecutePoint> selectByExampleSelective(@Param("example") TFlowExecutePointExample example, @Param("selective") TFlowExecutePoint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    List<TFlowExecutePoint> selectByExample(TFlowExecutePointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    TFlowExecutePoint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TFlowExecutePoint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    TFlowExecutePoint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TFlowExecutePoint record, @Param("example") TFlowExecutePointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TFlowExecutePoint record, @Param("example") TFlowExecutePointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TFlowExecutePoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute_point
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TFlowExecutePoint record);
}