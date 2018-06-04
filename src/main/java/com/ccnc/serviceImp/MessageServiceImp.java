package com.ccnc.serviceImp;

import com.ccnc.bean.Message;
import com.ccnc.dao.MessageDao;
import com.ccnc.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImp implements MessageService {
    @Autowired
    private MessageDao messageDao;

    @Override
    public List<Message> getMessageByUser(int id) {
        return messageDao.selectMessageByUser(id);
    }
}
