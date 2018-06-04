package com.ccnc.serviceImp;

import com.ccnc.MD5.MD5;
import com.ccnc.bean.User;
import com.ccnc.dao.UserDao;
import com.ccnc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        // 查重
        if(userDao.selectUserByUserName(user.getUsername()).getId() > 0)
        {
            return false;
        }
        // 加密
        user.setPassword(MD5.getMD5(user.getPassword()));
        if (userDao.insertUser(user).getId() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delUser(int id) {
        userDao.deleteUserById(id);
        if (userDao.selectUserById(id) == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateUser(User user) {
        userDao.updateUser(user);
        return true;
    }

    @Override
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public User getUserById(int id) {
        return userDao.selectUserById(id);
    }

    public User Login(User user) {
        return userDao.selectUserByNAP(user);
    }
}
