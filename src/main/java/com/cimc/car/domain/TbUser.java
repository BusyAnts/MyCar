package com.cimc.car.domain;

import java.util.Date;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class TbUser {
    private Integer userId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 手机号
    */
    private String mobile;

    /**
    * 密码
    */
    private String password;

    /**
    * 创建时间
    */
    private Date createTime;
}