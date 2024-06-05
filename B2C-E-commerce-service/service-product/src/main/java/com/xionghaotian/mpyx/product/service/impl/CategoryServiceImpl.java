package com.xionghaotian.mpyx.product.service.impl;

import com.xionghaotian.entity.product.Category;
import com.xionghaotian.mpyx.product.mapper.CategoryMapper;
import com.xionghaotian.mpyx.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    //查询所有的一级分类
    @Override
    public List<Category> findOneCategory() {
        return categoryMapper.findOneCategory();
    }
}
