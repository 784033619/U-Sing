package com.example.using.dao;

import com.example.using.entity.Song;
import com.example.using.entity.SongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongMapper {
    long countByExample(SongExample example);

    int deleteByExample(SongExample example);

    int insert(Song record);

    int insertSelective(Song record);

    List<Song> selectByExample(SongExample example);

    int updateByExampleSelective(@Param("record") Song record, @Param("example") SongExample example);

    int updateByExample(@Param("record") Song record, @Param("example") SongExample example);
}