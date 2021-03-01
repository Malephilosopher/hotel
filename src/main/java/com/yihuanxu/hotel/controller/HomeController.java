package com.yihuanxu.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页控制器
 */

@Controller
public class HomeController {
    /**
     * 系统首页
     * @return
     */
    @GetMapping(value = { "/index"})
    public String index()
    {
        return "home/index";
    }

    /**
     * 酒店预订页
     * @return
     */
    @GetMapping(value = {"/booking"})
    public String user()
    {
        return "home/booking";
    }

}
