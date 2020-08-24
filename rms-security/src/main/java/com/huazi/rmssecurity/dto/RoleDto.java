package com.huazi.rmssecurity.dto;

import com.huazi.rmssecurity.model.Role;
import lombok.Data;

import java.util.List;

@Data
public class RoleDto extends Role {
    private static final long serialVersionUID = 4218495592167610193L;

    private List<Long> permissionIds;
}
