package com.xionghaotian.service;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.product.ProductDto;
import com.xionghaotian.entity.product.Product;

/**
 * @ClassName ProductService
 * @Description 管理员端-商品管理-商品列表管理-服务层接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 19:49
 * @Version 1.0
 */
public interface ProductService {
    public abstract PageInfo<Product> findByPage(Integer page, Integer limit, ProductDto productDto);

    public abstract void save(Product product);

    //修改功能
    public abstract Product getById(Long id);
    public abstract void updateById(Product product);
}
