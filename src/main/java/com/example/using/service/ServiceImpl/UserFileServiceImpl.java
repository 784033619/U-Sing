package com.example.using.service.ServiceImpl;

import com.example.using.dao.UserMapper;
import com.example.using.entity.User;
import com.example.using.entity.UserExample;
import com.example.using.service.UserFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userFileService")
public class UserFileServiceImpl implements UserFileService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserExample userExample;
    @Override
    public boolean checkExist(String fileMd5) {
        userExample.clear();
        userExample.createCriteria().andMd5fileEqualTo(fileMd5);
        List<User> users = userMapper.selectByExample(userExample);
        return users!=null&&!users.isEmpty();
    }

    @Override
    public String getFileName(String fileMd5) {
        userExample.clear();
        userExample.createCriteria().andMd5fileEqualTo(fileMd5);
        List<User> users = userMapper.selectByExample(userExample);
        if(users.isEmpty()){
            return users.get(0).getHeadimg();
        }
        return null;
    }
}
