package com.cimc.car.mapper;

import com.cimc.car.domain.CarManufacturer;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarManufacturerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarManufacturer record);

    int insertSelective(CarManufacturer record);

    CarManufacturer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarManufacturer record);

    int updateByPrimaryKey(CarManufacturer record);
}