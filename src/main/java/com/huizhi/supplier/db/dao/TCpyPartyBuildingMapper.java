package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyPartyBuilding;
import com.huizhi.supplier.db.model.TCpyPartyBuildingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyPartyBuildingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    long countByExample(TCpyPartyBuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyPartyBuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    int insert(TCpyPartyBuilding record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    int insertSelective(TCpyPartyBuilding record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    TCpyPartyBuilding selectOneByExample(TCpyPartyBuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    TCpyPartyBuilding selectOneByExampleSelective(@Param("example") TCpyPartyBuildingExample example, @Param("selective") TCpyPartyBuilding.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    List<TCpyPartyBuilding> selectByExampleSelective(@Param("example") TCpyPartyBuildingExample example, @Param("selective") TCpyPartyBuilding.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    List<TCpyPartyBuilding> selectByExample(TCpyPartyBuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    TCpyPartyBuilding selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyPartyBuilding.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    TCpyPartyBuilding selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyPartyBuilding record, @Param("example") TCpyPartyBuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyPartyBuilding record, @Param("example") TCpyPartyBuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyPartyBuilding record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_party_building
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyPartyBuilding record);
}