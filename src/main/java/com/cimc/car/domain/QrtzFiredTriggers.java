package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class QrtzFiredTriggers {
    private String schedName;

    private String entryId;

    private String triggerName;

    private String triggerGroup;

    private String instanceName;

    private Long firedTime;

    private Long schedTime;

    private Integer priority;

    private String state;

    private String jobName;

    private String jobGroup;

    private String isNonconcurrent;

    private String requestsRecovery;
}