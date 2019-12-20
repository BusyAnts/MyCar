package com.cimc.car.mapper;

import com.cimc.car.domain.QrtzBlobTriggers;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface QrtzBlobTriggersMapper {
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzBlobTriggers record);

    int insertSelective(QrtzBlobTriggers record);

    QrtzBlobTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByPrimaryKeySelective(QrtzBlobTriggers record);

    int updateByPrimaryKey(QrtzBlobTriggers record);
}