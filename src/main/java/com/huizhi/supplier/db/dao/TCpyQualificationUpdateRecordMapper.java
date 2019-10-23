package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyQualificationUpdateRecord;
import com.huizhi.supplier.db.model.TCpyQualificationUpdateRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyQualificationUpdateRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    long countByExample(TCpyQualificationUpdateRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyQualificationUpdateRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    int insert(TCpyQualificationUpdateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    int insertSelective(TCpyQualificationUpdateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    TCpyQualificationUpdateRecord selectOneByExample(TCpyQualificationUpdateRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    TCpyQualificationUpdateRecord selectOneByExampleSelective(@Param("example") TCpyQualificationUpdateRecordExample example, @Param("selective") TCpyQualificationUpdateRecord.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    List<TCpyQualificationUpdateRecord> selectByExampleSelective(@Param("example") TCpyQualificationUpdateRecordExample example, @Param("selective") TCpyQualificationUpdateRecord.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    List<TCpyQualificationUpdateRecord> selectByExample(TCpyQualificationUpdateRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    TCpyQualificationUpdateRecord selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyQualificationUpdateRecord.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    TCpyQualificationUpdateRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyQualificationUpdateRecord record, @Param("example") TCpyQualificationUpdateRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyQualificationUpdateRecord record, @Param("example") TCpyQualificationUpdateRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyQualificationUpdateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_qualification_update_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyQualificationUpdateRecord record);
}