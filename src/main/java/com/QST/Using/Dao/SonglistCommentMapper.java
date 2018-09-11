package com.QST.Using.Dao;

import com.QST.Using.Etitys.SonglistComment;
import com.QST.Using.Etitys.SonglistCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonglistCommentMapper {
    int countByExample(SonglistCommentExample example);

    int deleteByExample(SonglistCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SonglistComment record);

    int insertSelective(SonglistComment record);

    List<SonglistComment> selectByExample(SonglistCommentExample example);

    SonglistComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SonglistComment record, @Param("example") SonglistCommentExample example);

    int updateByExample(@Param("record") SonglistComment record, @Param("example") SonglistCommentExample example);

    int updateByPrimaryKeySelective(SonglistComment record);

    int updateByPrimaryKey(SonglistComment record);
}