package com.ccnc.dao;

import com.ccnc.bean.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户评论Dao
 */
@Mapper
public interface CommentDao {
    // 增加评论
    Comment insertComment(Comment comment);

    // 删除评论
    void deleteCommentById(int id);

    // 更新评论
    void updateComment(Comment comment);

    // 查询所有评论
    List<Comment> selectAllComment();

    // 查询评论--ID
    Comment selectCommentById(int id);

    // 查询评论--Name
    List<Comment> selectCommentByName(String name);

    // 查询评论--UserId
    List<Comment> selectCommentByUserId(int id);
}
