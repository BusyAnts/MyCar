package com.cimc.car.mapper;

import com.cimc.car.domain.TbUser;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface TbUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}