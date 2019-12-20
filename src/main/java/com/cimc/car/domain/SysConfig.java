package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class SysConfig {
    private Long id;

    /**
    * key
    */
    private String key;

    /**
    * value
    */
    private String value;

    /**
    * 状态   0：隐藏   1：显示
    */
    private Byte status;

    /**
    * 备注
    */
    private String remark;
}