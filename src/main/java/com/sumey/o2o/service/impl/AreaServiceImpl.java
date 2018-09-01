package com.sumey.o2o.service.impl;

import com.sumey.o2o.dao.AreaDao;
import com.sumey.o2o.entity.Area;
import com.sumey.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by
 *
 * @author sumey
 * @date 2018/9/1 下午5:26
 */

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
