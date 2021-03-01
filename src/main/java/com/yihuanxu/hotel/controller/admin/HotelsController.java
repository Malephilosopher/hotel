package com.yihuanxu.hotel.controller.admin;

import com.yihuanxu.hotel.entity.Hotels;
import com.yihuanxu.hotel.entity.PageBean;
import com.yihuanxu.hotel.entity.Result;
import com.yihuanxu.hotel.service.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelsController {

    @Autowired
    private HotelsService hotelsService;

    /**
     * 分页查询
     *
     * @param hotels    查询条件
     * @param pageCode  当前页
     * @param pageSize  每页现实的记录条数
     * @return
     */
    @RequestMapping("/findByConPage")
    public PageBean findbyConPage(Hotels hotels,
                                  @RequestParam(value = "pageCode", required = false) int pageCode,
                                  @RequestParam(value = "pageSize", required = false) int pageSize
                                  )
    {
        return hotelsService.findByPage(hotels, pageCode, pageSize);
    }

    /**
     * 新增商品
     *
     * @param hotels
     * @return
     */
    @RequestMapping("/create")
    public Result create(@RequestBody Hotels hotels)
    {
        hotelsService.create(hotels);
        return new Result(true, "创建成功");

    }


}
