package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class MemberCar {
    private Long id;

    private Long memberId;

    private Integer brandId;

    private Integer makeId;

    private Integer modelId;

    private Integer carId;

    private Integer buyYear;

    private Integer currentMileage;

    private String remark;

    /**
    * 1：已有座驾
            2：期望座驾
    */
    private Byte type;

    private Long createTime;

    private Long lastUpdateTime;
}