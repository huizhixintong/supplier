package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyEnterprisePropertiesTree;
import com.huizhi.supplier.db.model.TCpyEnterprisePropertiesTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MybatisUserInfo
public interface TCpyEnterprisePropertiesTreeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    long countByExample(TCpyEnterprisePropertiesTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyEnterprisePropertiesTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    int insert(TCpyEnterprisePropertiesTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    int insertSelective(TCpyEnterprisePropertiesTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    TCpyEnterprisePropertiesTree selectOneByExample(TCpyEnterprisePropertiesTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    TCpyEnterprisePropertiesTree selectOneByExampleSelective(@Param("example") TCpyEnterprisePropertiesTreeExample example, @Param("selective") TCpyEnterprisePropertiesTree.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    List<TCpyEnterprisePropertiesTree> selectByExampleSelective(@Param("example") TCpyEnterprisePropertiesTreeExample example, @Param("selective") TCpyEnterprisePropertiesTree.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    List<TCpyEnterprisePropertiesTree> selectByExample(TCpyEnterprisePropertiesTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    TCpyEnterprisePropertiesTree selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyEnterprisePropertiesTree.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    TCpyEnterprisePropertiesTree selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyEnterprisePropertiesTree record, @Param("example") TCpyEnterprisePropertiesTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyEnterprisePropertiesTree record, @Param("example") TCpyEnterprisePropertiesTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyEnterprisePropertiesTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_enterprise_properties_tree
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyEnterprisePropertiesTree record);
}