package com.crazyang.service;

import com.crazyang.entity.Product;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/9 下午10:31.
 */

public interface ProductService {

    List<Product> listProduct();

    Product getProductById();

    int addProduct();

    int updateProduct();

    int deleteProduct();
}
