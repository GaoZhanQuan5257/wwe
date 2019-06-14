package com.muyu.controller;

import com.muyu.dao.UserMapper;
import com.muyu.entity.User;
import com.muyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/user")
    public User queryAll(){
       // userMapper.insert(new User(1,"张三",null,"男","大秦帝国"));
        return userService.queryAll();
    }

}
