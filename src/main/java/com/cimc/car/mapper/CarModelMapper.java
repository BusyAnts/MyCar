package com.cimc.car.mapper;

import com.cimc.car.domain.CarModel;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarModel record);

    int insertSelective(CarModel record);

    CarModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarModel record);

    int updateByPrimaryKey(CarModel record);
}