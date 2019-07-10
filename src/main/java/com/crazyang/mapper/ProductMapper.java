package com.crazyang.mapper;

import com.crazyang.entity.Product;

import java.util.List;

/**
 * @ClassName ProductMapper
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/9 下午10:29.
 */

public interface ProductMapper {

    List<Product> listProduct();

    Product getProductById();

    int addProduct();

    int updateProduct();

    int deleteProduct();

}
