package com.sumey.o2o.service;

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
 * @date 2018/9/1 下午5:30
 */
public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("西苑", areaList.get(0).getAreaName());
    }
}
