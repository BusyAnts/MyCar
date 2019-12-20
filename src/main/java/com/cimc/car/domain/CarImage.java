package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class CarImage {
    private Integer id;

    private Integer carId;

    private String imgTitle;

    private Integer imgType;

    private String imgUrl;

    private Long createTime;

    private Long updateTime;

    /**
    * 仅当发布审核通过时才记录该时间
    */
    private Integer syncTime;
}