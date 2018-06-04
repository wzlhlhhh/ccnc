package com.ccnc.service;

import com.ccnc.bean.Message;

import java.util.List;

/**
 * 消息的相关操作
 */
public interface MessageService {
    // 接收和用户相关的消息
    List<Message> getMessageByUser(int id);
}
