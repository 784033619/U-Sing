package com.QST.Using.Dao;

import com.QST.Using.Etitys.SonglistSong;
import com.QST.Using.Etitys.SonglistSongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonglistSongMapper {
    int countByExample(SonglistSongExample example);

    int deleteByExample(SonglistSongExample example);

    int insert(SonglistSong record);

    int insertSelective(SonglistSong record);

    List<SonglistSong> selectByExample(SonglistSongExample example);

    int updateByExampleSelective(@Param("record") SonglistSong record, @Param("example") SonglistSongExample example);

    int updateByExample(@Param("record") SonglistSong record, @Param("example") SonglistSongExample example);
}