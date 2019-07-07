package com.crazyang.mapper;

import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * @ClassName PermissionMapper
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/7 下午10:04.
 */

public interface PermissionMapper {

    /**
     * 查询用户的角色 菜单 权限
     */
    JSONObject getUserPermission(String username);

    /**
     * 查询所有的菜单
     */
    Set<String> getAllMenu();

    /**
     * 查询所有的权限
     */
    Set<String> getAllPermission();
}
