package com.example.using.dao;

import com.example.using.entity.UserSetting;
import com.example.using.entity.UserSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSettingMapper {
    long countByExample(UserSettingExample example);

    int deleteByExample(UserSettingExample example);

    int insert(UserSetting record);

    int insertSelective(UserSetting record);

    List<UserSetting> selectByExample(UserSettingExample example);

    int updateByExampleSelective(@Param("record") UserSetting record, @Param("example") UserSettingExample example);

    int updateByExample(@Param("record") UserSetting record, @Param("example") UserSettingExample example);
}