package com.ccnc.service;

import com.ccnc.bean.Notice;

import java.util.List;

/**
 * 公告服务的接口
 */
public interface NoticeService {
    // 获得品牌故事
    Notice getBrandStory();

    // 获得邀请信息
    Notice getInvite();

    // 获得普通公告
    List<Notice> getNormalNotice();

    // 获得客服信息
    Notice getCustomerService();
}
