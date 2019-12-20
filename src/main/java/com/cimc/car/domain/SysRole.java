package com.cimc.car.domain;

import java.util.Date;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class SysRole {
    private Integer roleId;

    /**
    * 角色名称
    */
    private String roleName;

    /**
    * 备注
    */
    private String remark;

    /**
    * 创建者ID
    */
    private Long createUserId;

    /**
    * 创建时间
    */
    private Date createTime;
}