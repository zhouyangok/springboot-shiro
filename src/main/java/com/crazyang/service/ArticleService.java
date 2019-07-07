package com.crazyang.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName ArticleService
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/7 下午11:01.
 */

public interface ArticleService {

    /**
     * 新增文章
     */
    JSONObject addArticle(JSONObject jsonObject);

    /**
     * 文章列表
     */
    JSONObject listArticle(JSONObject jsonObject);

    /**
     * 更新文章
     */
    JSONObject updateArticle(JSONObject jsonObject);
}
