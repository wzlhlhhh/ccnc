package com.ccnc.controller;

import com.ccnc.bean.User;
import com.ccnc.dao.UserDao;
import com.ccnc.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/wx")
public class WxUserController {
    @Autowired
    private UserServiceImp userServiceImp;

    // 注册用户
    @RequestMapping("/Register")
    @ResponseBody
    public boolean addUser(User user)
    {
        if (userServiceImp.addUser(user))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // 查看用户信息
    @RequestMapping("/UserDetail")
    @ResponseBody
    public User getUser(int id)
    {
        return userServiceImp.getUserById(id);
    }

    // 更新用户信息
    @RequestMapping("/UserUpdate")
    @ResponseBody
    public boolean updateUser(User user)
    {
        if (userServiceImp.updateUser(user))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // 用户登录
    @RequestMapping("/UserLogin")
    @ResponseBody
    public boolean login(User user)
    {
        if(userServiceImp.Login(user).getId() > 0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
