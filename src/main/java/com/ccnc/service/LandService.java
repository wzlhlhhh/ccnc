package com.ccnc.service;

import com.ccnc.bean.Land;

import java.util.List;

/**
 * 土地的相关操作
 */
public interface LandService {
    // 获得所有土地
    List<Land> getAllLand();

    // 获得土地--ID
    Land getLandById(int id);
}
