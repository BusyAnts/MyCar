package com.cimc.car.mapper;

import com.cimc.car.domain.Activity;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}