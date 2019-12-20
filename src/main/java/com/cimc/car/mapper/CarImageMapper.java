package com.cimc.car.mapper;

import com.cimc.car.domain.CarImage;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarImage record);

    int insertSelective(CarImage record);

    CarImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarImage record);

    int updateByPrimaryKey(CarImage record);
}