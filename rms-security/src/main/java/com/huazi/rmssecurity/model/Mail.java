package com.huazi.rmssecurity.model;

import lombok.Data;

@Data
public class Mail extends BaseEntity<Long> {
    private static final long serialVersionUID = 5613231124043303948L;

    private Long userId;
    private String toUsers;
    private String subject;
    private String content;
}
