package com.ccnc.controller;

import com.ccnc.bean.Land;
import com.ccnc.bean.LandGroup;
import com.ccnc.serviceImp.LandGroupServiceImp;
import com.ccnc.serviceImp.LandServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2018年5月31日15:36:58
 * 微信端关于土地的交互
 */
@Controller
@RequestMapping("/wx")

public class WxLandController {
    @Autowired  // 一个注释对应一行，恩，别问我怎么知道的
    private LandGroupServiceImp landGroupServiceImp;
    @Autowired
    private LandServiceImp landServiceImp;

    // 获取基地信息
    @RequestMapping("/Base")
    @ResponseBody
    public List<LandGroup> getAllLandGroup() {
        List<LandGroup> lg = landGroupServiceImp.getAllLandGroup();
        return lg;
    }

    // 获取指定基地--ID
    @RequestMapping("/getBaseById")
    @ResponseBody
    public LandGroup getLandGroupById(int id) {
        return landGroupServiceImp.getLandGroupById(id);
    }

    // 获取土地信息
    @RequestMapping("/getLand")
    @ResponseBody
    public List<Land> getAllLand() {
        return landServiceImp.getAllLand();
    }

    // 获取单个土地信息
    @RequestMapping("/getLandById")
    @ResponseBody
    public Land getLandById(int id) {
        return landServiceImp.getLandById(id);
    }
}
