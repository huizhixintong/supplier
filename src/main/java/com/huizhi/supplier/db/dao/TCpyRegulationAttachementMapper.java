package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyRegulationAttachement;
import com.huizhi.supplier.db.model.TCpyRegulationAttachementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyRegulationAttachementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    long countByExample(TCpyRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    int insert(TCpyRegulationAttachement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    int insertSelective(TCpyRegulationAttachement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    TCpyRegulationAttachement selectOneByExample(TCpyRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    TCpyRegulationAttachement selectOneByExampleSelective(@Param("example") TCpyRegulationAttachementExample example, @Param("selective") TCpyRegulationAttachement.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    List<TCpyRegulationAttachement> selectByExampleSelective(@Param("example") TCpyRegulationAttachementExample example, @Param("selective") TCpyRegulationAttachement.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    List<TCpyRegulationAttachement> selectByExample(TCpyRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    TCpyRegulationAttachement selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyRegulationAttachement.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    TCpyRegulationAttachement selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyRegulationAttachement record, @Param("example") TCpyRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyRegulationAttachement record, @Param("example") TCpyRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyRegulationAttachement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_regulation_attachement
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyRegulationAttachement record);
}