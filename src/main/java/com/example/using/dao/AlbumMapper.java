package com.example.using.dao;

import com.example.using.entity.Album;
import com.example.using.entity.AlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumMapper {
    long countByExample(AlbumExample example);

    int deleteByExample(AlbumExample example);

    int insert(Album record);

    int insertSelective(Album record);

    List<Album> selectByExample(AlbumExample example);

    int updateByExampleSelective(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByExample(@Param("record") Album record, @Param("example") AlbumExample example);
}