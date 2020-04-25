package com.muyu.dao.base;

import com.muyu.entity.Product;

import java.util.List;

/**
 * @author 七小鱼 2020年04月20日23:21
 */
public interface BaseProductMapper {

    List<Product> selectAll();
}
