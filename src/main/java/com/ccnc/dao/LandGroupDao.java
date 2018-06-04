package com.ccnc.dao;

import com.ccnc.bean.LandGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 基地的相关操作
 */
@Mapper
public interface LandGroupDao {
    // 增加基地
    void insertLandGroup(LandGroup landGroup);

    // 删除基地
    void deleteLandGroupById(int id);

    // 更新基地
    void updateLandGroup(LandGroup landGroup);

    // 列出所有基地
    List<LandGroup> selectAllLandGroup();

    // 查询单个基地--ID
    LandGroup selectLandGroupById(@Param("id") int id);

    // 查询基地--name
    List<LandGroup> selectLandGroupByName(String name);

}
