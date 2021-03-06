package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class ActivityKey {
    private Integer id;

    private Integer activityId;

    /**
    * 对应car_model表的id字段
    */
    private Long createTime;

    private String actKey;
}