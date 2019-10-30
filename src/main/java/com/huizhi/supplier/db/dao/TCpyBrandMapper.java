package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyBrand;
import com.huizhi.supplier.db.model.TCpyBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    long countByExample(TCpyBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    int insert(TCpyBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    int insertSelective(TCpyBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    TCpyBrand selectOneByExample(TCpyBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    TCpyBrand selectOneByExampleSelective(@Param("example") TCpyBrandExample example, @Param("selective") TCpyBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    List<TCpyBrand> selectByExampleSelective(@Param("example") TCpyBrandExample example, @Param("selective") TCpyBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    List<TCpyBrand> selectByExample(TCpyBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    TCpyBrand selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    TCpyBrand selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyBrand record, @Param("example") TCpyBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyBrand record, @Param("example") TCpyBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyBrand record);
}