package com.huazi.rmssecurity.model;

import lombok.Data;

@Data
public class MailTo extends BaseEntity<Long> {
    private static final long serialVersionUID = -8238779033956731073L;

    private Long mailId;
    private String toUser;
    private Boolean status;
}
