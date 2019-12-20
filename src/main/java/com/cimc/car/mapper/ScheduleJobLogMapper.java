package com.cimc.car.mapper;

import com.cimc.car.domain.ScheduleJobLog;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ScheduleJobLogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(ScheduleJobLog record);

    int insertSelective(ScheduleJobLog record);

    ScheduleJobLog selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(ScheduleJobLog record);

    int updateByPrimaryKey(ScheduleJobLog record);
}