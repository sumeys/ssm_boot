package com.sumey.o2o.dao;

import com.sumey.o2o.BaseTest;
import com.sumey.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * create by
 *
 * @author sumey
 * @date 2018/9/1 下午12:03
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList=areaDao.queryArea();
        assertEquals(2,areaList.size());
    }
}
