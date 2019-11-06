package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TPerSubjectTitleInfo;
import com.huizhi.supplier.db.model.TPerSubjectTitleInfoExample;
import com.huizhi.supplier.db.model.TPerSubjectTitleInfoKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TPerSubjectTitleInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    long countByExample(TPerSubjectTitleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    int deleteByExample(TPerSubjectTitleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(TPerSubjectTitleInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    int insert(TPerSubjectTitleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    int insertSelective(TPerSubjectTitleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    TPerSubjectTitleInfo selectOneByExample(TPerSubjectTitleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    TPerSubjectTitleInfo selectOneByExampleSelective(@Param("example") TPerSubjectTitleInfoExample example, @Param("selective") TPerSubjectTitleInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    List<TPerSubjectTitleInfo> selectByExampleSelective(@Param("example") TPerSubjectTitleInfoExample example, @Param("selective") TPerSubjectTitleInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    List<TPerSubjectTitleInfo> selectByExample(TPerSubjectTitleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    TPerSubjectTitleInfo selectByPrimaryKeySelective(@Param("record") TPerSubjectTitleInfoKey key, @Param("selective") TPerSubjectTitleInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    TPerSubjectTitleInfo selectByPrimaryKey(TPerSubjectTitleInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TPerSubjectTitleInfo record, @Param("example") TPerSubjectTitleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TPerSubjectTitleInfo record, @Param("example") TPerSubjectTitleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TPerSubjectTitleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_per_subject_title_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TPerSubjectTitleInfo record);

    List<TPerSubjectTitleInfo> querySubjectTitle(@Param("code") String code);
}