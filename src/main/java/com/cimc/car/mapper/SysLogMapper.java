package com.cimc.car.mapper;

import com.cimc.car.domain.SysLog;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}