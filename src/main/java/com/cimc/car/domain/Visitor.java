package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class Visitor {
    private Long id;

    private String visitorGuid;

    private Long firstVisitTime;

    /**
    * 0：不是首次登录
            1：是首次登录
    */
    private String entryUrl;

    private String visitorIp;

    private String visitorDevice;

    private String visitorChannel;
}