package com.muyu.service;

import com.muyu.entity.Orders;

import java.util.List;

public interface OrdersService {

    int insertOrders(Orders orders);

    List<Orders> queryAll();
}
