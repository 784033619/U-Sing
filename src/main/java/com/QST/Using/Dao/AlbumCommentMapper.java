package com.QST.Using.Dao;

import com.QST.Using.Etitys.AlbumComment;
import com.QST.Using.Etitys.AlbumCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumCommentMapper {
    int countByExample(AlbumCommentExample example);

    int deleteByExample(AlbumCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlbumComment record);

    int insertSelective(AlbumComment record);

    List<AlbumComment> selectByExample(AlbumCommentExample example);

    AlbumComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AlbumComment record, @Param("example") AlbumCommentExample example);

    int updateByExample(@Param("record") AlbumComment record, @Param("example") AlbumCommentExample example);

    int updateByPrimaryKeySelective(AlbumComment record);

    int updateByPrimaryKey(AlbumComment record);
}