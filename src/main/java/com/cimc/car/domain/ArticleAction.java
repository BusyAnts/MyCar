package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class ArticleAction {
    private Long id;

    private Long articleId;

    /**
    * 0：未启用
            1：已启用
    */
    private Integer operatorUid;

    /**
    * 0：非默认摘要
            1：默认摘要
    */
    private String operatorUsername;

    private Long createTime;

    private String content;

    /**
    * 1：新增
            2：编辑
            3：审核
            4：删除
    */
    private Byte operateType;
}