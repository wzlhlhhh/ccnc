package com.ccnc.controller;

import com.ccnc.bean.Message;
import com.ccnc.serviceImp.MessageServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2018年5月31日16:05:45
 * 微信的推送消息的交互
 */
@Controller
@RequestMapping("/wx")
public class WxMessageController {
    @Autowired
    private MessageServiceImp messageServiceImp;

    // 获取推送消息
    @RequestMapping("/UserMessage")
    @ResponseBody
    public List<Message> getMessageByUser(int id)
    {
        return messageServiceImp.getMessageByUser(id);
    }
}
