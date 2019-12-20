package com.cimc.car.mapper;

import com.cimc.car.domain.ChooseLog;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ChooseLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChooseLog record);

    int insertSelective(ChooseLog record);

    ChooseLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChooseLog record);

    int updateByPrimaryKey(ChooseLog record);
}