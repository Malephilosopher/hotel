package com.yihuanxu.hotel.service;

import com.yihuanxu.hotel.entity.User;

import java.util.List;

public interface UserService extends BaseService<User>{

    List<User> findAll();

    User findByName(String name);
}
