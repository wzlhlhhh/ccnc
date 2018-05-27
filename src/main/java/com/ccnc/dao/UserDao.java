package com.ccnc.dao;

import com.ccnc.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * User的Dao层
 */
@Mapper
public interface UserDao {
    // 增加用户
    boolean insertUser(User user);

    // 更改用户
    boolean updateUser(User user);

    // 删除用户
    boolean deleteUserById(int id);

    // 查询所有
    List<User> selectAllUser();

    // 按ID查询
    User selectUserById(int id);

    // 按角色查询
    List<User> selectUserByRole(String role);

    // 按用户名查询
    List<User> selectUserByName(String username);

    // 按用户名密码查询
    User selectUserByNAP(User user);
}
