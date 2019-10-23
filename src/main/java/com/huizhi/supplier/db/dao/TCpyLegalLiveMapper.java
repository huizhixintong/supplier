package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyLegalLive;
import com.huizhi.supplier.db.model.TCpyLegalLiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyLegalLiveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    long countByExample(TCpyLegalLiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyLegalLiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    int insert(TCpyLegalLive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    int insertSelective(TCpyLegalLive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    TCpyLegalLive selectOneByExample(TCpyLegalLiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    TCpyLegalLive selectOneByExampleSelective(@Param("example") TCpyLegalLiveExample example, @Param("selective") TCpyLegalLive.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    List<TCpyLegalLive> selectByExampleSelective(@Param("example") TCpyLegalLiveExample example, @Param("selective") TCpyLegalLive.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    List<TCpyLegalLive> selectByExample(TCpyLegalLiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    TCpyLegalLive selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyLegalLive.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    TCpyLegalLive selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyLegalLive record, @Param("example") TCpyLegalLiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyLegalLive record, @Param("example") TCpyLegalLiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyLegalLive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_live
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyLegalLive record);
}