package com.xionghaotian.mpyx.product.mapper;

import com.xionghaotian.entity.product.ProductSku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductSkuMapper {
    //根据销量，获取前十条记录
    List<ProductSku> findProductSkuBySale();

}
