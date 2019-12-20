package com.cimc.car.mapper;

import com.cimc.car.domain.ActivityCategory;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityCategory record);

    int insertSelective(ActivityCategory record);

    ActivityCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityCategory record);

    int updateByPrimaryKey(ActivityCategory record);
}