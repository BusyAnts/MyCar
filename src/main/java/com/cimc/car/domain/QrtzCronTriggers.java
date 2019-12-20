package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class QrtzCronTriggers {
    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private String cronExpression;

    private String timeZoneId;
}