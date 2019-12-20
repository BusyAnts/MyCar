package com.cimc.car.mapper;

import com.cimc.car.domain.CarSelectList;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarSelectListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarSelectList record);

    int insertSelective(CarSelectList record);

    CarSelectList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarSelectList record);

    int updateByPrimaryKey(CarSelectList record);
}