package com.cimc.car.mapper;

import com.cimc.car.domain.Car;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}