package com.example.security.sysusermenu.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_user_menu")
@Data
public class SysUserMenu implements Serializable {
    @Id
    private String userMenuId;//用户菜单表id

    private String userId;//用户id

    private String menuId;//菜单id

}
