package com.cimc.car.mapper;

import com.cimc.car.domain.MemberLoginLog;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MemberLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberLoginLog record);

    int insertSelective(MemberLoginLog record);

    MemberLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberLoginLog record);

    int updateByPrimaryKey(MemberLoginLog record);
}