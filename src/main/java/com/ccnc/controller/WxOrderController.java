package com.ccnc.controller;

import com.ccnc.bean.Order;
import com.ccnc.serviceImp.OrderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2018年5月31日16:31:11
 * 微信用户订单查看
 */
@Controller
@RequestMapping("/wx")
public class WxOrderController {
    @Autowired
    private OrderServiceImp orderServiceImp;

    // 获取用户个人订单
    @RequestMapping("/UserOrder")
    @ResponseBody
    public List<Order> getUserOrder(int id)
    {
        return orderServiceImp.getOrderByUser(id);
    }

    // 获取详细订单
    @RequestMapping("/OrderDetail")
    @ResponseBody
    public Order getOrderDetail(int id)
    {
        return orderServiceImp.getOrderById(id);
    }

    // 删除个人订单
    @RequestMapping("/DelOrder")
    @ResponseBody
    public boolean delUserOrder(int id)
    {
        if (orderServiceImp.delOrder(id))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
