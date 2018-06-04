package com.ccnc.controller;

import com.ccnc.bean.Activity;
import com.ccnc.serviceImp.ActivityServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2018年5月31日15:39:36
 * 微信获取活动信息等
 */
@Controller
@RequestMapping("/wx")
public class WxActivityController {
    @Autowired
    private ActivityServiceImp activityServiceImp;

    // 获取活动信息
    @RequestMapping("/Activity")
    @ResponseBody
    public List<Activity> getActivity() {
        List<Activity> activity = activityServiceImp.getAllActivity();
        return activity;
    }
}
