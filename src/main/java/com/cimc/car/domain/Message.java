package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class Message {
    private Long id;

    private String content;

    private Byte type;

    private String link;

    /**
    * 0：立即发送
            1：定时发送
    */
    private Integer isSchedule;

    private Long scheduleTime;

    private Long sendTime;
}