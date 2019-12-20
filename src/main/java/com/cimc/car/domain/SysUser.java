package com.cimc.car.domain;

import java.util.Date;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class SysUser {
    private Long userId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 手机号
    */
    private String mobile;

    /**
    * 状态  0：禁用   1：正常
    */
    private Byte status;

    /**
    * 创建者ID
    */
    private Long createUserId;

    /**
    * 创建时间
    */
    private Date createTime;
}