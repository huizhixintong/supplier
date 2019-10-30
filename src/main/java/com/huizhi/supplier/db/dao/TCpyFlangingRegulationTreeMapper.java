package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyFlangingRegulationTree;
import com.huizhi.supplier.db.model.TCpyFlangingRegulationTreeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyFlangingRegulationTreeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    long countByExample(TCpyFlangingRegulationTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyFlangingRegulationTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    int insert(TCpyFlangingRegulationTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    int insertSelective(TCpyFlangingRegulationTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationTree selectOneByExample(TCpyFlangingRegulationTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationTree selectOneByExampleSelective(@Param("example") TCpyFlangingRegulationTreeExample example, @Param("selective") TCpyFlangingRegulationTree.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    List<TCpyFlangingRegulationTree> selectByExampleSelective(@Param("example") TCpyFlangingRegulationTreeExample example, @Param("selective") TCpyFlangingRegulationTree.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    List<TCpyFlangingRegulationTree> selectByExample(TCpyFlangingRegulationTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationTree selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyFlangingRegulationTree.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    TCpyFlangingRegulationTree selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyFlangingRegulationTree record, @Param("example") TCpyFlangingRegulationTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyFlangingRegulationTree record, @Param("example") TCpyFlangingRegulationTreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyFlangingRegulationTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_flanging_regulation_tree
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyFlangingRegulationTree record);
}