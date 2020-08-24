package com.huazi.rmssecurity.dao;

import com.huazi.rmssecurity.model.Permission;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Set;

@Mapper
public interface PermissionDao {

    @Select("select * from sys_permission t order by t.sort")
    List<Permission> listAll();

    @Select("select * from sys_permission t where t.type = 1 order by t.sort")
    List<Permission> listParents();

    @Select("select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId" +
            " where ru.userId = #{userId} order by t.sort")
    List<Permission> listByUserId(Long userId);

    @Select("select p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId where rp.roleId = #{roleId} order p.sort")
    List<Permission> listByRoleId(Long roleId);

    @Select("select * from sys_permission t where t.id = #{id}")
    Permission getById(Long id);

    @Insert("insert into sys_permission(parentId, name, css, href, type, permission, sort) " +
            "values(#{parentId},#{name},#{css},#{href},#{type},#{permission},#{sort})")
    int save(Permission permission);

    @Update("update sys_permission t set parentId = #{parentId}, name =#{name},css =#{css},href =#{href},type =#{type},permission =#{permission},sort =#{sort}")
    int update(Permission permission);

    @Delete("delete from sys_permission where id = #{id}")
    int delete(Long id);

    @Delete("delete from sys_permission where parentId = #{parentId}")
    int deleteByParentId(Long parentId);

    @Delete("delete from sys_role_permission where permissionId = #{permissionId}")
    int deleteRolePermission(Long permissionId);

    @Select("select ru.userId from sys_role_permission rp inner join sys_role_user ru on ru.roleId = rp.roleId where rp.permissionId = #{permissionId}")
    Set<Long> listUserIds(Long permissionId);
}
