package com.huazi.rmssecurity.model;

import lombok.Data;

@Data
public class SysLogs extends BaseEntity<Long> {
    private static final long serialVersionUID = -7809315432127036583L;

    private SysUser user;
    private String module;
    private Boolean flag;
    private String remark;
}
