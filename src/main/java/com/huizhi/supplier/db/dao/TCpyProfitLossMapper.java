package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyProfitLoss;
import com.huizhi.supplier.db.model.TCpyProfitLossExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
    int deleteByPrimaryKey(String id);

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
    TCpyProfitLoss selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyProfitLoss.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_profit_loss
     *
     * @mbg.generated
     */
    TCpyProfitLoss selectByPrimaryKey(String id);

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


    int updateByCompanyIdAndYear(TCpyProfitLoss profitLoss);

    TCpyProfitLoss selectByCompanyIdAndYear(@Param("companyId") String companyId, @Param("year") String year);

    List<TCpyProfitLoss> selectByCompanyId(@Param("companyId") String companyId);
}