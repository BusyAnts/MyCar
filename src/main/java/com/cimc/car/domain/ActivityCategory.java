package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class ActivityCategory {
    private Long id;

    private String name;

    /**
    * 0：未删除
            1：已删除
    */
    private Byte isDeleted;

    private Integer createTime;

    private Long lastUpdateTime;

    private String useCount;
}