package com.cimc.car.mapper;

import com.cimc.car.domain.QrtzFiredTriggers;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface QrtzFiredTriggersMapper {
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("entryId") String entryId);

    int insert(QrtzFiredTriggers record);

    int insertSelective(QrtzFiredTriggers record);

    QrtzFiredTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("entryId") String entryId);

    int updateByPrimaryKeySelective(QrtzFiredTriggers record);

    int updateByPrimaryKey(QrtzFiredTriggers record);
}