package com.cimc.car.mapper;

import com.cimc.car.domain.QrtzCalendars;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface QrtzCalendarsMapper {
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("calendarName") String calendarName);

    int insert(QrtzCalendars record);

    int insertSelective(QrtzCalendars record);

    QrtzCalendars selectByPrimaryKey(@Param("schedName") String schedName, @Param("calendarName") String calendarName);

    int updateByPrimaryKeySelective(QrtzCalendars record);

    int updateByPrimaryKey(QrtzCalendars record);
}