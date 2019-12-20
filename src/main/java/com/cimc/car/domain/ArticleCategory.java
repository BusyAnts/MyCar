package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class ArticleCategory {
    private Integer id;

    /**
    * 0：未启用
            1：已启用
    */
    private String name;

    /**
    * 0：未删除
            1：已删除
    */
    private Byte isDeleted;

    private Integer sortNum;

    private Long createTime;

    private Long lastUpdateTime;
}