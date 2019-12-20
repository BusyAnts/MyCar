package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class MemberTag {
    private Long id;

    private Long memberId;

    private Integer tagId;

    private Integer createTime;
}