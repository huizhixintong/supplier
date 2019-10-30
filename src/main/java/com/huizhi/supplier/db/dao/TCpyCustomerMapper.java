package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyCustomer;
import com.huizhi.supplier.db.model.TCpyCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    long countByExample(TCpyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    int insert(TCpyCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    int insertSelective(TCpyCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    TCpyCustomer selectOneByExample(TCpyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    TCpyCustomer selectOneByExampleSelective(@Param("example") TCpyCustomerExample example, @Param("selective") TCpyCustomer.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    List<TCpyCustomer> selectByExampleSelective(@Param("example") TCpyCustomerExample example, @Param("selective") TCpyCustomer.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    List<TCpyCustomer> selectByExample(TCpyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    TCpyCustomer selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyCustomer.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    TCpyCustomer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyCustomer record, @Param("example") TCpyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyCustomer record, @Param("example") TCpyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyCustomer record);
}