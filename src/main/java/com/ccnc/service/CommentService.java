package com.ccnc.service;

import com.ccnc.bean.Comment;

import java.util.List;

/**
 * 和评论相关的服务
 */
public interface CommentService {
    // 增加评论
    boolean addComment(Comment comment);

    // 删除评论
    boolean deleteCommentById(int id);

    // 获取所有评论
    List<Comment> getAllComment();

    // 获取某个用户的评论
    List<Comment> getCommentByUserId(int id);
}
