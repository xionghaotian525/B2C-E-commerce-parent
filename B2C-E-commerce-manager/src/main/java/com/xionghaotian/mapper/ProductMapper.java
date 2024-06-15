package com.xionghaotian.mapper;

import com.xionghaotian.dto.product.ProductDto;
import com.xionghaotian.entity.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName ProductMapper
 * @Description 管理员端-商品管理-商品列表管理-Mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 19:46
 * @Version 1.0
 */
@Mapper
public interface ProductMapper {
    public abstract List<Product> findByPage(ProductDto productDto);

    public abstract void save(Product product);
}
