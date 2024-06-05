package com.xionghaotian.mpyx.product.service.impl;

import com.xionghaotian.entity.product.ProductSku;
import com.xionghaotian.mpyx.product.mapper.ProductSkuMapper;
import com.xionghaotian.mpyx.product.service.ProductSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSkuServiceImpl implements ProductSkuService {
    @Autowired
    private ProductSkuMapper productSkuMapper;
    //根据销量，获取前十条记录
    @Override
    public List<ProductSku> findProductSkuBySale() {
        return productSkuMapper.findProductSkuBySale();
    }
}
