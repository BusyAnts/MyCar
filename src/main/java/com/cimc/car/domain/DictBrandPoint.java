package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class DictBrandPoint {
    private Integer id;

    /**
    * 关联car_brand表的ID字段
    */
    private Integer brandId;

    private String name;

    private Byte point;
}