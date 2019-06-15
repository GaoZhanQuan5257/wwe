package com.muyu.impl;

import com.muyu.dao.OrdersMapper;
import com.muyu.entity.Orders;
import com.muyu.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public int insertOrders(Orders orders) {
        return ordersMapper.insert(orders);
    }

    @Override
    public List<Orders> queryAll() {
        return ordersMapper.selectAll();
    }
}
