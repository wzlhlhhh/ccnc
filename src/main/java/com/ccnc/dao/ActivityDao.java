package com.ccnc.dao;

import com.ccnc.bean.Activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 活动的Dao
 */
@Mapper
public interface ActivityDao {
    // 增加活动
    void insertActivity(Activity activity);

    // 删除活动
    void deleteActivityById(int id);

    // 更新活动
    void updateActivity(Activity activity);

    // 查询所有活动
    List<Activity> selectAllActivity();

    // 查询活动--ID
    Activity selectActivityById(int id);

    // 查询活动--Name
    List<Activity> selectActiivityByName(String name);
}
