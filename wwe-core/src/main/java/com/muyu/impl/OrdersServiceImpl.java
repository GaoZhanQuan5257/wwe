package com.muyu.impl;

import com.muyu.dao.FlowMapper;
import com.muyu.dao.OrdersMapper;
import com.muyu.entity.Flow;
import com.muyu.entity.Orders;
import com.muyu.service.OrdersService;
import com.muyu.util.OrderStatusEnum;
import com.muyu.util.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private FlowMapper flowMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Override
    public void saveOrder(Orders order) {
        ordersMapper.insert(order);
    }

    @Override
    public Orders getOrderById(Long orderId) {
        return ordersMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public void updateOrderStatus(Long orderId, String alpayFlowNum, String paidAmount) {

        Orders order = getOrderById(orderId);
        if (order.getOrderStatus().equals(OrderStatusEnum.WAIT_PAY.key)) {
            order = new Orders();
            order.setId(orderId);
            order.setOrderStatus(OrderStatusEnum.PAID.key);
            order.setPaidTime(new Date());
            order.setPaidAmount(paidAmount);

            ordersMapper.updateByPrimaryKeySelective(order);

            order = getOrderById(orderId);

            Long flowId = snowFlake.nextId();
            Flow flow = new Flow();
            flow.setId(flowId);
            flow.setFlowNum(alpayFlowNum);
            flow.setBuyCounts(order.getBuyCounts());
            flow.setCreateTime(new Date());
            flow.setOrderNum(orderId);
            flow.setPaidAmount(paidAmount);
            flow.setPaidMethod(1);
            flow.setProductId(order.getProductId());

            flowMapper.insertSelective(flow);
        }

    }

}
