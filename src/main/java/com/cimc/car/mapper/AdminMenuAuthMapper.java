package com.cimc.car.mapper;

import com.cimc.car.domain.AdminMenuAuth;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface AdminMenuAuthMapper {
    int deleteByPrimaryKey(Short id);

    int insert(AdminMenuAuth record);

    int insertSelective(AdminMenuAuth record);

    AdminMenuAuth selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(AdminMenuAuth record);

    int updateByPrimaryKey(AdminMenuAuth record);
}