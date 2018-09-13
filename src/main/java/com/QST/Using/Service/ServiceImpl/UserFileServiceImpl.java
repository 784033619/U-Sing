package com.QST.Using.Service.ServiceImpl;

import com.QST.Using.Dao.UserMapper;
import com.QST.Using.Etitys.UserExample;
import com.QST.Using.Service.UserFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userFileService")
public class UserFileServiceImpl implements UserFileService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;
    @Resource(name = "userExample")
    private UserExample userExample;
    @Override
    public boolean checkExist(String fileMd5) {
        userExample.clear();
        userExample.createCriteria();
        return false;
    }

    @Override
    public String getFileName(String fileMd5) {
        return null;
    }

    @Override
    public void addUserFile(String username, String filename, String fileMd5) {

    }
}
