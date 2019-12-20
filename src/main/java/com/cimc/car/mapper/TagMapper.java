package com.cimc.car.mapper;

import com.cimc.car.domain.Tag;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface TagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tag record);

    int insertSelective(Tag record);

    Tag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);
}