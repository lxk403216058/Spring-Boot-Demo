package com.example.security.sysmenu.vo;

import com.example.security. common.pojo.PageCondition;import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class SysMenuVo extends PageCondition implements Serializable {
    private String menuId;//ID

    private String name;//权限名称

    private String permission;//权限标识

    private String menuId;//菜单id

    private String menuName;//菜单名称

    private String menuPath;//菜单路径

    private String menuParentId;//上级id

}
