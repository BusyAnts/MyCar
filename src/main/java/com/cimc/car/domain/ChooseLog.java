package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class ChooseLog {
    private Integer id;

    private String memberId;

    private Byte userCountry;

    private String userSpace;

    private String userPower;

    /**
    * 关联car_model表的ID字段
    */
    private String userComfort;

    private String userSafe;

    private String userCost;

    private String userMin;

    private String userMax;

    private String userPtime;

    private String userCar;

    private String chooseCar;

    private Long createTime;
}