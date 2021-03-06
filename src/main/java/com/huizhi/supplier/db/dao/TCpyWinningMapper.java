package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyWinning;
import com.huizhi.supplier.db.model.TCpyWinningExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyWinningMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    long countByExample(TCpyWinningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyWinningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    int insert(TCpyWinning record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    int insertSelective(TCpyWinning record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    TCpyWinning selectOneByExample(TCpyWinningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    TCpyWinning selectOneByExampleSelective(@Param("example") TCpyWinningExample example, @Param("selective") TCpyWinning.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    List<TCpyWinning> selectByExampleSelective(@Param("example") TCpyWinningExample example, @Param("selective") TCpyWinning.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    List<TCpyWinning> selectByExample(TCpyWinningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    TCpyWinning selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TCpyWinning.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    TCpyWinning selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyWinning record, @Param("example") TCpyWinningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyWinning record, @Param("example") TCpyWinningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyWinning record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_winning
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyWinning record);
}