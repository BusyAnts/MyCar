package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class AdminRole {
    private Integer id;

    private String name;

    /**
    * 0：未删除
            1：已删除
    */
    private Byte deleted;
}