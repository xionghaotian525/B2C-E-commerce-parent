package com.xionghaotian.mpyx.product.mapper;

import com.xionghaotian.entity.product.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    //查询所有的一级分类
    List<Category> findOneCategory();

    List<Category> findAll();
}
