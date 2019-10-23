package com.huizhi.supplier.db.dao;

import com.huizhi.supplier.db.model.TCpyLegalRoom;
import com.huizhi.supplier.db.model.TCpyLegalRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCpyLegalRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    long countByExample(TCpyLegalRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    int deleteByExample(TCpyLegalRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    int insert(TCpyLegalRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    int insertSelective(TCpyLegalRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    TCpyLegalRoom selectOneByExample(TCpyLegalRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    TCpyLegalRoom selectOneByExampleSelective(@Param("example") TCpyLegalRoomExample example, @Param("selective") TCpyLegalRoom.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    List<TCpyLegalRoom> selectByExampleSelective(@Param("example") TCpyLegalRoomExample example, @Param("selective") TCpyLegalRoom.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    List<TCpyLegalRoom> selectByExample(TCpyLegalRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    TCpyLegalRoom selectByPrimaryKeySelective(@Param("id") String id, @Param("selective") TCpyLegalRoom.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    TCpyLegalRoom selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TCpyLegalRoom record, @Param("example") TCpyLegalRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TCpyLegalRoom record, @Param("example") TCpyLegalRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCpyLegalRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cpy_legal_room
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCpyLegalRoom record);
}