package com.cimc.car.domain;

import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class MessageSendlog {
    private Integer id;

    private Long messageId;

    private Long sendTime;

    private Long toMid;

    /**
    * 0：未接收
            1：已接收
    */
    private Integer received;

    private Integer receiveTime;

    /**
    * 0：未阅读
            1：已阅读
    */
    private Byte viewed;

    private Long viewTime;

    private Byte viewDetail;

    private Long viewDetailTime;
}