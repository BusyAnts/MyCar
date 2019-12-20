package com.cimc.car.mapper;

import com.cimc.car.domain.DictBrandPoint;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface DictBrandPointMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictBrandPoint record);

    int insertSelective(DictBrandPoint record);

    DictBrandPoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictBrandPoint record);

    int updateByPrimaryKey(DictBrandPoint record);
}