package com.cimc.car.mapper;

import com.cimc.car.domain.SdkTemp;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SdkTempMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SdkTemp record);

    int insertSelective(SdkTemp record);

    SdkTemp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SdkTemp record);

    int updateByPrimaryKey(SdkTemp record);
}