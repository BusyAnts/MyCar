package com.cimc.car.mapper;

import com.cimc.car.domain.QrtzSchedulerState;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface QrtzSchedulerStateMapper {
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("instanceName") String instanceName);

    int insert(QrtzSchedulerState record);

    int insertSelective(QrtzSchedulerState record);

    QrtzSchedulerState selectByPrimaryKey(@Param("schedName") String schedName, @Param("instanceName") String instanceName);

    int updateByPrimaryKeySelective(QrtzSchedulerState record);

    int updateByPrimaryKey(QrtzSchedulerState record);
}