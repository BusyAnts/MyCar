package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class MemberFav {
    private Long id;

    private Long memberId;

    /**
    * 1：资讯
            2：活动
            3：车系
    */
    private Byte favType;

    private Long contentId;

    private Long favTime;

    private String favIp;
}