package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class AdminUserRole {
    private Integer id;

    /**
    * 如果该菜单为一级菜单，那么parent_guid为NULL
    */
    private Integer userId;

    private Integer roleId;
}