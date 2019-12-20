package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class CarMake {
    private Integer id;

    private Integer brandId;

    private String brandName;

    private String name;

    /**
    * 0：未启用
            1：已启用
    */
    private String otherName;

    private String englishName;

    private Integer manufacturerId;

    private Integer countryId;

    private String phone;

    private String website;

    private String logoUrl;

    private String spell;

    private String introduction;

    private Byte isEnabled;

    /**
    * 如果是外部资源，那么该字段值为0
    */
    private Byte isRemoved;

    private Long createTime;

    private Long updateTime;

    /**
    * 仅当发布审核通过时才记录该时间
    */
    private Long syncTime;
}