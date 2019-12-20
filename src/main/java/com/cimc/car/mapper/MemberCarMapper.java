package com.cimc.car.mapper;

import com.cimc.car.domain.MemberCar;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MemberCarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberCar record);

    int insertSelective(MemberCar record);

    MemberCar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberCar record);

    int updateByPrimaryKey(MemberCar record);
}