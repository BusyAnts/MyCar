package com.cimc.car.service.impl;

import com.cimc.car.domain.SysUser;
import com.cimc.car.mapper.SysUserMapper;
import com.cimc.car.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenz
 * @create 2019-12-20 17:38
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
