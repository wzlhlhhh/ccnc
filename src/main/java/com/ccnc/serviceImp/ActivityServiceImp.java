package com.ccnc.serviceImp;

import com.ccnc.bean.Activity;
import com.ccnc.dao.ActivityDao;
import com.ccnc.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImp implements ActivityService {
    @Autowired
    private ActivityDao activityDao;

    @Override
    public List<Activity> getAllActivity() {
        return activityDao.selectAllActivity();
    }
}
