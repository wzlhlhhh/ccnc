package com.ccnc.service;

import com.ccnc.bean.Order;

import java.util.List;

/**
 * 订单的服务层？？！！嘻嘻嘻
 */
public interface OrderService {
    // 增加订单
    boolean addOrder(Order order);

    // 删除订单
    boolean delOrder(int id);

    // 获得订单--ID
    Order getOrderById(int id);

    // 获得订单--User
    List<Order> getOrderByUser(int id);
}
