package com.example.security.sysuserauthority.controller;

import com.example.security.common.controller.*;
import com.example.security.sysuserauthority.pojo.SysUserAuthority;
import com.example.security.sysuserauthority.vo.SysUserAuthorityVo;
import com.example.security.sysuserauthority.service.SysUserAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysUserAuthority/")
public class SysUserAuthorityController extends CommonController<SysUserAuthorityVo, SysUserAuthority, String> {
    @Autowired
    private SysUserAuthorityService sysUserAuthorityService;
}
