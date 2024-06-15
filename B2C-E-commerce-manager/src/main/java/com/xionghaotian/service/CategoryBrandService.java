package com.xionghaotian.service;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.product.CategoryBrandDto;
import com.xionghaotian.entity.product.CategoryBrand;

/**
 * @ClassName CategoryBrandService
 * @Description 管理员端-商品管理-分类品牌管理-Service层接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 10:55
 * @Version 1.0
 */
public interface CategoryBrandService {
    public abstract PageInfo<CategoryBrand> findByPage(Integer page, Integer limit, CategoryBrandDto CategoryBrandDto);

    public abstract void save(CategoryBrand categoryBrand);
}
