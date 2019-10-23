package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpySoftwareCopyright;
import com.huizhi.supplier.db.model.TCpySoftwareCopyrightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpySoftwareCopyrightMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    long countByExample(TCpySoftwareCopyrightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    int deleteByExample(TCpySoftwareCopyrightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    int insert(TCpySoftwareCopyright record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    int insertSelective(TCpySoftwareCopyright record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    TCpySoftwareCopyright selectOneByExample(TCpySoftwareCopyrightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    TCpySoftwareCopyright selectOneByExampleSelective(@Param("example") TCpySoftwareCopyrightExample example, @Param("selective") TCpySoftwareCopyright.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    List<TCpySoftwareCopyright> selectByExampleSelective(@Param("example") TCpySoftwareCopyrightExample example, @Param("selective") TCpySoftwareCopyright.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    List<TCpySoftwareCopyright> selectByExample(TCpySoftwareCopyrightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    TCpySoftwareCopyright selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpySoftwareCopyright.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    TCpySoftwareCopyright selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpySoftwareCopyright record, @Param("example") TCpySoftwareCopyrightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpySoftwareCopyright record, @Param("example") TCpySoftwareCopyrightExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpySoftwareCopyright record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_software_copyright
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpySoftwareCopyright record);
}