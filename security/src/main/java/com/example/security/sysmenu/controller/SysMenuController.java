package com.example.security.sysmenu.controller;

import com.example.security.common.controller.*;
import com.example.security.sysmenu.pojo.SysMenu;
import com.example.security.sysmenu.vo.SysMenuVo;
import com.example.security.sysmenu.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysMenu/")
public class SysMenuController extends CommonController<SysMenuVo, SysMenu, String> {
    @Autowired
    private SysMenuService sysMenuService;
}
