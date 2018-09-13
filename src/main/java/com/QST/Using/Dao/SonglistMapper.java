package com.QST.Using.Dao;

import com.QST.Using.Etitys.Songlist;
import com.QST.Using.Etitys.SonglistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository(value = "songlistMapper")
public interface SonglistMapper {
    int countByExample(SonglistExample example);

    int deleteByExample(SonglistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Songlist record);

    int insertSelective(Songlist record);

    List<Songlist> selectByExample(SonglistExample example);

    Songlist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Songlist record, @Param("example") SonglistExample example);

    int updateByExample(@Param("record") Songlist record, @Param("example") SonglistExample example);

    int updateByPrimaryKeySelective(Songlist record);

    int updateByPrimaryKey(Songlist record);
}