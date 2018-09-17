package com.example.using.service;


import com.example.using.entity.User;

import java.util.List;

public interface UserService {

    int savaUser(User user);

    List<User> getUserByUsername(User user);

    public List<User> login(User user);

    User getPersonalInfo(Long id);

    int updatePersonal(User user);

    int updateUserHead(String username, String oldUrl);
}
