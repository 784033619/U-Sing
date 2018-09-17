package com.example.using.dao;

import com.example.using.entity.SonglistSong;
import com.example.using.entity.SonglistSongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonglistSongMapper {
    long countByExample(SonglistSongExample example);

    int deleteByExample(SonglistSongExample example);

    int insert(SonglistSong record);

    int insertSelective(SonglistSong record);

    List<SonglistSong> selectByExample(SonglistSongExample example);

    int updateByExampleSelective(@Param("record") SonglistSong record, @Param("example") SonglistSongExample example);

    int updateByExample(@Param("record") SonglistSong record, @Param("example") SonglistSongExample example);
}