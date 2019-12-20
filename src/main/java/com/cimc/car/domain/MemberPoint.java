package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class MemberPoint {
    private Integer id;

    private Integer memberId;

    private Integer point;

    private Integer type;

    private String description;

    private String remark;

    private Long createTime;
}