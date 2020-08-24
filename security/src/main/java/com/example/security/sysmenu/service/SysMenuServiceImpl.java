package com.example.security.sysmenu.service;

import com.example.security.common.service.*;
import com.example.security.sysmenu.pojo.SysMenu;
import com.example.security.sysmenu.vo.SysMenuVo;
import com.example.security.sysmenu.repository.SysMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysMenuServiceImpl extends CommonServiceImpl<SysMenuVo, SysMenu, String> implements SysMenuService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysMenuRepository sysMenuRepository;
}
