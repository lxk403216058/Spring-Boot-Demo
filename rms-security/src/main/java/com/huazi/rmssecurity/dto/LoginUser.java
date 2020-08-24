package com.huazi.rmssecurity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.huazi.rmssecurity.model.Permission;
import com.huazi.rmssecurity.model.SysUser;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.SimpleIdGenerator;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class LoginUser extends SysUser implements UserDetails {
    private static final long serialVersionUID = -1379274258881257107L;

    private List<Permission> permissions;
    private String token;


    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return permissions.parallelStream().filter(p -> !StringUtils.isEmpty(p.getPermission()))
                .map(p->new SimpleGrantedAuthority(p.getPermission())).collect(Collectors.toSet());
    }
    //账户是否未过期
    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }
    //账户是否被锁定
    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return getStatus() != Status.LOCKED;
    }
    //密码是否未过期
    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }
    //账户是否激活
    @Override
    @JsonIgnore
    public boolean isEnabled() {
        return true;
    }
}
