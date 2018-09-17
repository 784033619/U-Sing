package com.QST.Using.Service.ServiceImpl;

import com.QST.Using.Dao.UserMapper;
import com.QST.Using.Etitys.User;
import com.QST.Using.Etitys.UserExample;
import com.QST.Using.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;
    @Resource(name = "userExample")
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
