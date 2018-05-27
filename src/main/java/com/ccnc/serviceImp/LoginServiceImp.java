package com.ccnc.serviceImp;

import com.ccnc.bean.User;
import com.ccnc.dao.UserDao;
import com.ccnc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 实现登录接口
 */
@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.selectUserByNAP(user);
    }
}
