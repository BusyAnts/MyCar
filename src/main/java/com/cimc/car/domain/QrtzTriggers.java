package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class QrtzTriggers {
    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private String jobName;

    private String jobGroup;

    private String description;

    private Long nextFireTime;

    private Long prevFireTime;

    private Integer priority;

    private String triggerState;

    private String triggerType;

    private Long startTime;

    private Long endTime;

    private String calendarName;

    private Short misfireInstr;

    private byte[] jobData;
}