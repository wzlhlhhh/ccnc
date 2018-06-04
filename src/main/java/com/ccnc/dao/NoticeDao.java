package com.ccnc.dao;

import com.ccnc.bean.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * NoticeDao
 * 公告的相关操作
 */
@Mapper
public interface NoticeDao {
    // 添加公告
    void insertNotice(Notice notice);

    // 删除公告
    void deleteNoticeById(int id);

    // 更新公告
    void updateNotice(Notice notice);

    // 查找全部公告
    List<Notice> selectAllNotice();

    // 查找单个公告--ID
    Notice selectNoticeById(int id);

    // 查找单个公告--name
    List<Notice> selectNoticeByName(String name);

    // 获得指定分类公告
    Notice selectNoticeByType(@Param("type") String type);

    // 获得普通公告
    List<Notice> selectNormalNotice();
}
