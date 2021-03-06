package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyLegalCredit;
import com.huizhi.supplier.db.model.TCpyLegalCreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MybatisUserInfo
public interface TCpyLegalCreditMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    long countByExample(TCpyLegalCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyLegalCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    int insert(TCpyLegalCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    int insertSelective(TCpyLegalCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    TCpyLegalCredit selectOneByExample(TCpyLegalCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    TCpyLegalCredit selectOneByExampleSelective(@Param("example") TCpyLegalCreditExample example, @Param("selective") TCpyLegalCredit.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    List<TCpyLegalCredit> selectByExampleSelective(@Param("example") TCpyLegalCreditExample example, @Param("selective") TCpyLegalCredit.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    List<TCpyLegalCredit> selectByExample(TCpyLegalCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    TCpyLegalCredit selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyLegalCredit.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    TCpyLegalCredit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyLegalCredit record, @Param("example") TCpyLegalCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyLegalCredit record, @Param("example") TCpyLegalCreditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyLegalCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_credit
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyLegalCredit record);
}