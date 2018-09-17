package com.example.using.dao;

import com.example.using.entity.Singer;
import com.example.using.entity.SingerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingerMapper {
    long countByExample(SingerExample example);

    int deleteByExample(SingerExample example);

    int insert(Singer record);

    int insertSelective(Singer record);

    List<Singer> selectByExample(SingerExample example);

    int updateByExampleSelective(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByExample(@Param("record") Singer record, @Param("example") SingerExample example);
}