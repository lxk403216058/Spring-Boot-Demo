package com.huazi.rmssecurity.dto;

import lombok.Data;

@Data
public class BeanField {
    private static final long serialVersionUID = 4279960350136806659L;

    private String columnName;
    private String columnType;
    private String columnComment;
    private String columnDefault;
    private String name;
    private String type;
}
