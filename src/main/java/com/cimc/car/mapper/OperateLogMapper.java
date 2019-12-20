package com.cimc.car.mapper;

import com.cimc.car.domain.OperateLog;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface OperateLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OperateLog record);

    int insertSelective(OperateLog record);

    OperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OperateLog record);

    int updateByPrimaryKey(OperateLog record);
}