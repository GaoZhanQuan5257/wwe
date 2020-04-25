package com.muyu.controller;

import com.muyu.entity.User;
import com.muyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public ModelAndView products() throws Exception {

        List<User> userList = userService.queryAll();

        ModelAndView model = new ModelAndView("user");
        model.addObject("userList", userList);

        return model;
    }

}
