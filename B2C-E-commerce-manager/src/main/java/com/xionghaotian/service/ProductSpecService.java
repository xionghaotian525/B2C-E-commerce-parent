package com.xionghaotian.service;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.entity.product.ProductSpec;

/**
 * @ClassName ProductSpecService
 * @Description 管理员端-商品管理-商品规格管理-服务层接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 16:52
 * @Version 1.0
 */
public interface ProductSpecService {
    public abstract PageInfo<ProductSpec> findByPage(Integer page, Integer limit);

    public abstract void save(ProductSpec productSpec);
}
