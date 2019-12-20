package com.cimc.car.mapper;

import com.cimc.car.domain.QrtzCronTriggers;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface QrtzCronTriggersMapper {
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzCronTriggers record);

    int insertSelective(QrtzCronTriggers record);

    QrtzCronTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByPrimaryKeySelective(QrtzCronTriggers record);

    int updateByPrimaryKey(QrtzCronTriggers record);
}