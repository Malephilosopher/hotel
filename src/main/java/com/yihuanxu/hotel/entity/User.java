package com.yihuanxu.hotel.entity;

import java.io.Serializable;

public class User implements Serializable {
    //姓名
    private String username;
    //密码
    private String password;


    //无参数构造方法
    public User() {
    }

    //有参数构造方法
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //getter and setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
