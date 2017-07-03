package com.app.entity;

import java.io.Serializable;

/**
 * Created by SamZhao on 2017/7/3.
 */
public class ResultMap implements Serializable {

    private String code;

    private String result;

    @Override
    public String toString() {
        return "ResultMap{" +
                "code='" + code + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
