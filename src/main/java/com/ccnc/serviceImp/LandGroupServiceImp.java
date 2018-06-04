package com.ccnc.serviceImp;

import com.ccnc.bean.LandGroup;
import com.ccnc.dao.LandGroupDao;
import com.ccnc.service.LandGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandGroupServiceImp implements LandGroupService {
    @Autowired
    private LandGroupDao landGroupDao;

    @Override
    public List<LandGroup> getAllLandGroup() {
        return landGroupDao.selectAllLandGroup();
    }

    @Override
    public LandGroup getLandGroupById(int id) {
        return landGroupDao.selectLandGroupById(id);
    }
}
