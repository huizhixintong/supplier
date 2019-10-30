package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyYearFixedAssets;
import com.huizhi.supplier.db.model.TCpyYearFixedAssetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyYearFixedAssetsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    long countByExample(TCpyYearFixedAssetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyYearFixedAssetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    int insert(TCpyYearFixedAssets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    int insertSelective(TCpyYearFixedAssets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    TCpyYearFixedAssets selectOneByExample(TCpyYearFixedAssetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    TCpyYearFixedAssets selectOneByExampleSelective(@Param("example") TCpyYearFixedAssetsExample example, @Param("selective") TCpyYearFixedAssets.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    List<TCpyYearFixedAssets> selectByExampleSelective(@Param("example") TCpyYearFixedAssetsExample example, @Param("selective") TCpyYearFixedAssets.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    List<TCpyYearFixedAssets> selectByExample(TCpyYearFixedAssetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    TCpyYearFixedAssets selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyYearFixedAssets.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    TCpyYearFixedAssets selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyYearFixedAssets record, @Param("example") TCpyYearFixedAssetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyYearFixedAssets record, @Param("example") TCpyYearFixedAssetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyYearFixedAssets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_year_fixed_assets
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyYearFixedAssets record);
}