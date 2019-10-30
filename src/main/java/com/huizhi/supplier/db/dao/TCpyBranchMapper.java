package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.annotation.MybatisUserInfo;
import com.huizhi.supplier.db.model.TCpyBranch;
import com.huizhi.supplier.db.model.TCpyBranchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisUserInfo
public interface TCpyBranchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    long countByExample(TCpyBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    int insert(TCpyBranch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    int insertSelective(TCpyBranch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    TCpyBranch selectOneByExample(TCpyBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    TCpyBranch selectOneByExampleSelective(@Param("example") TCpyBranchExample example, @Param("selective") TCpyBranch.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    List<TCpyBranch> selectByExampleSelective(@Param("example") TCpyBranchExample example, @Param("selective") TCpyBranch.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    List<TCpyBranch> selectByExample(TCpyBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    TCpyBranch selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyBranch.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    TCpyBranch selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyBranch record, @Param("example") TCpyBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyBranch record, @Param("example") TCpyBranchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyBranch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_branch
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyBranch record);
}