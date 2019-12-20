package com.cimc.car.mapper;

import com.cimc.car.domain.SdkInterfaceParm;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SdkInterfaceParmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SdkInterfaceParm record);

    int insertSelective(SdkInterfaceParm record);

    SdkInterfaceParm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SdkInterfaceParm record);

    int updateByPrimaryKey(SdkInterfaceParm record);
}