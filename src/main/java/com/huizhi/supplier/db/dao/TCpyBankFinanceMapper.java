package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyBankFinance;
import com.huizhi.supplier.db.model.TCpyBankFinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyBankFinanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    long countByExample(TCpyBankFinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyBankFinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    int insert(TCpyBankFinance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    int insertSelective(TCpyBankFinance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    TCpyBankFinance selectOneByExample(TCpyBankFinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    TCpyBankFinance selectOneByExampleSelective(@Param("example") TCpyBankFinanceExample example, @Param("selective") TCpyBankFinance.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    List<TCpyBankFinance> selectByExampleSelective(@Param("example") TCpyBankFinanceExample example, @Param("selective") TCpyBankFinance.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    List<TCpyBankFinance> selectByExample(TCpyBankFinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    TCpyBankFinance selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyBankFinance.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    TCpyBankFinance selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyBankFinance record, @Param("example") TCpyBankFinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyBankFinance record, @Param("example") TCpyBankFinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyBankFinance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_finance
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyBankFinance record);
}