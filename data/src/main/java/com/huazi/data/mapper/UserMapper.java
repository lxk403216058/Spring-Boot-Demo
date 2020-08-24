package com.huazi.data.mapper;


import com.huazi.data.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Select("select * from user;")
    List<User> queryUserList();
    @Select("select * from user where id = #{id};")
    User queryUserById(int id);
    @Insert("insert into user (id,name,pwd) values (#{id},#{name},#{pwd});")
    int addUser(User user);
    @Update("update user set name=#{name},pwd=#{pwd} where id = #{id};")
    int updateUser(User user);
    @Delete("delete from user where id = #{id};")
    int deleteUser(int id);

}
