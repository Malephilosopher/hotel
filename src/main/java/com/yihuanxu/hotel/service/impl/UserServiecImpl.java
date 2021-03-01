package com.yihuanxu.hotel.service.impl;

import com.yihuanxu.hotel.entity.User;
import com.yihuanxu.hotel.mapper.UserMapper;
import com.yihuanxu.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ivan Vladimir Xu
 * @Date 2020/11/4 0:02
 */
@Service
public class UserServiecImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void create(User user) {
        userMapper.create(user);
    }

    @Override
   public void delete(String... ids) {
        for (String id : ids) {
            userMapper.delete(id);
        }
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}
