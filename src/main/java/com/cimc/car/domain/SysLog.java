package com.cimc.car.domain;

import java.util.Date;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class SysLog {
    private Long id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 用户操作
    */
    private String operation;

    /**
    * 请求方法
    */
    private String method;

    /**
    * 请求参数
    */
    private String params;

    /**
    * IP地址
    */
    private String ip;

    /**
    * 创建时间
    */
    private Date createDate;
}