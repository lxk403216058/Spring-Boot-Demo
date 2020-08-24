package com.huazi.rmssecurity.dto;

import com.huazi.rmssecurity.model.Notice;
import com.huazi.rmssecurity.model.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class NoticeVO implements Serializable {
    private static final long serialVersionUID = 7363353918096951799L;

    private Notice notice;
    private List<SysUser> users;
}
