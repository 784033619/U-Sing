package com.example.using.service.ServiceImpl;

import com.example.using.dao.UserMapper;
import com.example.using.entity.UserExample;
import com.example.using.entity.User;
import com.example.using.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserExample userExample;
    @Override
    public int savaUser(User user) {
        return  userMapper.insert(user);
    }

    @Override
    public List<User> getUserByUsername(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria  criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        List<User> list = userMapper.selectByExample(userExample);
        return list;
    }

    @Override
    public User getPersonalInfo(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updatePersonal(User user) {
        int rows = userMapper.updateByPrimaryKeySelective(user);
        return rows;
    }

    @Override
    public int updateUserHead(String username, String headPath) {
        userExample.clear();
        userExample.createCriteria().andUsernameEqualTo(username);
        User user = new User();
        user.setHeadimg(headPath);
        return userMapper.updateByExampleSelective(user, userExample);
    }
}
