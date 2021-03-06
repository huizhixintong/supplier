package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyOperateCondition;
import com.huizhi.supplier.db.model.TCpyOperateConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MybatisUserInfo
public interface TCpyOperateConditionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    long countByExample(TCpyOperateConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyOperateConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    int insert(TCpyOperateCondition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    int insertSelective(TCpyOperateCondition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    TCpyOperateCondition selectOneByExample(TCpyOperateConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    TCpyOperateCondition selectOneByExampleSelective(@Param("example") TCpyOperateConditionExample example, @Param("selective") TCpyOperateCondition.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    List<TCpyOperateCondition> selectByExampleSelective(@Param("example") TCpyOperateConditionExample example, @Param("selective") TCpyOperateCondition.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    List<TCpyOperateCondition> selectByExample(TCpyOperateConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    TCpyOperateCondition selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyOperateCondition.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    TCpyOperateCondition selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyOperateCondition record, @Param("example") TCpyOperateConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyOperateCondition record, @Param("example") TCpyOperateConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyOperateCondition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_operate_condition
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyOperateCondition record);
}