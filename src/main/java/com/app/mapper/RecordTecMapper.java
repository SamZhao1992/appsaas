package com.app.mapper;

import com.app.entity.RecordTec;
import com.app.entity.RecordTecExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordTecMapper {
    long countByExample(RecordTecExample example);

    int deleteByExample(RecordTecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecordTec record);

    int insertSelective(RecordTec record);

    List<RecordTec> selectByExample(RecordTecExample example);

    RecordTec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecordTec record, @Param("example") RecordTecExample example);

    int updateByExample(@Param("record") RecordTec record, @Param("example") RecordTecExample example);

    int updateByPrimaryKeySelective(RecordTec record);

    int updateByPrimaryKey(RecordTec record);
}