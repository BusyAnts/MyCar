package com.cimc.car.mapper;

import com.cimc.car.domain.Member;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}