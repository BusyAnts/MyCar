package com.cimc.car.mapper;

import com.cimc.car.domain.MemberTag;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MemberTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberTag record);

    int insertSelective(MemberTag record);

    MemberTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberTag record);

    int updateByPrimaryKey(MemberTag record);
}