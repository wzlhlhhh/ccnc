package com.ccnc.controller;

import com.ccnc.bean.Activity;
import com.ccnc.bean.Land;
import com.ccnc.bean.LandGroup;
import com.ccnc.bean.Notice;
import com.ccnc.service.LandGroupService;
import com.ccnc.serviceImp.ActivityServiceImp;
import com.ccnc.serviceImp.LandGroupServiceImp;
import com.ccnc.serviceImp.LandServiceImp;
import com.ccnc.serviceImp.NoticeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2018年5月29日14:48:52
 * 微信端关于公告的交互
 */
@Controller
@RequestMapping("/wx")
public class WxNoticeController {

    @Autowired
    private NoticeServiceImp noticeServiceImp;



    // 获取品牌故事
    @RequestMapping("/BrandStory")
    @ResponseBody
    public Notice getBrandStory() {
        Notice notice = noticeServiceImp.getBrandStory();
        return notice;
    }

    // 获取邀请
    @RequestMapping("/Invite")
    @ResponseBody
    public Notice getInvite() {
        Notice notice = noticeServiceImp.getInvite();
        return notice;
    }

    // 获取普通公告
    @RequestMapping("/NormalNotice")
    @ResponseBody
    public List<Notice> getNotice() {
        List<Notice> notice = noticeServiceImp.getNormalNotice();
        return notice;
    }
}
