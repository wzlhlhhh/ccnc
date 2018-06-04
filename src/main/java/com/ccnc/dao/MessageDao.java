package com.ccnc.dao;

import com.ccnc.bean.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 消息的Dao
 */
@Mapper
public interface MessageDao {
    // 增加消息
    Message insertMessage(Message message);

    // 删除消息
    void deleteMessageById(int id);

    // 更新消息
    void updateMessage(Message message);

    // 查询所有消息
    List<Message> selectAllMessage();

    // 查询消息--ID
    Message selectMessageById(int id);

    // 查询消息--User
    List<Message> selectMessageByUser(int id);
}
