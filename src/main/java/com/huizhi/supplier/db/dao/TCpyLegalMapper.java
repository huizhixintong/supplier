package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyLegal;
import com.huizhi.supplier.db.model.TCpyLegalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyLegalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    long countByExample(TCpyLegalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyLegalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    int insert(TCpyLegal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    int insertSelective(TCpyLegal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    TCpyLegal selectOneByExample(TCpyLegalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    TCpyLegal selectOneByExampleSelective(@Param("example") TCpyLegalExample example, @Param("selective") TCpyLegal.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    List<TCpyLegal> selectByExampleSelective(@Param("example") TCpyLegalExample example, @Param("selective") TCpyLegal.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    List<TCpyLegal> selectByExample(TCpyLegalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    TCpyLegal selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyLegal.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    TCpyLegal selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyLegal record, @Param("example") TCpyLegalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyLegal record, @Param("example") TCpyLegalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyLegal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyLegal record);
}