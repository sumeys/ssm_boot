package com.sumey.o2o.entity;

import java.util.Date;

/**
 * create by
 *
 * @author sumey
 * @date 2018/8/31 下午6:58
 */
public class PersonInfo {

    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private String gender;
    private Integer enableStatus;

    //1.顾客  2，店家  3，超级管理员
    private Integer userType;
    private Date createTime;
    private Date lastEditTime;


}
