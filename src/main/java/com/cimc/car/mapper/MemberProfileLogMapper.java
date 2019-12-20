package com.cimc.car.mapper;

import com.cimc.car.domain.MemberProfileLog;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MemberProfileLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberProfileLog record);

    int insertSelective(MemberProfileLog record);

    MemberProfileLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberProfileLog record);

    int updateByPrimaryKey(MemberProfileLog record);
}