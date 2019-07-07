package com.crazyang.util.model;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Set;

/**
 * @ClassName One2Many
 * @Description: MyBatis的一对多JSON返回对象
 * @Author zhouyang
 *  * 处理嵌套查询结果时，MyBatis会根据bean定义的属性类型来初始化嵌套的成员变量，
 * 主要看其是不是Collection
 * 如果这里不定义，那么嵌套返回结果里就只能返回一对一的结果，而不是一对多的
 * <p>
 * 参见MyBatis  DefaultResultSetHandler.instantiateCollectionPropertyIfAppropriate()
 * @Date 2019/7/7 下午10:10.
 */

public class One2Many extends JSONObject {

    private Set<String> roleList;
    private Set<String> menuList;
    private Set<String> permissionList;
    private Set<Integer> permissionIds;
    private List<JSONObject> picList;
    private List<JSONObject> menus;
    private List<JSONObject> users;
    private List<JSONObject> permissions;
}
