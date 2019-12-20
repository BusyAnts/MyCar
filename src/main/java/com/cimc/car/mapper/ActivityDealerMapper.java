package com.cimc.car.mapper;

import com.cimc.car.domain.ActivityDealer;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ActivityDealerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDealer record);

    int insertSelective(ActivityDealer record);

    ActivityDealer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityDealer record);

    int updateByPrimaryKey(ActivityDealer record);
}