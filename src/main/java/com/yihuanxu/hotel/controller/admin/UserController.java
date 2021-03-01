package com.yihuanxu.hotel.controller.admin;

import com.yihuanxu.hotel.entity.User;
import com.yihuanxu.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll()
    {
        return userService.findAll();
    }

    /**
     * 根据用户名查询查询
     * @param name
     * @return
     */
    @RequestMapping("/findByName")
    public User findByName(String name)
    {
        return userService.findByName(name);
    }
}
