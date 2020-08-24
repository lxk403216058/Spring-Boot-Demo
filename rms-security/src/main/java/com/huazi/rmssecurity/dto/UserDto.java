package com.huazi.rmssecurity.dto;

import com.huazi.rmssecurity.model.SysUser;
import lombok.Data;

import java.util.List;

@Data
public class UserDto extends SysUser {
    private static final long serialVersionUID = -184009306207076712L;

    private List<Long> roleIds;

}
