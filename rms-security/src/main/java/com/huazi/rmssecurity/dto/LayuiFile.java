package com.huazi.rmssecurity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LayuiFile implements Serializable {
    private static final long serialVersionUID = 35435494737590569L;

    private Integer code;
    private String msg;
    private LayuiFileData data;

    public static class LayuiFileData implements Serializable {

        private static final long serialVersionUID = 7907356434695924597L;
        private String src;
        private String title;

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
