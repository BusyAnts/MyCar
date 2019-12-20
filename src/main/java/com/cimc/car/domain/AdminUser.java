package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class AdminUser {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private String salt;

    private String phone;

    private String email;

    /**
    * 0：未启用
            1：启用
    */
    private Byte status;

    private Integer createTime;

    /**
    * 0：普通管理员
            1：超级管理员
    */
    private Byte isSuper;

    private String consumer;

    private String remark;

    private String dept;
}