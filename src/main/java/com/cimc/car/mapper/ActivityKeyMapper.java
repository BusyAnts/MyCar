package com.cimc.car.mapper;

import com.cimc.car.domain.ActivityKey;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityKeyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityKey record);

    int insertSelective(ActivityKey record);

    ActivityKey selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityKey record);

    int updateByPrimaryKey(ActivityKey record);
}