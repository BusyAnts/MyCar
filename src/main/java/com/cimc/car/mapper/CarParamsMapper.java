package com.cimc.car.mapper;

import com.cimc.car.domain.CarParams;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarParamsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarParams record);

    int insertSelective(CarParams record);

    CarParams selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarParams record);

    int updateByPrimaryKey(CarParams record);
}