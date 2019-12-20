package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class CarManufacturer {
    private Integer id;

    private String manufacturerName;

    private Integer makeId;

    private Long createTime;
}