package com.xionghaotian.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.product.ProductDto;
import com.xionghaotian.entity.product.Product;
import com.xionghaotian.mapper.ProductMapper;
import com.xionghaotian.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description 管理员端-商品管理-商品列表管理-服务层实现类
 * @Author XiongHaoTian
 * @Date 2024年06月15日 19:49
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper ;

    @Override
    public PageInfo<Product> findByPage(Integer page, Integer limit, ProductDto productDto) {
        PageHelper.startPage(page , limit) ;
        List<Product> productList =  productMapper.findByPage(productDto) ;
        return new PageInfo<>(productList);
    }

}
