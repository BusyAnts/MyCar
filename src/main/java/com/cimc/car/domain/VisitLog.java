package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class VisitLog {
    private Long id;

    private Long visitorId;

    private Long memberId;

    private String visitUrl;

    /**
    * 0：不是首次登录
            1：是首次登录
    */
    private String visitIp;

    private String visitDevice;

    private String visitSource;

    private Long enterTime;

    private Long exitTime;

    private Long stay;
}