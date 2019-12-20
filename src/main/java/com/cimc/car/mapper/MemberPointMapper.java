package com.cimc.car.mapper;

import com.cimc.car.domain.MemberPoint;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MemberPointMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberPoint record);

    int insertSelective(MemberPoint record);

    MemberPoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberPoint record);

    int updateByPrimaryKey(MemberPoint record);
}