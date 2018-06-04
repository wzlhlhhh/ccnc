package com.ccnc.dao;

import com.ccnc.bean.Land;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 土地的操作Dao
 */
@Mapper
public interface LandDao {
    // 增加土地
    void insertLand(Land land);

    // 删除土地
    void deleteLandById(int id);

    // 更新土地
    void updateLand(Land land);

    // 查询全部土地
    List<Land> selectAllLand();

    // 按基地查询土地
    List<Land> selectLandByLandGroup(String landGroupName);

    // 查询单个土地--ID
    Land selectLandById(int id);

    // 查询单个土地--Name
    Land selectLandByName(String name);
}
