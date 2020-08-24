package com.example.security.sysshortcutmenu.service;

import com.example.security.common.service.*;
import com.example.security.sysshortcutmenu.pojo.SysShortcutMenu;
import com.example.security.sysshortcutmenu.vo.SysShortcutMenuVo;
import com.example.security.sysshortcutmenu.repository.SysShortcutMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysShortcutMenuServiceImpl extends CommonServiceImpl<SysShortcutMenuVo, SysShortcutMenu, String> implements SysShortcutMenuService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysShortcutMenuRepository sysShortcutMenuRepository;
}
