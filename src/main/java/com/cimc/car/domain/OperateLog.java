package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class OperateLog {
    private Long id;

    private Integer operateTime;

    private Integer operateUid;

    /**
    * 0：未接收
            1：已接收
    */
    private String tableName;

    private String tableDisname;

    /**
    * 0：未阅读
            1：已阅读
    */
    private Long dataId;

    private String operateDesc;
}