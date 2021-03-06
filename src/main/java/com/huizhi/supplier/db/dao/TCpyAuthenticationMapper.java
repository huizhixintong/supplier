package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyAuthentication;
import com.huizhi.supplier.db.model.TCpyAuthenticationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MybatisUserInfo
public interface TCpyAuthenticationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    long countByExample(TCpyAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    int insert(TCpyAuthentication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    int insertSelective(TCpyAuthentication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    TCpyAuthentication selectOneByExample(TCpyAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    TCpyAuthentication selectOneByExampleSelective(@Param("example") TCpyAuthenticationExample example, @Param("selective") TCpyAuthentication.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    List<TCpyAuthentication> selectByExampleSelective(@Param("example") TCpyAuthenticationExample example, @Param("selective") TCpyAuthentication.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    List<TCpyAuthentication> selectByExample(TCpyAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    TCpyAuthentication selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyAuthentication.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    TCpyAuthentication selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyAuthentication record, @Param("example") TCpyAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyAuthentication record, @Param("example") TCpyAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyAuthentication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_authentication
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyAuthentication record);
}