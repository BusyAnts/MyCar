package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class Article {
    private Integer id;

    private String title;

    /**
    * 0：未启用
            1：已启用
    */
    private Integer categoryId;

    private String source;

    private String author;

    private String summary;

    private String coverPic;

    private String thumbPic;

    /**
    * 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
    */
    private String tags;

    private String content;

    private String previewUrl;

    private String qrcodeUrl;

    private Integer pvCount;

    private Integer uvCount;

    private Integer commentCount;

    private Integer likeCount;

    private Integer favCount;

    private Integer shareCount;

    private Byte channelTop;

    private Byte homeTop;

    /**
    * 如果是外部资源，那么该字段值为0
    */
    private Integer createUid;

    private String createUname;

    private Long createTime;

    private Integer submitUid;

    private Long submitTime;

    /**
    * 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
    */
    private Integer state;

    /**
    * 该字段用于内容列表按照审核状态降序排列：
            0：草稿；
            1：内容审核通过；
            2：等待内容审核；
            3：内容审核退回；
    */
    private Integer stateOrder;

    private Integer lastAuditUid;

    private String lastAuditUsername;

    /**
    * 仅当发布审核通过时才记录该时间
    */
    private Long lastAuditTime;

    private String lastRejectReason;

    /**
    * 0：未发布
            1：已发布
    */
    private Byte publishState;

    private Integer publishUid;

    private String publishUname;

    private Long publishTime;

    private Integer unpublishUid;

    private String unpublishUname;

    private Long unpublishTime;

    private String unpublishReason;

    private Integer lastUpdateUid;

    private String lastUpdateUname;

    private Long lastUpdateTime;

    private String seoKeywords;

    private String seoDescription;

    /**
    * 0：不允许
            1：允许
    */
    private Byte allowUp;

    /**
    * 0：不允许
            1：允许
    */
    private Byte allowFav;
}