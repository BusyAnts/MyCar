package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class AdminMenuAuth {
    private Short id;

    /**
    * 如果该菜单为一级菜单，那么parent_guid为NULL
    */
    private String controller;

    private String action;

    private String name;

    private String classname;

    /**
    * 0：禁用
            1：启用
    */
    private Byte status;

    private Integer sort;

    /**
    * 1：模块
            2：菜单
            3：权限
    */
    private Byte type;

    private Short parentId;
}