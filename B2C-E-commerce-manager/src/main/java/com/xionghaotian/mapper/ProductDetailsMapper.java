package com.xionghaotian.mapper;

import com.xionghaotian.entity.product.ProductDetails;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName ProductDetailsMapper
 * @Description productDetails表Mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 21:56
 * @Version 1.0
 */
@Mapper
public interface ProductDetailsMapper {
    public abstract void save(ProductDetails productDetails);

    public abstract ProductDetails selectByProductId(Long id);
    public abstract void updateById(ProductDetails productDetails);

    public abstract void deleteByProductId(Long id);
}