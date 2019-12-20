package com.cimc.car.mapper;

import com.cimc.car.domain.CarMake;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarMakeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarMake record);

    int insertSelective(CarMake record);

    CarMake selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarMake record);

    int updateByPrimaryKey(CarMake record);
}