package com.huazi.rmssecurity.model;

import lombok.Data;

@Data
public class FileInfo extends BaseEntity<Long> {
    private static final long serialVersionUID = -5761547882766615438L;

    private String contentType;
    private long size;
    private String path;
    private String url;
    private Integer type;
}
