package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class MemberLoginLog {
    private Long id;

    private Long memberId;

    private Long loginTime;

    /**
    * 0：不是首次登录
            1：是首次登录
    */
    private Byte isFirst;

    private String loginIp;
}