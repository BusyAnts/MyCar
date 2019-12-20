package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class QrtzSchedulerState {
    private String schedName;

    private String instanceName;

    private Long lastCheckinTime;

    private Integer checkinInterval;
}