package com.cimc.car.mapper;

import com.cimc.car.domain.ActivityPdata;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityPdataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityPdata record);

    int insertSelective(ActivityPdata record);

    ActivityPdata selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityPdata record);

    int updateByPrimaryKey(ActivityPdata record);
}