package com.xionghaotian.service;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.entity.product.Brand;

/**
 * @ClassName BrandService
 * @Description 管理员端-商品管理-品牌管理-服务层接口
 * @Author XiongHaoTian
 * @Date 2024年06月14日 9:30
 * @Version 1.0
 */
public interface BrandService {
    public abstract PageInfo<Brand> findByPage(Integer pageNum, Integer pageSize);

    public void saveBrand(Brand brand);
}
