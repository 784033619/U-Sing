package com.QST.Using.Service.ServiceImpl;

import com.QST.Using.Dao.UserMapper;
import com.QST.Using.Etitys.User;
import com.QST.Using.Etitys.UserExample;
import com.QST.Using.Service.UserFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userFileService")
public class UserFileServiceImpl implements UserFileService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;
    @Resource(name = "userExample")
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
