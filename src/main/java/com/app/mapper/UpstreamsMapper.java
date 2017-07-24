package com.app.mapper;

import com.app.entity.Upstreams;
import com.app.entity.UpstreamsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UpstreamsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int countByExample(UpstreamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int deleteByExample(UpstreamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int insert(Upstreams record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int insertSelective(Upstreams record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    List<Upstreams> selectByExample(UpstreamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    Upstreams selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") Upstreams record, @Param("example") UpstreamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByExample(@Param("record") Upstreams record, @Param("example") UpstreamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByPrimaryKeySelective(Upstreams record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upstreams
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByPrimaryKey(Upstreams record);
}