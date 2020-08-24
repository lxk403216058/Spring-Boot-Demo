package com.example.security.sysauthority.service;

import com.example.security.common.service.*;
import com.example.security.sysauthority.pojo.SysAuthority;
import com.example.security.sysauthority.vo.SysAuthorityVo;
import com.example.security.sysauthority.repository.SysAuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysAuthorityServiceImpl extends CommonServiceImpl<SysAuthorityVo, SysAuthority, String> implements SysAuthorityService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysAuthorityRepository sysAuthorityRepository;
}
