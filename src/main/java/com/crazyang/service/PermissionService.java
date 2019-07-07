package com.crazyang.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName PermissionService
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/7 下午11:01.
 */

public interface PermissionService {

    /**
     * 查询某用户的 角色  菜单列表   权限列表
     */
    JSONObject getUserPermission(String username);
}
