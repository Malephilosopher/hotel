package com.yihuanxu.hotel.mapper;

import com.github.pagehelper.Page;
import com.yihuanxu.hotel.entity.Hotels;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HotelsMapper {

    List<Hotels> findAll();

    Page<Hotels> findByPage(Hotels hotels);

    List<Hotels> findById(String id);

    void create(Hotels hotels);

    void update(Hotels hotels);

    void delete(String h_hotelName);
}
