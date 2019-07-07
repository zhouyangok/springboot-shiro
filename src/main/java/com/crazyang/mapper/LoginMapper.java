package com.crazyang.mapper;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName LoginMapper
 * @Description: 登录相关
 * @Author zhouyang
 * @Date 2019/7/7 下午10:03.
 */

public interface LoginMapper {
    /**
     * 根据用户名和密码查询对应的用户
     */
    JSONObject getUser(@Param("username") String username, @Param("password") String password);
}
