package com.muyu.dao.base;

import com.muyu.entity.User;

import java.util.List;

public interface BaseUserMapper {

    List<User> selectAll();
}
