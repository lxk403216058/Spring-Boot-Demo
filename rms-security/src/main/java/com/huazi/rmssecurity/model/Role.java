package com.huazi.rmssecurity.model;

import lombok.Data;

@Data
public class Role extends BaseEntity<Long> {
    private static final long serialVersionUID = -3802292814767103648L;

    private String name;
    private String description;
}
