package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyAnnualReport;
import com.huizhi.supplier.db.model.TCpyAnnualReportExample;
import com.huizhi.supplier.db.model.TFileInfo;
import com.huizhi.supplier.db.model.TFileInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Title: TFileInfoMapper
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/31 0031 11:09
 */
@MybatisUserInfo
public interface TFileInfoMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    long countByExample(TFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    int deleteByExample(TFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    int insert(TFileInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    int insertSelective(TFileInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    TFileInfo selectOneByExample(TFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    TFileInfo selectOneByExampleSelective(@Param("example") TFileInfoExample example, @Param("selective") TFileInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    List<TFileInfo> selectByExampleSelective(@Param("example") TFileInfoExample example, @Param("selective") TFileInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    List<TFileInfo> selectByExample(TFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    TFileInfo selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TFileInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    TFileInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TFileInfo record, @Param("example") TFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TFileInfo record, @Param("example") TFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TFileInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_annual_report
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TFileInfo record);
}
