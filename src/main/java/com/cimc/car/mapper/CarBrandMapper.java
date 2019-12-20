package com.cimc.car.mapper;

import com.cimc.car.domain.CarBrand;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarBrand record);

    int insertSelective(CarBrand record);

    CarBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarBrand record);

    int updateByPrimaryKey(CarBrand record);
}