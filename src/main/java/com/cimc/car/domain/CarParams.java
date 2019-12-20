package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class CarParams {
    private Integer id;

    private String paramName;

    private Integer typeId;

    private Integer state;
}