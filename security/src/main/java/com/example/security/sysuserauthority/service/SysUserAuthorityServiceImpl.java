package com.example.security.sysuserauthority.service;

import com.example.security.common.service.*;
import com.example.security.sysuserauthority.pojo.SysUserAuthority;
import com.example.security.sysuserauthority.vo.SysUserAuthorityVo;
import com.example.security.sysuserauthority.repository.SysUserAuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysUserAuthorityServiceImpl extends CommonServiceImpl<SysUserAuthorityVo, SysUserAuthority, String> implements SysUserAuthorityService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysUserAuthorityRepository sysUserAuthorityRepository;
}
