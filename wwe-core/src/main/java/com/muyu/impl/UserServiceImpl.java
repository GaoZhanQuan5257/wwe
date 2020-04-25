package com.muyu.impl;

import com.muyu.dao.UserMapper;
import com.muyu.entity.User;
import com.muyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAll() {
        return userMapper.selectAll();
    }

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void deleteUserById(Long userId) {
        userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public User getUserById(Long userId) {

        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> getUserList() {

        List<User> userList = userMapper.selectAll();

        return userList;
    }

}
