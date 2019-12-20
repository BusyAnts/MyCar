package com.cimc.car.mapper;

import com.cimc.car.domain.SdkInterfaceInfo;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SdkInterfaceInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SdkInterfaceInfo record);

    int insertSelective(SdkInterfaceInfo record);

    SdkInterfaceInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SdkInterfaceInfo record);

    int updateByPrimaryKey(SdkInterfaceInfo record);
}