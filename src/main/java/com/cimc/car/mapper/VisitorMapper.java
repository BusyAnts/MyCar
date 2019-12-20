package com.cimc.car.mapper;

import com.cimc.car.domain.Visitor;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface VisitorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    Visitor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);
}