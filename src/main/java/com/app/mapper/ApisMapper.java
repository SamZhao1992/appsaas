package com.app.mapper;

import com.app.entity.Apis;
import com.app.entity.ApisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApisMapper {
    long countByExample(ApisExample example);

    int deleteByExample(ApisExample example);

    int deleteByPrimaryKey(String id);

    int insert(Apis record);

    int insertSelective(Apis record);

    List<Apis> selectByExample(ApisExample example);

    Apis selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Apis record, @Param("example") ApisExample example);

    int updateByExample(@Param("record") Apis record, @Param("example") ApisExample example);

    int updateByPrimaryKeySelective(Apis record);

    int updateByPrimaryKey(Apis record);
}