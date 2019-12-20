package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class CarModelImage {
    private Integer id;

    private Integer modelId;

    private String year;

    private Integer modDefault;

    private String imgUrl;

    private Long createTime;

    private Long updateTime;

    /**
    * 仅当发布审核通过时才记录该时间
    */
    private Long syncTime;
}