package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyPatent;
import com.huizhi.supplier.db.model.TCpyPatentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyPatentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    long countByExample(TCpyPatentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyPatentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    int insert(TCpyPatent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    int insertSelective(TCpyPatent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    TCpyPatent selectOneByExample(TCpyPatentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    TCpyPatent selectOneByExampleSelective(@Param("example") TCpyPatentExample example, @Param("selective") TCpyPatent.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    List<TCpyPatent> selectByExampleSelective(@Param("example") TCpyPatentExample example, @Param("selective") TCpyPatent.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    List<TCpyPatent> selectByExample(TCpyPatentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    TCpyPatent selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyPatent.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    TCpyPatent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyPatent record, @Param("example") TCpyPatentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyPatent record, @Param("example") TCpyPatentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyPatent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_patent
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyPatent record);
}