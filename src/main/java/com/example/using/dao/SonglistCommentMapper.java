package com.example.using.dao;

import com.example.using.entity.SonglistComment;
import com.example.using.entity.SonglistCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonglistCommentMapper {
    long countByExample(SonglistCommentExample example);

    int deleteByExample(SonglistCommentExample example);

    int insert(SonglistComment record);

    int insertSelective(SonglistComment record);

    List<SonglistComment> selectByExample(SonglistCommentExample example);

    int updateByExampleSelective(@Param("record") SonglistComment record, @Param("example") SonglistCommentExample example);

    int updateByExample(@Param("record") SonglistComment record, @Param("example") SonglistCommentExample example);
}