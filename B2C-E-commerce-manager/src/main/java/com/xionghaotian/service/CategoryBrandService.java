package com.xionghaotian.service;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.product.CategoryBrandDto;
import com.xionghaotian.entity.product.Brand;
import com.xionghaotian.entity.product.CategoryBrand;

import java.util.List;

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

    public abstract void updateById(CategoryBrand categoryBrand);

    public abstract void deleteById(Long id);

    //管理员端-商品管理-商品列表管理-添加商品-根据分类id查询品牌列表
    public abstract List<Brand> findBrandByCategoryId(Long categoryId);
}
