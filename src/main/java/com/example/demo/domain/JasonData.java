package com.example.demo.domain;

import java.io.Serializable;

public class JasonData implements Serializable {

    private static final long serialVersionUID=1L;

    //状态码
    private int code;

    private String desc;

    public JasonData(int code, String desc, Object data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private Object data;

    public JasonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
