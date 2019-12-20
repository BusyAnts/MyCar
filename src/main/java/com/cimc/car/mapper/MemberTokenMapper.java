package com.cimc.car.mapper;

import com.cimc.car.domain.MemberToken;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MemberTokenMapper {
    int deleteByPrimaryKey(Long memberId);

    int insert(MemberToken record);

    int insertSelective(MemberToken record);

    MemberToken selectByPrimaryKey(Long memberId);

    int updateByPrimaryKeySelective(MemberToken record);

    int updateByPrimaryKey(MemberToken record);
}