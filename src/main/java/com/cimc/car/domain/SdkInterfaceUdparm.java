package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class SdkInterfaceUdparm {
    private Integer id;

    private Integer activityId;

    private Integer interfaceId;

    private String name;

    private String parmName;

    private Integer dataType;

    private String description;

    /**
    * 关联car_product表的ID
    */
    private Integer productId;
}