package com.cimc.car.mapper;

import com.cimc.car.domain.DictModel;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface DictModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictModel record);

    int insertSelective(DictModel record);

    DictModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictModel record);

    int updateByPrimaryKey(DictModel record);
}