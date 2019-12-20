package com.cimc.car.mapper;

import com.cimc.car.domain.QrtzPausedTriggerGrps;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface QrtzPausedTriggerGrpsMapper {
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzPausedTriggerGrps record);

    int insertSelective(QrtzPausedTriggerGrps record);
}