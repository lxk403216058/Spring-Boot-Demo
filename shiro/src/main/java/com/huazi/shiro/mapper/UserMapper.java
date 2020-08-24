package com.huazi.shiro.mapper;

import com.huazi.shiro.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    public User queryById(String name);
}
