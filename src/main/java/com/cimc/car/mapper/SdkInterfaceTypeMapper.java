package com.cimc.car.mapper;

import com.cimc.car.domain.SdkInterfaceType;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SdkInterfaceTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SdkInterfaceType record);

    int insertSelective(SdkInterfaceType record);

    SdkInterfaceType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SdkInterfaceType record);

    int updateByPrimaryKey(SdkInterfaceType record);
}