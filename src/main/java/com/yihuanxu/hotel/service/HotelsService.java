package com.yihuanxu.hotel.service;

import com.yihuanxu.hotel.entity.Hotels;
import com.yihuanxu.hotel.entity.PageBean;

public interface HotelsService extends BaseService<Hotels>{

    /**
     * 分页查询
     * @param hotels  查询条件
     * @param  pageCode  当前页
     * @param  pageSize  每页的记录数
     * @return
     */
    PageBean findByPage(Hotels hotels, int pageCode, int pageSize);
}
