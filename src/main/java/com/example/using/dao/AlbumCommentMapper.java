package com.example.using.dao;

import com.example.using.entity.AlbumComment;
import com.example.using.entity.AlbumCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumCommentMapper {
    long countByExample(AlbumCommentExample example);

    int deleteByExample(AlbumCommentExample example);

    int insert(AlbumComment record);

    int insertSelective(AlbumComment record);

    List<AlbumComment> selectByExample(AlbumCommentExample example);

    int updateByExampleSelective(@Param("record") AlbumComment record, @Param("example") AlbumCommentExample example);

    int updateByExample(@Param("record") AlbumComment record, @Param("example") AlbumCommentExample example);
}