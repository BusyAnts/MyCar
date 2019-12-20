package com.cimc.car.mapper;

import com.cimc.car.domain.Message;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}