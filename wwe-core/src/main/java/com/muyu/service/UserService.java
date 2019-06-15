package com.muyu.service;

import com.muyu.entity.User;

import java.util.List;

public interface UserService {

    List<User> queryAll();

    int insertUser(User user);
}
