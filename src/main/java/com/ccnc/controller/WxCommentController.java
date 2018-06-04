package com.ccnc.controller;

import com.ccnc.bean.Comment;
import com.ccnc.serviceImp.CommentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2018年5月31日15:41:00
 * 微信的评论功能
 */
@Controller
@RequestMapping("/wx")
public class WxCommentController {
    @Autowired
    private CommentServiceImp commentServiceImp;

    // 获取所有评论
    @RequestMapping("/Comment")
    @ResponseBody
    public List<Comment> getAllComment()
    {
        return commentServiceImp.getAllComment();
    }

    // 按用户获取评论
    @RequestMapping("/UserComment")
    @ResponseBody
    public List<Comment> getCommentByUser(int id)
    {
        return commentServiceImp.getCommentByUserId(id);
    }

    // 增加评论
    @RequestMapping("/AddComment")
    @ResponseBody
    public boolean addComment(Comment comment)
    {
        if (commentServiceImp.addComment(comment))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // 删除评论
    @RequestMapping("/DelComment")
    @ResponseBody
    public boolean delComment(int id)
    {
        if (commentServiceImp.deleteCommentById(id))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
