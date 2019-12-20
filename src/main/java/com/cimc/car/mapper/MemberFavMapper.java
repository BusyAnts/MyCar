package com.cimc.car.mapper;

import com.cimc.car.domain.MemberFav;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MemberFavMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberFav record);

    int insertSelective(MemberFav record);

    MemberFav selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberFav record);

    int updateByPrimaryKey(MemberFav record);
}