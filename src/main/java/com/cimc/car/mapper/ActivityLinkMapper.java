package com.cimc.car.mapper;

import com.cimc.car.domain.ActivityLink;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityLinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityLink record);

    int insertSelective(ActivityLink record);

    ActivityLink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityLink record);

    int updateByPrimaryKey(ActivityLink record);
}