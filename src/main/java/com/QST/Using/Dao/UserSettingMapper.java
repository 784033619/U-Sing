package com.QST.Using.Dao;

import com.QST.Using.Etitys.UserSetting;
import com.QST.Using.Etitys.UserSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSettingMapper {
    int countByExample(UserSettingExample example);

    int deleteByExample(UserSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserSetting record);

    int insertSelective(UserSetting record);

    List<UserSetting> selectByExample(UserSettingExample example);

    UserSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserSetting record, @Param("example") UserSettingExample example);

    int updateByExample(@Param("record") UserSetting record, @Param("example") UserSettingExample example);

    int updateByPrimaryKeySelective(UserSetting record);

    int updateByPrimaryKey(UserSetting record);
}