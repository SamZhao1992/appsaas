package com.app.mapper;

import com.app.entity.Targets;
import com.app.entity.TargetsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TargetsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int countByExample(TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int deleteByExample(TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int insert(Targets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int insertSelective(Targets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    List<Targets> selectByExample(TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    Targets selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") Targets record, @Param("example") TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByExample(@Param("record") Targets record, @Param("example") TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByPrimaryKeySelective(Targets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByPrimaryKey(Targets record);
}