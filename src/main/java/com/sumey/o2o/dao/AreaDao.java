package com.sumey.o2o.dao;

import com.sumey.o2o.entity.Area;

import java.util.List;

/**
 * create by
 *
 * @author sumey
 * @date 2018/9/1 上午11:31
 */
public interface AreaDao {

    //返回区域列表
    List<Area> queryArea();
}
