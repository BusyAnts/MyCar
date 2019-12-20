package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class MemberProfileLog {
    private Integer id;

    private Integer memberId;

    private String nickname;

    private String name;

    /**
    * 0：全部
            1：男
            2：女
    */
    private Byte gender;

    private Integer level;

    private String avatarUrl;

    private String mobileCode;

    private String mobile;

    private String email;

    private String description;

    private Integer country;

    private Integer province;

    private Integer city;

    private Integer district;

    private String address;

    private Long registerTime;

    private Long updateTime;
}