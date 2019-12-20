package com.cimc.car.mapper;

import com.cimc.car.domain.QrtzTriggers;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface QrtzTriggersMapper {
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzTriggers record);

    int insertSelective(QrtzTriggers record);

    QrtzTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByPrimaryKeySelective(QrtzTriggers record);

    int updateByPrimaryKey(QrtzTriggers record);
}