package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class SysUserRole {
    private Integer id;

    /**
    * 用户ID
    */
    private Integer userId;

    /**
    * 角色ID
    */
    private Long roleId;
}