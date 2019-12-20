package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class DictModel {
    private Integer id;

    private String code;

    private String country;

    private String modelName;

    /**
    * 关联car_model表的ID字段
    */
    private Integer modelId;

    private Integer msrpMin;

    private Byte space;

    private Byte power;

    private Byte comfort;

    private Byte cost;

    private Byte safety;
}