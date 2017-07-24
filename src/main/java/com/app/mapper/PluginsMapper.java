package com.app.mapper;

import com.app.entity.Plugins;
import com.app.entity.PluginsExample;
import com.app.entity.PluginsKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PluginsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int countByExample(PluginsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int deleteByExample(PluginsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int deleteByPrimaryKey(PluginsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int insert(Plugins record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int insertSelective(Plugins record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    List<Plugins> selectByExample(PluginsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    Plugins selectByPrimaryKey(PluginsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") Plugins record, @Param("example") PluginsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByExample(@Param("record") Plugins record, @Param("example") PluginsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByPrimaryKeySelective(Plugins record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugins
     *
     * @mbggenerated Mon Jul 24 14:53:05 CST 2017
     */
    int updateByPrimaryKey(Plugins record);
}