package com.ccnc.service;

import com.ccnc.bean.User;

import java.util.List;

/**
 * 用户相关功能
 */
public interface UserService {
    // 添加用户
    boolean addUser(User user);

    // 删除用户
    boolean delUser(int id);

    // 修改用户
    boolean updateUser(User user);

    // 查找所有用户
    List<User> getAllUser();

    // 查找用户--ID
    User getUserById(int id);

}
