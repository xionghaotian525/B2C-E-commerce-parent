package com.xionghaotian.mpyx.product.service;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.h5.ProductSkuDto;
import com.xionghaotian.entity.product.ProductSku;

public interface ProductService {
    PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto);

}
