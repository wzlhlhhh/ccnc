package com.ccnc.service;

import com.ccnc.bean.Activity;

import java.util.List;

/**
 * 活动的相关操作
 *
 */

public interface ActivityService {
    // 获得活动信息
    List<Activity> getAllActivity();

}
