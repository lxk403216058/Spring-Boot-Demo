package com.example.security.sysuser.repository;

import com.example.security.common.repository.*;
import com.example.security.sysuser.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends CommonRepository<SysUser, String> {
}
