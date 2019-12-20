package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class Product {
    private Integer id;

    private String name;

    private String description;

    private String service;

    private Long createTime;

    private Long updateTime;
}