package com.example.security.sysshortcutmenu.vo;

import com.example.security. common.pojo.PageCondition;import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class SysShortcutMenuVo extends PageCondition implements Serializable {
    private String shortcutMenuId;//用户快捷菜单id

    private String shortcutMenuName;//用户快捷菜单名称

    private String shortcutMenuPath;//用户快捷菜单路径

    private String userId;//用户id

    private String shortcutMenuParentId;//上级id

}
