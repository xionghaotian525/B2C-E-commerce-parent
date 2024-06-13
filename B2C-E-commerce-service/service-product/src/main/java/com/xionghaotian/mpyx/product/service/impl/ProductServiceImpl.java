package com.xionghaotian.mpyx.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.h5.ProductSkuDto;
import com.xionghaotian.entity.product.ProductSku;
import com.xionghaotian.mpyx.product.mapper.ProductSkuMapper;
import com.xionghaotian.mpyx.product.service.ProductService;
import com.xionghaotian.mpyx.product.service.ProductSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductSkuMapper productSkuMapper;

    @Override
    public PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto) {
        PageHelper.startPage(page, limit);
        List<ProductSku> productSkuList = productSkuMapper.findByPage(productSkuDto);
        return new PageInfo<>(productSkuList);
    }

}
