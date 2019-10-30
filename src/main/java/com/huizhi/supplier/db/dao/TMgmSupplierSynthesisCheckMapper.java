package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TMgmSupplierSynthesisCheck;
import com.huizhi.supplier.db.model.TMgmSupplierSynthesisCheckExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TMgmSupplierSynthesisCheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    long countByExample(TMgmSupplierSynthesisCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    int deleteByExample(TMgmSupplierSynthesisCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    int insert(TMgmSupplierSynthesisCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    int insertSelective(TMgmSupplierSynthesisCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    TMgmSupplierSynthesisCheck selectOneByExample(TMgmSupplierSynthesisCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    TMgmSupplierSynthesisCheck selectOneByExampleSelective(@Param("example") TMgmSupplierSynthesisCheckExample example, @Param("selective") TMgmSupplierSynthesisCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    List<TMgmSupplierSynthesisCheck> selectByExampleSelective(@Param("example") TMgmSupplierSynthesisCheckExample example, @Param("selective") TMgmSupplierSynthesisCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    List<TMgmSupplierSynthesisCheck> selectByExample(TMgmSupplierSynthesisCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    TMgmSupplierSynthesisCheck selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TMgmSupplierSynthesisCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    TMgmSupplierSynthesisCheck selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TMgmSupplierSynthesisCheck record, @Param("example") TMgmSupplierSynthesisCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TMgmSupplierSynthesisCheck record, @Param("example") TMgmSupplierSynthesisCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TMgmSupplierSynthesisCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mgm_supplier_synthesis_check
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TMgmSupplierSynthesisCheck record);
}