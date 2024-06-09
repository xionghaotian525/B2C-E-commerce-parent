package com.xionghaotian.mpyx.product.service;
import com.xionghaotian.entity.product.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findOneCategory();

    //查询所有分类，树形封装
    List<Category> findCategoryTree();

}
