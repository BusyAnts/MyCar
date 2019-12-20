package com.cimc.car.mapper;

import com.cimc.car.domain.ActivityCar;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityCarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityCar record);

    int insertSelective(ActivityCar record);

    ActivityCar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityCar record);

    int updateByPrimaryKey(ActivityCar record);
}