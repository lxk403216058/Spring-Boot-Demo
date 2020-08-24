package com.example.security.sysuser.service;

import com.example.security.common.service.*;
import com.example.security.sysuser.pojo.SysUser;
import com.example.security.sysuser.vo.SysUserVo;
import com.example.security.sysuser.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysUserServiceImpl extends CommonServiceImpl<SysUserVo, SysUser, String> implements SysUserService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysUserRepository sysUserRepository;
}
