package com.yihuanxu.hotel.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yihuanxu.hotel.entity.Hotels;
import com.yihuanxu.hotel.entity.PageBean;
import com.yihuanxu.hotel.mapper.HotelsMapper;
import com.yihuanxu.hotel.service.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ivan Vladimir Xu
 * @Date 2020/11/3 23:33
 */
@Service
public class HotelsServiceImpl implements HotelsService {

    @Autowired
    private HotelsMapper hotelsMapper;


    /**
     * 分页查询
     *
     * @param hotels  查询条件
     * @param  pageCode  当前页
     * @param  pageSize  每页的记录数
     * @return
     */
    @Override
    public PageBean findByPage(Hotels hotels, int pageCode, int pageSize) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode, pageSize);

        //调用分页查询方法，其实就是查询所有数据，Mybatis自动帮我们进行分页计算、
        Page<Hotels> page = hotelsMapper.findByPage(hotels);

        return new PageBean(page.getTotal(), page.getResult());
    }

    @Override
    public List<Hotels> findAll() {
        return null;
    }

    @Override
    public void create(Hotels hotels) {
        hotelsMapper.create(hotels);
    }

    @Override
    public void delete(String...  h_hotelNames) {
        for (String h_hotelName: h_hotelNames) {
            hotelsMapper.delete(h_hotelName);
        }

    }

    @Override
    public void update(Hotels hotels) {
        hotelsMapper.update(hotels);
    }
}
