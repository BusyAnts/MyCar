package com.cimc.car.domain;

import java.math.BigDecimal;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class CarSelectList {
    private Integer id;

    private String type;

    private String country;

    private String carType;

    private Boolean carTypeBak;

    /**
    * 关联car_model表的ID字段
    */
    private BigDecimal msrpMin;

    private BigDecimal msrpMax;

    /**
    * 所属车系 ：自主1 日2 韩3 德4 美5 欧6
    */
    private Boolean countryType;

    private Boolean countryStd;

    private BigDecimal spaceStd;

    private BigDecimal powerStd;

    private BigDecimal comfortStd;

    private BigDecimal costStd;

    private BigDecimal safeStd;

    private Integer carId;
}