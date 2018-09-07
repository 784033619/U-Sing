package com.QST.Using.Service;

import com.QST.Using.Etitys.User;

public interface UserService {

    int savaUser(User user);

    User findUserByUsername(User user);
}
