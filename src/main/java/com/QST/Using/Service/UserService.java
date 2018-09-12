package com.QST.Using.Service;

import com.QST.Using.Etitys.User;

import java.util.List;

public interface UserService {

    int savaUser(User user);

    List<User> getUserByUsername(User user);

    public List<User> login(User user);

    User getPersonalInfo(Integer id);

    int updatePersonal(User user);

    void setUserHead(String username, String oldUrl);
}
