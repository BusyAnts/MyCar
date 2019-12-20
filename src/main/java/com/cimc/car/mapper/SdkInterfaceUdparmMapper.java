package com.cimc.car.mapper;

import com.cimc.car.domain.SdkInterfaceUdparm;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SdkInterfaceUdparmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SdkInterfaceUdparm record);

    int insertSelective(SdkInterfaceUdparm record);

    SdkInterfaceUdparm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SdkInterfaceUdparm record);

    int updateByPrimaryKey(SdkInterfaceUdparm record);
}