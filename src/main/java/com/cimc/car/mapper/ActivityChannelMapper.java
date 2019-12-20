package com.cimc.car.mapper;

import com.cimc.car.domain.ActivityChannel;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityChannelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityChannel record);

    int insertSelective(ActivityChannel record);

    ActivityChannel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityChannel record);

    int updateByPrimaryKey(ActivityChannel record);
}