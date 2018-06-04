package com.ccnc.serviceImp;

import com.ccnc.bean.Comment;
import com.ccnc.dao.CommentDao;
import com.ccnc.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImp implements CommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public boolean addComment(Comment comment) {
        if(commentDao.insertComment(comment).getId() > 0)
        {
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public boolean deleteCommentById(int id) {
        commentDao.deleteCommentById(id);
        if(commentDao.selectCommentById(id) == null)
        {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public List<Comment> getAllComment() {
        return commentDao.selectAllComment();
    }

    @Override
    public List<Comment> getCommentByUserId(int id) {
        return commentDao.selectCommentByUserId(id);
    }
}
