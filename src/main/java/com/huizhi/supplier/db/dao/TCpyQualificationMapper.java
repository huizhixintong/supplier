package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyQualification;
import com.huizhi.supplier.db.model.TCpyQualificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyQualificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    long countByExample(TCpyQualificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyQualificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    int insert(TCpyQualification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    int insertSelective(TCpyQualification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    TCpyQualification selectOneByExample(TCpyQualificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    TCpyQualification selectOneByExampleSelective(@Param("example") TCpyQualificationExample example, @Param("selective") TCpyQualification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    List<TCpyQualification> selectByExampleSelective(@Param("example") TCpyQualificationExample example, @Param("selective") TCpyQualification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    List<TCpyQualification> selectByExample(TCpyQualificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    TCpyQualification selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyQualification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    TCpyQualification selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyQualification record, @Param("example") TCpyQualificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyQualification record, @Param("example") TCpyQualificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyQualification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyQualification record);
}