package com.example.security.sysauthority.controller;

import com.example.security.common.controller.*;
import com.example.security.sysauthority.pojo.SysAuthority;
import com.example.security.sysauthority.vo.SysAuthorityVo;
import com.example.security.sysauthority.service.SysAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysAuthority/")
public class SysAuthorityController extends CommonController<SysAuthorityVo, SysAuthority, String> {
    @Autowired
    private SysAuthorityService sysAuthorityService;
}
