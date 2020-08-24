package com.example.security.sysuser.controller;

import com.example.security.common.controller.*;
import com.example.security.sysuser.pojo.SysUser;
import com.example.security.sysuser.vo.SysUserVo;
import com.example.security.sysuser.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysUser/")
public class SysUserController extends CommonController<SysUserVo, SysUser, String> {
    @Autowired
    private SysUserService sysUserService;
}
