package com.sumey.o2o.entity;

import java.util.Date;

/**
 * create by
 *
 * @author sumey
 * @date 2018/8/31 下午6:07
 */

//区域信息
public class Area {

    //id
    private Integer areaId;

    //名称
    private String areaName;

    //优先级
    private Integer priority;

    //创建时间
    private Date createTime;

    //更新时间
    private Date lastEditTime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }


}
