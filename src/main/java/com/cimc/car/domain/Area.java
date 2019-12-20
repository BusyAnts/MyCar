package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class Area {
    private Integer id;

    private String name;

    /**
    * 0：未删除
            1：已删除
    */
    private Integer pid;

    private String areacode;
}