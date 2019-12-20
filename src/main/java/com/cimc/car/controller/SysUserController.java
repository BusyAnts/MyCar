package com.cimc.car.controller;

import com.cimc.car.domain.SysUser;
import com.cimc.car.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author chenz
 * @create 2019-12-20 17:51
 */
@Controller
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<SysUser> getAll() {
        return sysUserService.findAll();
    }

}
