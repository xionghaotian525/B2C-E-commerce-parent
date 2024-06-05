package com.xionghaotian.mpyx.product.service;

import com.xionghaotian.entity.product.ProductSku;

import java.util.List;

public interface ProductSkuService {
    //根据销量，获取前十条记录
    List<ProductSku> findProductSkuBySale();

}
