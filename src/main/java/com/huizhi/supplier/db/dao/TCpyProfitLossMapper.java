package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyProfitLoss;
import com.huizhi.supplier.db.model.TCpyProfitLossExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyProfitLossMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    long countByExample(TCpyProfitLossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyProfitLossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    int insert(TCpyProfitLoss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    int insertSelective(TCpyProfitLoss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    TCpyProfitLoss selectOneByExample(TCpyProfitLossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    TCpyProfitLoss selectOneByExampleSelective(@Param("example") TCpyProfitLossExample example, @Param("selective") TCpyProfitLoss.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    List<TCpyProfitLoss> selectByExampleSelective(@Param("example") TCpyProfitLossExample example, @Param("selective") TCpyProfitLoss.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    List<TCpyProfitLoss> selectByExample(TCpyProfitLossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    TCpyProfitLoss selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyProfitLoss.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    TCpyProfitLoss selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyProfitLoss record, @Param("example") TCpyProfitLossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyProfitLoss record, @Param("example") TCpyProfitLossExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyProfitLoss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyProfitLoss record);
}