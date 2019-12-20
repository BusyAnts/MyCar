package com.cimc.car.mapper;

import com.cimc.car.domain.MessageSendlog;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface MessageSendlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageSendlog record);

    int insertSelective(MessageSendlog record);

    MessageSendlog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageSendlog record);

    int updateByPrimaryKey(MessageSendlog record);
}