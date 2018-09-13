package com.QST.Using.Dao;

import com.QST.Using.Etitys.SongComment;
import com.QST.Using.Etitys.SongCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("songCommentMapper")
public interface SongCommentMapper {
    int countByExample(SongCommentExample example);

    int deleteByExample(SongCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SongComment record);

    int insertSelective(SongComment record);

    List<SongComment> selectByExample(SongCommentExample example);

    SongComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SongComment record, @Param("example") SongCommentExample example);

    int updateByExample(@Param("record") SongComment record, @Param("example") SongCommentExample example);

    int updateByPrimaryKeySelective(SongComment record);

    int updateByPrimaryKey(SongComment record);
}