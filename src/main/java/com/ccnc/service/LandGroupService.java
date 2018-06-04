package com.ccnc.service;

import com.ccnc.bean.LandGroup;

import java.util.List;

/**
 * 基地的接口
 */
public interface LandGroupService {
    // 获取基地信息
    List<LandGroup> getAllLandGroup();

    // 获取单个基地--ID
    LandGroup getLandGroupById(int id);

}
