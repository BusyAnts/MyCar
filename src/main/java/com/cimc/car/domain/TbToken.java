package com.cimc.car.domain;

import java.util.Date;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class TbToken {
    private Long userId;

    /**
    * token
    */
    private String token;

    /**
    * 过期时间
    */
    private Date expireTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}