package com.xionghaotian.mapper;

import com.xionghaotian.entity.product.ProductSku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName ProductSkuMapper
 * @Description ProductSku表mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 21:55
 * @Version 1.0
 */
@Mapper
public interface ProductSkuMapper {
    public abstract void save(ProductSku productSku);

    public abstract List<ProductSku> selectByProductId(Long id);
    public abstract  void updateById(ProductSku productSku);
}
