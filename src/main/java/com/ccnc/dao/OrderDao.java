package com.ccnc.dao;

import com.ccnc.bean.Order;
import org.apache.ibatis.annotations.Mapper;
import org.aspectj.weaver.ast.Or;

import java.util.List;

/**
 * 订单的dao类
 */
@Mapper
public interface OrderDao {
    // 增加订单
    Order insertOrder(Order order);

    // 删除订单
    void deleteOrder(int id);

    // 更新订单状态
    void updateOrder(Order order);

    // 查看所有订单
    List<Order> selectAllOrder();

    // 查看订单--ID
    Order selectOrderById(int id);

    // 查看订单--User
    List<Order> selectOrderByUser(int id);
}
