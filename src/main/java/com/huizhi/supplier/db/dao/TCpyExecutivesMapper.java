package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyExecutives;
import com.huizhi.supplier.db.model.TCpyExecutivesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyExecutivesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    long countByExample(TCpyExecutivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyExecutivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    int insert(TCpyExecutives record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    int insertSelective(TCpyExecutives record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    TCpyExecutives selectOneByExample(TCpyExecutivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    TCpyExecutives selectOneByExampleSelective(@Param("example") TCpyExecutivesExample example, @Param("selective") TCpyExecutives.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    List<TCpyExecutives> selectByExampleSelective(@Param("example") TCpyExecutivesExample example, @Param("selective") TCpyExecutives.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    List<TCpyExecutives> selectByExample(TCpyExecutivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    TCpyExecutives selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyExecutives.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    TCpyExecutives selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyExecutives record, @Param("example") TCpyExecutivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyExecutives record, @Param("example") TCpyExecutivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyExecutives record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_executives
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyExecutives record);
}