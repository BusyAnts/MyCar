package com.cimc.car.mapper;

import com.cimc.car.domain.ActivityTag;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityTag record);

    int insertSelective(ActivityTag record);

    ActivityTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityTag record);

    int updateByPrimaryKey(ActivityTag record);
}