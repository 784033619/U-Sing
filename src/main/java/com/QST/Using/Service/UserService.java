package com.QST.Using.Service;

import com.QST.Using.Etitys.User;

import java.util.List;

public interface UserService {

    int savaUser(User user);

    List<User> findUserByUsername(User user);

    public List<User> login(User user);
}
