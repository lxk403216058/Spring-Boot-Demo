package com.huazi.rmssecurity.model;

import lombok.Data;

@Data
public class Notice extends BaseEntity<Long> {
    private static final long serialVersionUID = -4401913568806243090L;

    private String title;
    private String content;
    private Integer status;

    public interface Status {
        int DRAFT = 0;
        int PUBLISH = 1;
    }
}
