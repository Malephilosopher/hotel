package com.yihuanxu.hotel.mapper;

import com.yihuanxu.hotel.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Ivan Vladimir Xu
 * @Date 2020/11/3 23:06
 */

@Mapper
@Repository
public interface UserMapper {

    List<User> findAll();

    List<User> findById(String id);

    void create(User user);

    void delete(String id);

    void update(User user);

    User findByName(String name);
}
