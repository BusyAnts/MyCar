package com.cimc.car.domain;

import java.util.Date;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class ScheduleJobLog {
    /**
    * 任务日志id
    */
    private Integer logId;

    /**
    * 任务id
    */
    private Long jobId;

    /**
    * spring bean名称
    */
    private String beanName;

    /**
    * 方法名
    */
    private String methodName;

    /**
    * 参数
    */
    private String params;

    /**
    * 任务状态    0：成功    1：失败
    */
    private Byte status;

    /**
    * 失败信息
    */
    private String error;

    /**
    * 耗时(单位：毫秒)
    */
    private Integer times;

    /**
    * 创建时间
    */
    private Date createTime;
}