package com.example.using.dao;

import com.example.using.entity.Songlist;
import com.example.using.entity.SonglistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonglistMapper {
    long countByExample(SonglistExample example);

    int deleteByExample(SonglistExample example);

    int insert(Songlist record);

    int insertSelective(Songlist record);

    List<Songlist> selectByExample(SonglistExample example);

    int updateByExampleSelective(@Param("record") Songlist record, @Param("example") SonglistExample example);

    int updateByExample(@Param("record") Songlist record, @Param("example") SonglistExample example);
}