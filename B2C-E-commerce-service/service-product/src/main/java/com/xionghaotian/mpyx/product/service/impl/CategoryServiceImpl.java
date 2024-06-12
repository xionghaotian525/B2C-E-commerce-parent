package com.xionghaotian.mpyx.product.service.impl;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.client.naming.utils.CollectionUtils;
import com.xionghaotian.entity.product.Category;
import com.xionghaotian.mpyx.product.mapper.CategoryMapper;
import com.xionghaotian.mpyx.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private RedisTemplate<String , String> redisTemplate ;

    //查询所有的一级分类
    @Override
    public List<Category> findOneCategory() {
        // 从Redis缓存中查询所有的一级分类数据
        String categoryListJSON = redisTemplate.opsForValue().get("category:one");
        if(!StringUtils.isEmpty(categoryListJSON)) {
            List<Category> categoryList = JSON.parseArray(categoryListJSON, Category.class);
            return categoryList ;
        }

        List<Category> categoryList = categoryMapper.findOneCategory();
        redisTemplate.opsForValue().set("category:one" , JSON.toJSONString(categoryList) , 7 , TimeUnit.DAYS);
        return categoryList ;
    }

    @Cacheable(value ="category",key = "'all'")
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
