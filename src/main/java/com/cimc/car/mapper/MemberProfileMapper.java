package com.cimc.car.mapper;

import com.cimc.car.domain.MemberProfile;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MemberProfileMapper {
    int deleteByPrimaryKey(Long memberId);

    int insert(MemberProfile record);

    int insertSelective(MemberProfile record);

    MemberProfile selectByPrimaryKey(Long memberId);

    int updateByPrimaryKeySelective(MemberProfile record);

    int updateByPrimaryKey(MemberProfile record);
}