package com.huazi.rmssecurity.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GenerateDetail implements Serializable {
    private static final long serialVersionUID = -164567294469931676L;

    private String beanName;
    private List<BeanField> fields;
}
