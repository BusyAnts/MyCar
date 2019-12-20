package com.cimc.car.mapper;

import com.cimc.car.domain.CarParamType;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface CarParamTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarParamType record);

    int insertSelective(CarParamType record);

    CarParamType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarParamType record);

    int updateByPrimaryKey(CarParamType record);
}