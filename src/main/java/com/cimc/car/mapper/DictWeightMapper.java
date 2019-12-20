package com.cimc.car.mapper;

import com.cimc.car.domain.DictWeight;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface DictWeightMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictWeight record);

    int insertSelective(DictWeight record);

    DictWeight selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictWeight record);

    int updateByPrimaryKey(DictWeight record);
}