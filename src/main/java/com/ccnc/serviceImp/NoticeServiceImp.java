package com.ccnc.serviceImp;

import com.ccnc.bean.Notice;
import com.ccnc.dao.NoticeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccnc.service.NoticeService;

import java.util.List;

/**
 * 公告的相关处理
 */
@Service
public class NoticeServiceImp implements NoticeService{
    @Autowired
    private NoticeDao noticeDao;

    @Override
    public Notice getCustomerService() {
        Notice notice = noticeDao.selectNoticeByType("客服");
        if(notice.getId() > 0)
            return notice;
        else
            return null;
    }

    @Override
    public Notice getBrandStory() {
        Notice notice = noticeDao.selectNoticeByType("品牌故事");
        if(notice.getId() > 0)
            return notice;
        else
            return null;
    }

    @Override
    public Notice getInvite() {
        Notice notice = noticeDao.selectNoticeByType("邀请");
        if(notice.getId() > 0)
            return notice;
        else
            return null;
    }

    @Override
    public List<Notice> getNormalNotice() {
        List<Notice> notice = noticeDao.selectNormalNotice();
        if(notice.size() > 0){
            System.out.println(notice);
            return notice;
        }
        else
            return null;
    }
}
