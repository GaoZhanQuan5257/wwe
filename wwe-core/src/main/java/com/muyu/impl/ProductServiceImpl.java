package com.muyu.impl;


import com.muyu.dao.ProductMapper;
import com.muyu.entity.Product;
import com.muyu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getProducts() {

        List<Product> list = productMapper.selectAll();

        return list;
    }

    @Override
    public Product getProductById(Long productId) {

        return productMapper.selectByPrimaryKey(productId);
    }

}
