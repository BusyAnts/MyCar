package com.cimc.car.mapper;

import com.cimc.car.domain.SysRole;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}