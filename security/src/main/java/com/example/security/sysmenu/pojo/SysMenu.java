package com.example.security.sysmenu.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_menu")
@Data
public class SysMenu implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String menuId;//ID

    private String name;//权限名称

    private String permission;//权限标识

    @Id
    private String menuId;//菜单id

    private String menuName;//菜单名称

    private String menuPath;//菜单路径

    private String menuParentId;//上级id

}
