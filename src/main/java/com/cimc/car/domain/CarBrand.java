package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class CarBrand {
    private Integer id;

    private String name;

    /**
    * 0：未启用
            1：已启用
    */
    private String otherName;

    private String englishName;

    private Integer countryId;

    private String logoUrl;

    /**
    * 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
    */
    private String logoMeaning;

    private String firstChar;

    private String spell;

    private String allSpell;

    private String nameSpell;

    private String nameAllSpell;

    private String introduction;

    private Byte saleStatus;

    private Byte isEnabled;

    /**
    * 如果是外部资源，那么该字段值为0
    */
    private Byte isRemoved;

    private Long createTime;

    private Long updateTime;

    /**
    * 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
    */
    private Long doTime;

    /**
    * 仅当发布审核通过时才记录该时间
    */
    private Integer syncTime;
}