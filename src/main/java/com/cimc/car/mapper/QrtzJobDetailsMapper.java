package com.cimc.car.mapper;

import com.cimc.car.domain.QrtzJobDetails;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface QrtzJobDetailsMapper {
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int insert(QrtzJobDetails record);

    int insertSelective(QrtzJobDetails record);

    QrtzJobDetails selectByPrimaryKey(@Param("schedName") String schedName, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int updateByPrimaryKeySelective(QrtzJobDetails record);

    int updateByPrimaryKey(QrtzJobDetails record);
}