package com.crazyang.controller;

import com.alibaba.fastjson.JSONObject;
import com.crazyang.entity.Product;
import com.crazyang.service.ProductService;
import com.crazyang.util.CommonUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName ProductController
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/9 下午10:27.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequiresPermissions("product:list")
    @GetMapping("/listProduct")
    public List<Product> listArticle(HttpServletRequest request) {
        return service.listProduct();
    }

}
