package com.muyu.controller;

import com.muyu.dao.UserMapper;
import com.muyu.entity.Orders;
import com.muyu.entity.User;
import com.muyu.service.OrdersService;
import com.muyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrdersService ordersService;


    @RequestMapping("/user")
    public List<User> queryUserAll(){
//       userService.insertUser(new User(null,"aka",null,"F","HUAWEI"));
       return userService.queryAll();
    }
    @RequestMapping("/orders")
    public List<Orders> queryOrdersAll(){
//        ordersService.insertOrders(new Orders(null,1, "001",new Date(),"飞机"));
       return ordersService.queryAll();
    }

}
