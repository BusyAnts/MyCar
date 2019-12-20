package com.cimc.car.mapper;

import com.cimc.car.domain.SdkInterface;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SdkInterfaceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SdkInterface record);

    int insertSelective(SdkInterface record);

    SdkInterface selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SdkInterface record);

    int updateByPrimaryKey(SdkInterface record);
}