package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class MemberToken {
    private Long memberId;

    private String token;

    private Long createTime;

    private Long duration;

    private Long expiredTime;
}