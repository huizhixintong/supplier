package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyFlangingRegulationCheck;
import com.huizhi.supplier.db.model.TCpyFlangingRegulationCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyFlangingRegulationCheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    long countByExample(TCpyFlangingRegulationCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyFlangingRegulationCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    int insert(TCpyFlangingRegulationCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    int insertSelective(TCpyFlangingRegulationCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationCheck selectOneByExample(TCpyFlangingRegulationCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationCheck selectOneByExampleSelective(@Param("example") TCpyFlangingRegulationCheckExample example, @Param("selective") TCpyFlangingRegulationCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    List<TCpyFlangingRegulationCheck> selectByExampleSelective(@Param("example") TCpyFlangingRegulationCheckExample example, @Param("selective") TCpyFlangingRegulationCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    List<TCpyFlangingRegulationCheck> selectByExample(TCpyFlangingRegulationCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationCheck selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyFlangingRegulationCheck.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationCheck selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyFlangingRegulationCheck record, @Param("example") TCpyFlangingRegulationCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyFlangingRegulationCheck record, @Param("example") TCpyFlangingRegulationCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyFlangingRegulationCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_check
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyFlangingRegulationCheck record);
}