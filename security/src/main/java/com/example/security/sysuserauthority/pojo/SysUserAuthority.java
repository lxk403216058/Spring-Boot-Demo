package com.example.security.sysuserauthority.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_user_authority")
@Data
public class SysUserAuthority implements Serializable {
    @Id
    private String userAuthorityId;//用户权限表id

    private String userId;//用户id

    private String authorityId;//权限id

}
