package com.crazyang.service.impl;

import com.crazyang.entity.Product;
import com.crazyang.mapper.ProductMapper;
import com.crazyang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/9 下午10:32.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> listProduct() {
        return mapper.listProduct();
    }

    @Override
    public Product getProductById() {
        return null;
    }

    @Override
    public int addProduct() {
        return 0;
    }

    @Override
    public int updateProduct() {
        return 0;
    }

    @Override
    public int deleteProduct() {
        return 0;
    }
}
