package com.xionghaotian.mpyx.product.service.impl;

import com.alibaba.nacos.client.naming.utils.CollectionUtils;
import com.xionghaotian.entity.product.Category;
import com.xionghaotian.mpyx.product.mapper.CategoryMapper;
import com.xionghaotian.mpyx.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    //查询所有的一级分类
    @Override
    public List<Category> findOneCategory() {
        return categoryMapper.findOneCategory();
    }

    //查询所有分类，树形封装
    @Override
    public List<Category> findCategoryTree() {

        List<Category> categoryList = categoryMapper.findAll();
        //全部一级分类
        List<Category> oneCategoryList = categoryList.stream().filter(item -> item.getParentId().longValue() == 0).collect(Collectors.toList());

        if (!CollectionUtils.isEmpty(oneCategoryList)) {
            oneCategoryList.forEach(oneCategory -> {
                List<Category> twoCategoryList = categoryList.stream().filter(item -> item.getParentId().longValue() == oneCategory.getId().longValue()).collect(Collectors.toList());
                oneCategory.setChildren(twoCategoryList);

                if (!CollectionUtils.isEmpty(twoCategoryList)) {
                    twoCategoryList.forEach(twoCategory -> {
                        List<Category> threeCategoryList = categoryList.stream().filter(item -> item.getParentId().longValue() == twoCategory.getId().longValue()).collect(Collectors.toList());
                        twoCategory.setChildren(threeCategoryList);
                    });
                }
            });
        }
        return oneCategoryList;
    }

}
