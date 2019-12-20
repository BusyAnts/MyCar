package com.cimc.car.mapper;

import com.cimc.car.domain.DictAnswer;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface DictAnswerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictAnswer record);

    int insertSelective(DictAnswer record);

    DictAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictAnswer record);

    int updateByPrimaryKey(DictAnswer record);
}