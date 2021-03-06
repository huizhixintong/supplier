package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyBankCredit;
import com.huizhi.supplier.db.model.TCpyBankCreditExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyBankCreditMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    long countByExample(TCpyBankCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyBankCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    int insert(TCpyBankCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    int insertSelective(TCpyBankCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    TCpyBankCredit selectOneByExample(TCpyBankCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    TCpyBankCredit selectOneByExampleSelective(@Param("example") TCpyBankCreditExample example, @Param("selective") TCpyBankCredit.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    List<TCpyBankCredit> selectByExampleSelective(@Param("example") TCpyBankCreditExample example, @Param("selective") TCpyBankCredit.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    List<TCpyBankCredit> selectByExample(TCpyBankCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    TCpyBankCredit selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyBankCredit.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    TCpyBankCredit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyBankCredit record, @Param("example") TCpyBankCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyBankCredit record, @Param("example") TCpyBankCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyBankCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_bank_credit
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyBankCredit record);
}