package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class Member {
    private Long id;

    private String username;

    private String password;

    private Byte source;
}