package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class Tag {
    private Integer id;

    private String name;

    /**
    * 0：未删除
            1：已删除
    */
    private Byte isDeleted;

    private Long createTime;

    private Long lastUpdateTime;

    private Long clickCount;

    /**
    * 0：系统标签
            1：用户标签
    */
    private Byte type;
}