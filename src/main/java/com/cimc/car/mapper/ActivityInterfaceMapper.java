package com.cimc.car.mapper;

import com.cimc.car.domain.ActivityInterface;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityInterfaceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityInterface record);

    int insertSelective(ActivityInterface record);

    ActivityInterface selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityInterface record);

    int updateByPrimaryKey(ActivityInterface record);
}