package com.muyu.impl;

import com.muyu.dao.UserMapper;
import com.muyu.entity.User;
import com.muyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryAll() {
       return userMapper.selectByPrimaryKey(1);
    }
}
