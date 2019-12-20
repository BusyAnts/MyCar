package com.cimc.car.mapper;

import com.cimc.car.domain.VisitLog;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface VisitLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VisitLog record);

    int insertSelective(VisitLog record);

    VisitLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VisitLog record);

    int updateByPrimaryKey(VisitLog record);
}