package com.muyu.service;

import com.muyu.entity.DoubleColorBall;

import java.util.List;

/**
 * 彩票服务
 *
 * @author 七小鱼 2020年06月13日14:31
 */
public interface DoubleColorBallService {
    List<DoubleColorBall> queryAll();

    void saveOrUpdate(DoubleColorBall doubleColorBall);
}
