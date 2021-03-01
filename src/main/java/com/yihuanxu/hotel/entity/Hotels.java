package com.yihuanxu.hotel.entity;

import java.io.Serializable;

public class Hotels implements Serializable {
    //名称
    private String h_hotelName;

    //无参数构造方法
    public Hotels() {
    }

    //有参数构造方法

    public Hotels(String h_hotelName) {
        this.h_hotelName = h_hotelName;
    }

    //getter and setter

    public String getH_hotelName() {
        return h_hotelName;
    }

    public void setH_hotelName(String h_hotelName) {
        this.h_hotelName = h_hotelName;
    }

}
