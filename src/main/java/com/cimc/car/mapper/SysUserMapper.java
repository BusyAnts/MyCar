package com.cimc.car.mapper;
import com.cimc.car.domain.SysUser;

import java.util.List;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface SysUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> findAll();

}