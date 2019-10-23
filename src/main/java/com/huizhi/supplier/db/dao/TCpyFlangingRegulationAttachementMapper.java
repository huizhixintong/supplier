package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyFlangingRegulationAttachement;
import com.huizhi.supplier.db.model.TCpyFlangingRegulationAttachementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyFlangingRegulationAttachementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    long countByExample(TCpyFlangingRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyFlangingRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    int insert(TCpyFlangingRegulationAttachement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    int insertSelective(TCpyFlangingRegulationAttachement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationAttachement selectOneByExample(TCpyFlangingRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationAttachement selectOneByExampleSelective(@Param("example") TCpyFlangingRegulationAttachementExample example, @Param("selective") TCpyFlangingRegulationAttachement.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    List<TCpyFlangingRegulationAttachement> selectByExampleSelective(@Param("example") TCpyFlangingRegulationAttachementExample example, @Param("selective") TCpyFlangingRegulationAttachement.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    List<TCpyFlangingRegulationAttachement> selectByExample(TCpyFlangingRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyFlangingRegulationAttachement record, @Param("example") TCpyFlangingRegulationAttachementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_attachement
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyFlangingRegulationAttachement record, @Param("example") TCpyFlangingRegulationAttachementExample example);
}