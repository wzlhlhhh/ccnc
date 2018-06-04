package com.ccnc.serviceImp;

import com.ccnc.bean.Land;
import com.ccnc.dao.LandDao;
import com.ccnc.service.LandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 土地操作的实现类
 */
@Service
public class LandServiceImp implements LandService {
    @Autowired
    private LandDao landDao;

    @Override
    public List<Land> getAllLand() {
        return landDao.selectAllLand();
    }

    @Override
    public Land getLandById(int id) {
        return landDao.selectLandById(id);
    }
}
