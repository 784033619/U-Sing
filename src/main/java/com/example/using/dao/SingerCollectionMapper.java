package com.example.using.dao;

import com.example.using.entity.SingerCollection;
import com.example.using.entity.SingerCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingerCollectionMapper {
    long countByExample(SingerCollectionExample example);

    int deleteByExample(SingerCollectionExample example);

    int insert(SingerCollection record);

    int insertSelective(SingerCollection record);

    List<SingerCollection> selectByExample(SingerCollectionExample example);

    int updateByExampleSelective(@Param("record") SingerCollection record, @Param("example") SingerCollectionExample example);

    int updateByExample(@Param("record") SingerCollection record, @Param("example") SingerCollectionExample example);
}