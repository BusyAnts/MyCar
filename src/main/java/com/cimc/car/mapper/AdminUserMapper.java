package com.cimc.car.mapper;

import com.cimc.car.domain.AdminUser;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface AdminUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    AdminUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}