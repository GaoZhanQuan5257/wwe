package com.muyu.service;

import com.muyu.entity.User;

import java.util.List;

public interface UserService {

    List<User> queryAll();

    void saveUser(User user);

    void updateUserById(User user);

    void deleteUserById(Long userId);

    User getUserById(Long userId);

    List<User> getUserList();
}
