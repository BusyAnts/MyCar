package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class Activity {
    private Long id;

    private String title;

    private Integer categoryId;

    private String url;

    /**
    * 0：未开始
            1：进行中
            2：已结束
    */
    private Byte state;

    private String summary;

    private String description;

    private String link;

    private Long beginTime;

    private Long endTime;

    /**
    * 0：否
            1：是
    */
    private Byte channelTop;

    /**
    * 0：否
            1：是
    */
    private Byte homeTop;

    private Integer pvCount;

    private Integer uvCount;

    private Integer upCount;

    private Integer favCount;

    /**
    * 0：未发布
            1：已发布
            2：撤销发布
    */
    private Byte publishState;

    private Integer createUid;

    private Long createTime;

    private String author;

    private String unpublishUname;

    private Long unpublishTime;

    private String seoKeywords;

    private String sdkPath;

    private Integer likeCount;

    private Integer shareCount;

    private Integer viewCount;

    private String seoDescription;

    private String tags;

    private String coverPic;

    private String cars;

    private Integer sdkId;

    private String sdkTitle;

    private String dealer;
}