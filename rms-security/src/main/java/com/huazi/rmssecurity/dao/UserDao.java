package com.huazi.rmssecurity.dao;

import com.huazi.rmssecurity.model.SysUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into sys_user(username, password, nickname, headImgUrl, phone, telephone, email, birthday, sex, status, createTime, updateTime) " +
            "values(#{username},#{password},#{nickname},#{headImgUrl},#{phone},#{telephone},#{email},#{birthday},#{sex},#{status}, now(), now()")
    int save(SysUser user);

    @Select("select * from sys_user t where t.id = #{id}")
    SysUser getById(Long id);

    @Select("select * from sys_user t where t.username = #{username}")
    SysUser getUser(String username);

    @Update("update sys_user t set t.password = #{password} where t.id = #{id}")
    int changePassword(@Param("id") Long id, @Param("password") String password);

    Integer count(@Param("params") Map<String, Object> params);

    List<SysUser> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Delete("delete from sys_role_user where userId = #{userId}")
    int deleteUserRole(Long userId);

    int saveUserRoles(@Param("userId") Long userId, @Param("roleIds") List<Long> roleIds);

    int update(SysUser user);
}
