package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TFlowExecute;
import com.huizhi.supplier.db.model.TFlowExecuteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TFlowExecuteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    long countByExample(TFlowExecuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    int deleteByExample(TFlowExecuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    int insert(TFlowExecute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    int insertSelective(TFlowExecute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    TFlowExecute selectOneByExample(TFlowExecuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    TFlowExecute selectOneByExampleSelective(@Param("example") TFlowExecuteExample example, @Param("selective") TFlowExecute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    List<TFlowExecute> selectByExampleSelective(@Param("example") TFlowExecuteExample example, @Param("selective") TFlowExecute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    List<TFlowExecute> selectByExample(TFlowExecuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    TFlowExecute selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TFlowExecute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    TFlowExecute selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TFlowExecute record, @Param("example") TFlowExecuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TFlowExecute record, @Param("example") TFlowExecuteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TFlowExecute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flow_execute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TFlowExecute record);

    List<TFlowExecute> queryExecute();
}