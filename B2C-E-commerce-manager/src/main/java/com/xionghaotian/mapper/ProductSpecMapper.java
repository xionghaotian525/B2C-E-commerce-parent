package com.xionghaotian.mapper;

import com.xionghaotian.entity.product.ProductSpec;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName ProductSpecMapper
 * @Description 管理员端-商品管理-商品规格管理-mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 16:50
 * @Version 1.0
 */
@Mapper
public interface ProductSpecMapper {
    public abstract List<ProductSpec> findByPage();

    public abstract void save(ProductSpec productSpec);

    public abstract void updateById(ProductSpec productSpec);

    public abstract void deleteById(Long id);

    public abstract List<ProductSpec> findAll();
}
