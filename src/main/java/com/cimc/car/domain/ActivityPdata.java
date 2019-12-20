package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class ActivityPdata {
    private Long id;

    private Long activityId;

    private Long memberId;

    private String name;

    private String mobile;

    private Integer province;

    private String provinceName;

    private Integer city;

    private String cityName;

    private String remark;

    private String extendData;

    private Long createTime;

    private Integer brandId;

    private String brandName;

    private Integer makeId;

    private String makeName;

    private Integer modelId;

    private String modelName;

    private Integer carId;

    private String carName;

    private Integer dealerId;

    private Integer channelId;

    /**
    * 0：待处理
            1：跟进中
            2：战败
            3：无效
            4：成交
    */
    private Byte state;

    private Integer stateUpdateUid;

    private Long stateUpdateTime;

    private String visitorGuid;

    private String visitIp;

    private String dealerName;
}