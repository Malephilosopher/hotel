package com.yihuanxu.hotel.controller.admin;

import com.yihuanxu.hotel.entity.Result;
import com.yihuanxu.hotel.entity.User;
import com.yihuanxu.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登陆
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password)
    {
        System.out.println("username" + username + ", password" + password);
        User user = userService.findByName(username);
        if(user != null)
        {
            if(user.getPassword().equals(password))
            {
                //将登陆用户存到session域中
                ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                attributes.getRequest().getSession().setAttribute("user", user);
                return new Result(true, user.getUsername());
            }
        }
        return new Result(false, "登陆失败");
    }

    /**
     * 注销
     *
     * @return
     */
    @RequestMapping("/logout")
    public String logout()
    {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        attributes.getRequest().getSession().removeAttribute("user");
        return "home/index";
    }

    /**
     * 注销
     *
     * @param username
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping("/register")
    public Result register(@RequestParam("username") String username, @RequestParam("password") String password)
    {
        try {
            userService.create(new User(username, password));
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            attributes.getRequest().getSession().setAttribute("user", new User(username, password)); //将登陆用户信息存入到session域对象中
            return new Result(true, username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false, "发生未知错误");
    }


}
