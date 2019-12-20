package com.cimc.car.mapper;

import com.cimc.car.domain.SysMenu;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SysMenuMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}