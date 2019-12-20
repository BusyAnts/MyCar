package com.cimc.car.mapper;

import com.cimc.car.domain.Area;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface AreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}