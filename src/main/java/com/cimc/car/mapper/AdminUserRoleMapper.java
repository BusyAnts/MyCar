package com.cimc.car.mapper;

import com.cimc.car.domain.AdminUserRole;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface AdminUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminUserRole record);

    int insertSelective(AdminUserRole record);

    AdminUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminUserRole record);

    int updateByPrimaryKey(AdminUserRole record);
}