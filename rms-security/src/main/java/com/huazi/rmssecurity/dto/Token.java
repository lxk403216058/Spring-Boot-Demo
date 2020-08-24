package com.huazi.rmssecurity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Token implements Serializable {
    private static final long serialVersionUID = 6314027741784310221L;

    private String token;

    public Token(String token) {
        this.token = token;
    }
}
