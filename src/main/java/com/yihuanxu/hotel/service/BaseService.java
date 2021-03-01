package com.yihuanxu.hotel.service;

import java.util.List;

/**
 * 通用的Service层接口
 */
public interface BaseService<T>{

    /**
     * 查询所有
     *
     * @return
     */
    List<T> findAll();


    /**
     * 添加
     *
     * @param t
     */
    void create(T t);

    /**
     * 删除（批量）
     *
     * @param id
     */
    void delete(String... id);

    /**
     * 修改
     *
     * @param t
     */
    void update(T t);

}
