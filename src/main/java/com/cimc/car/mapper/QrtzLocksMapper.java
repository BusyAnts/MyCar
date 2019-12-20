package com.cimc.car.mapper;

import com.cimc.car.domain.QrtzLocks;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface QrtzLocksMapper {
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("lockName") String lockName);

    int insert(QrtzLocks record);

    int insertSelective(QrtzLocks record);
}