package com.xionghaotian.service;

import com.xionghaotian.entity.product.Category;

import java.util.List;

/**
 * @ClassName CategoryService
 * @Description 管理员端-商品管理-分类管理-服务层接口
 * @Author XiongHaoTian
 * @Date 2024年06月13日 12:25
 * @Version 1.0
 */
public interface CategoryService {
    public abstract List<Category> findByParentId(Long parentId);
}
