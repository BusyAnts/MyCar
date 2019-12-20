package com.cimc.car.mapper;

import com.cimc.car.domain.SysUserRole;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}