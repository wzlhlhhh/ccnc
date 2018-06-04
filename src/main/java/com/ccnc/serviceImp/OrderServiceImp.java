package com.ccnc.serviceImp;

import com.ccnc.bean.Order;
import com.ccnc.dao.OrderDao;
import com.ccnc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public boolean addOrder(Order order) {
        if(orderDao.insertOrder(order).getId() > 0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean delOrder(int id) {
        orderDao.deleteOrder(id);
        if(orderDao.selectOrderById(id) == null)
        {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Order getOrderById(int id) {
        return orderDao.selectOrderById(id);
    }

    @Override
    public List<Order> getOrderByUser(int id) {
        return orderDao.selectOrderByUser(id);
    }
}
