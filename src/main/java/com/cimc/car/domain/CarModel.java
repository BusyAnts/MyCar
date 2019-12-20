package com.cimc.car.domain;

import java.math.BigDecimal;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class CarModel {
    private Integer id;

    private Integer brandId;

    private String brandName;

    private Integer makeId;

    private String makeName;

    private String name;

    private String displayName;

    /**
    * 0：未启用
            1：已启用
    */
    private String otherName;

    private String englishName;

    private Integer countryClass;

    private String countryClassName;

    /**
    * 类似：SUV、MPV等
    */
    private Integer bodyForm;

    private String bodyFormName;

    private BigDecimal priceLow;

    private BigDecimal priceHigh;

    /**
    * 0：其它
            1：微型车
            2：小型车
            3：紧凑型车
            4：中型车
            5：中大型车
            6：豪华车
            7：SUV
            8：MPV
            9：跑车
            10：概念车
            11：面包车
            12：皮卡
            13：轻客
            14：客车
            15：卡车
            16：轻卡
            17：重卡
    */
    private Integer level;

    private String levelName;

    /**
    * 0：其它
            1：小型suv
            2：紧凑型suv
            3：中型suv
            4：中大型suv
            5：大型suv
            6：微客
            7：小客
            8：中客
            9：大客
            10：微卡
            11：轻卡
            12：中卡
            13：重卡
    */
    private Integer levelSecond;

    private String levelSecondName;

    private Byte saleStatus;

    private String allSpell;

    private Integer countryId;

    private String countryName;

    private Long createTime;

    private Long updateTime;

    /**
    * 仅当发布审核通过时才记录该时间
    */
    private Long syncTime;
}