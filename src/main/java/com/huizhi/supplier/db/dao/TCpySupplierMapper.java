package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpySupplier;
import com.huizhi.supplier.db.model.TCpySupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MybatisUserInfo
public interface TCpySupplierMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    long countByExample(TCpySupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    int deleteByExample(TCpySupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    int insert(TCpySupplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    int insertSelective(TCpySupplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    TCpySupplier selectOneByExample(TCpySupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    TCpySupplier selectOneByExampleSelective(@Param("example") TCpySupplierExample example, @Param("selective") TCpySupplier.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    List<TCpySupplier> selectByExampleSelective(@Param("example") TCpySupplierExample example, @Param("selective") TCpySupplier.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    List<TCpySupplier> selectByExample(TCpySupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    TCpySupplier selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpySupplier.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    TCpySupplier selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpySupplier record, @Param("example") TCpySupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpySupplier record, @Param("example") TCpySupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpySupplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_supplier
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpySupplier record);
}