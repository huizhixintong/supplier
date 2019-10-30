package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyIcp;
import com.huizhi.supplier.db.model.TCpyIcpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyIcpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    long countByExample(TCpyIcpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyIcpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    int insert(TCpyIcp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    int insertSelective(TCpyIcp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    TCpyIcp selectOneByExample(TCpyIcpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    TCpyIcp selectOneByExampleSelective(@Param("example") TCpyIcpExample example, @Param("selective") TCpyIcp.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    List<TCpyIcp> selectByExampleSelective(@Param("example") TCpyIcpExample example, @Param("selective") TCpyIcp.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    List<TCpyIcp> selectByExample(TCpyIcpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    TCpyIcp selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyIcp.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    TCpyIcp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyIcp record, @Param("example") TCpyIcpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyIcp record, @Param("example") TCpyIcpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyIcp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_icp
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyIcp record);
}