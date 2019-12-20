package com.cimc.car.domain;

import java.util.Date;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class ScheduleJob {
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
    * cron表达式
    */
    private String cronExpression;

    /**
    * 任务状态
    */
    private Byte status;

    /**
    * 备注
    */
    private String remark;

    /**
    * 创建时间
    */
    private Date createTime;
}