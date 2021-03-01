package com.yihuanxu.hotel.entity;

import java.io.Serializable;

public class Result implements Serializable {

    //判断结果
    private boolean success;
    //返回信息
    private String message;

    //无参数构造方法
    public Result() {
    }

    //有参数构造方法
    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    //Getter and Setter
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
