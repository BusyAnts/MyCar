package com.cimc.car.mapper;

import com.cimc.car.domain.ScheduleJob;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ScheduleJobMapper {
    int deleteByPrimaryKey(Long jobId);

    int insert(ScheduleJob record);

    int insertSelective(ScheduleJob record);

    ScheduleJob selectByPrimaryKey(Long jobId);

    int updateByPrimaryKeySelective(ScheduleJob record);

    int updateByPrimaryKey(ScheduleJob record);
}