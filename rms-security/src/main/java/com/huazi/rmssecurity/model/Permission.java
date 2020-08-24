package com.huazi.rmssecurity.model;

import lombok.Data;

import java.util.List;

@Data
public class Permission extends BaseEntity<Long> {
    private static final long serialVersionUID = 6180869216498363919L;

    private Long parentId;
    private String name;
    private String css;
    private String href;
    private Integer type;
    private String permission;
    private Integer sort;

    private List<Permission> child;

}
