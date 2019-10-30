package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyForeignInvestment;
import com.huizhi.supplier.db.model.TCpyForeignInvestmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyForeignInvestmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    long countByExample(TCpyForeignInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyForeignInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    int insert(TCpyForeignInvestment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    int insertSelective(TCpyForeignInvestment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    TCpyForeignInvestment selectOneByExample(TCpyForeignInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    TCpyForeignInvestment selectOneByExampleSelective(@Param("example") TCpyForeignInvestmentExample example, @Param("selective") TCpyForeignInvestment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    List<TCpyForeignInvestment> selectByExampleSelective(@Param("example") TCpyForeignInvestmentExample example, @Param("selective") TCpyForeignInvestment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    List<TCpyForeignInvestment> selectByExample(TCpyForeignInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    TCpyForeignInvestment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyForeignInvestment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    TCpyForeignInvestment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyForeignInvestment record, @Param("example") TCpyForeignInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyForeignInvestment record, @Param("example") TCpyForeignInvestmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyForeignInvestment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_foreign_investment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyForeignInvestment record);
}