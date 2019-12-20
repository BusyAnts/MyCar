package com.cimc.car.mapper;

import com.cimc.car.domain.AdminRoleMenu;
import org.apache.ibatis.annotations.Param;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface AdminRoleMenuMapper {
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("menuId") Integer menuId);

    int insert(AdminRoleMenu record);

    int insertSelective(AdminRoleMenu record);
}