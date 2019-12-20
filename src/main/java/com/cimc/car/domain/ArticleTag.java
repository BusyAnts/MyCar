package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class ArticleTag {
    private Long id;

    /**
    * 0：未启用
            1：已启用
    */
    private Integer tagId;

    private Long articleId;
}