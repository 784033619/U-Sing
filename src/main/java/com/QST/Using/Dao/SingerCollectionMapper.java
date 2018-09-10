package com.QST.Using.Dao;

import com.QST.Using.Etitys.SingerCollection;
import com.QST.Using.Etitys.SingerCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingerCollectionMapper {
    int countByExample(SingerCollectionExample example);

    int deleteByExample(SingerCollectionExample example);

    int insert(SingerCollection record);

    int insertSelective(SingerCollection record);

    List<SingerCollection> selectByExample(SingerCollectionExample example);

    int updateByExampleSelective(@Param("record") SingerCollection record, @Param("example") SingerCollectionExample example);

    int updateByExample(@Param("record") SingerCollection record, @Param("example") SingerCollectionExample example);
}