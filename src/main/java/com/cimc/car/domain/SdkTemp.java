package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class SdkTemp {
    private Integer id;

    private Integer activityId;

    private String sdkPath;

    private Long createTime;

    private String sdkName;
}