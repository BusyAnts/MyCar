package com.cimc.car.mapper;

import com.cimc.car.domain.SysConfig;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SysConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}