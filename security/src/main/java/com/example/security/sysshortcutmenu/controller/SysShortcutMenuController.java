package com.example.security.sysshortcutmenu.controller;

import com.example.security.common.controller.*;
import com.example.security.sysshortcutmenu.pojo.SysShortcutMenu;
import com.example.security.sysshortcutmenu.vo.SysShortcutMenuVo;
import com.example.security.sysshortcutmenu.service.SysShortcutMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysShortcutMenu/")
public class SysShortcutMenuController extends CommonController<SysShortcutMenuVo, SysShortcutMenu, String> {
    @Autowired
    private SysShortcutMenuService sysShortcutMenuService;
}
