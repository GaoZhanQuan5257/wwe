package com.muyu.impl;

import com.muyu.dao.DoubleColorBallMapper;
import com.muyu.entity.DoubleColorBall;
import com.muyu.service.DoubleColorBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Objects;

/**
 * @author 七小鱼 2020年06月13日14:35
 */
@Service
public class DoubleColorBallServiceImpl implements DoubleColorBallService {

    @Autowired
    private DoubleColorBallMapper doubleColorBallMapper;

    @Override
    public List<DoubleColorBall> queryAll() {
        return doubleColorBallMapper.selectAll();
    }

    @Override
    public void saveOrUpdate(DoubleColorBall doubleColorBall) {
        Assert.notNull(doubleColorBall, "doubleColorBall is null");
        if (Objects.isNull(doubleColorBall.getId())) {
            doubleColorBallMapper.insertSelective(doubleColorBall);
        } else {
            doubleColorBallMapper.updateByPrimaryKey(doubleColorBall);
        }
    }
}
