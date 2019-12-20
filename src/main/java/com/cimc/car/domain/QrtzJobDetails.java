package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class QrtzJobDetails {
    private String schedName;

    private String jobName;

    private String jobGroup;

    private String description;

    private String jobClassName;

    private String isDurable;

    private String isNonconcurrent;

    private String isUpdateData;

    private String requestsRecovery;

    private byte[] jobData;
}