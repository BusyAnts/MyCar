package com.cimc.car.mapper;

import com.cimc.car.domain.AdminRole;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface AdminRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    AdminRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminRole record);

    int updateByPrimaryKey(AdminRole record);
}