package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyDepartmentInfo;
import com.huizhi.supplier.db.model.TCpyDepartmentInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyDepartmentInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    long countByExample(TCpyDepartmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyDepartmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    int insert(TCpyDepartmentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    int insertSelective(TCpyDepartmentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    TCpyDepartmentInfo selectOneByExample(TCpyDepartmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    TCpyDepartmentInfo selectOneByExampleSelective(@Param("example") TCpyDepartmentInfoExample example, @Param("selective") TCpyDepartmentInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    List<TCpyDepartmentInfo> selectByExampleSelective(@Param("example") TCpyDepartmentInfoExample example, @Param("selective") TCpyDepartmentInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    List<TCpyDepartmentInfo> selectByExample(TCpyDepartmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    TCpyDepartmentInfo selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyDepartmentInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    TCpyDepartmentInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyDepartmentInfo record, @Param("example") TCpyDepartmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyDepartmentInfo record, @Param("example") TCpyDepartmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyDepartmentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_department_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyDepartmentInfo record);
}