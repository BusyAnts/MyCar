package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class QrtzSimpleTriggers {
    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private Long repeatCount;

    private Long repeatInterval;

    private Long timesTriggered;
}