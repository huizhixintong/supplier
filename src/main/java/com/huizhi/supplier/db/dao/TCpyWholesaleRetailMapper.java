package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyWholesaleRetail;
import com.huizhi.supplier.db.model.TCpyWholesaleRetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyWholesaleRetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    long countByExample(TCpyWholesaleRetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyWholesaleRetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    int insert(TCpyWholesaleRetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    int insertSelective(TCpyWholesaleRetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    TCpyWholesaleRetail selectOneByExample(TCpyWholesaleRetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    TCpyWholesaleRetail selectOneByExampleSelective(@Param("example") TCpyWholesaleRetailExample example, @Param("selective") TCpyWholesaleRetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    List<TCpyWholesaleRetail> selectByExampleSelective(@Param("example") TCpyWholesaleRetailExample example, @Param("selective") TCpyWholesaleRetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    List<TCpyWholesaleRetail> selectByExample(TCpyWholesaleRetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    TCpyWholesaleRetail selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyWholesaleRetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    TCpyWholesaleRetail selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyWholesaleRetail record, @Param("example") TCpyWholesaleRetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyWholesaleRetail record, @Param("example") TCpyWholesaleRetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyWholesaleRetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_wholesale_retail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyWholesaleRetail record);
}