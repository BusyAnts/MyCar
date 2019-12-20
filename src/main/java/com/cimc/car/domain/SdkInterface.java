package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class SdkInterface {
    private Integer id;

    private Integer typeId;

    private String name;

    private String interDesc;

    private String url;

    private String success;

    private String error;

    private String requestType;
}