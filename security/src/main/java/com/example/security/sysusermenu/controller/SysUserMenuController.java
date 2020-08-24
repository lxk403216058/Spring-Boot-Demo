package com.example.security.sysusermenu.controller;

import com.example.security.common.controller.*;
import com.example.security.sysusermenu.pojo.SysUserMenu;
import com.example.security.sysusermenu.vo.SysUserMenuVo;
import com.example.security.sysusermenu.service.SysUserMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysUserMenu/")
public class SysUserMenuController extends CommonController<SysUserMenuVo, SysUserMenu, String> {
    @Autowired
    private SysUserMenuService sysUserMenuService;
}
