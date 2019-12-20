package com.cimc.car.mapper;

import com.cimc.car.domain.CarModelImage;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarModelImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarModelImage record);

    int insertSelective(CarModelImage record);

    CarModelImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarModelImage record);

    int updateByPrimaryKey(CarModelImage record);
}