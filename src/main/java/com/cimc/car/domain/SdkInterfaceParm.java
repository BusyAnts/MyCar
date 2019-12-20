package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class SdkInterfaceParm {
    private Integer id;

    private Integer interfaceId;

    private String name;

    private String parmName;

    private Integer dataType;

    private String description;

    private Integer isRequired;

    private Integer isCustom;

    private Integer isLogin;

    private Integer activityKey;
}