package com.muyu.impl;

import com.muyu.dao.UserMapper;
import com.muyu.entity.User;
import com.muyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAll() {
       return userMapper.selectAll();
    }

    @Override
    public int insertUser(User user) {
        user.setId(null);
        return userMapper.insert(user);
    }
}
