package com.cimc.car.mapper;

import com.cimc.car.domain.TbToken;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface TbTokenMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(TbToken record);

    int insertSelective(TbToken record);

    TbToken selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(TbToken record);

    int updateByPrimaryKey(TbToken record);
}