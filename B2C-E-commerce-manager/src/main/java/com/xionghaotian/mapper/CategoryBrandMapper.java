package com.xionghaotian.mapper;

import com.xionghaotian.dto.product.CategoryBrandDto;
import com.xionghaotian.entity.product.CategoryBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName CategoryBrandMapper
 * @Description 管理员端-商品管理-分类品牌管理-mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 10:54
 * @Version 1.0
 */
@Mapper
public interface CategoryBrandMapper {
    public abstract List<CategoryBrand> findByPage(CategoryBrandDto CategoryBrandDto);

    public abstract void save(CategoryBrand categoryBrand);

    public abstract void updateById(CategoryBrand categoryBrand);

    public abstract void deleteById(Long id);
}
