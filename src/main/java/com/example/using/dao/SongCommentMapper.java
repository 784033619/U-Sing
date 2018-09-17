package com.example.using.dao;

import com.example.using.entity.SongComment;
import com.example.using.entity.SongCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongCommentMapper {
    long countByExample(SongCommentExample example);

    int deleteByExample(SongCommentExample example);

    int insert(SongComment record);

    int insertSelective(SongComment record);

    List<SongComment> selectByExample(SongCommentExample example);

    int updateByExampleSelective(@Param("record") SongComment record, @Param("example") SongCommentExample example);

    int updateByExample(@Param("record") SongComment record, @Param("example") SongCommentExample example);
}