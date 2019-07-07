package com.crazyang.mapper;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @ClassName ArticleMapper
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/7 下午10:05.
 */

public interface ArticleMapper {

    /**
     * 新增文章
     */
    int addArticle(JSONObject jsonObject);

    /**
     * 统计文章总数
     */
    int countArticle(JSONObject jsonObject);

    /**
     * 文章列表
     */
    List<JSONObject> listArticle(JSONObject jsonObject);

    /**
     * 更新文章
     */
    int updateArticle(JSONObject jsonObject);
}
