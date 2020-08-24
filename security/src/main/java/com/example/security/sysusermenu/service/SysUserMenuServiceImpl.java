package com.example.security.sysusermenu.service;

import com.example.security.common.service.*;
import com.example.security.sysusermenu.pojo.SysUserMenu;
import com.example.security.sysusermenu.vo.SysUserMenuVo;
import com.example.security.sysusermenu.repository.SysUserMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysUserMenuServiceImpl extends CommonServiceImpl<SysUserMenuVo, SysUserMenu, String> implements SysUserMenuService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysUserMenuRepository sysUserMenuRepository;
}
