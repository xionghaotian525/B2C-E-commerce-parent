package com.xionghaotian.service.impl;

import com.xionghaotian.entity.product.Category;
import com.xionghaotian.mapper.CategoryMapper;
import com.xionghaotian.service.CategoryService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @ClassName CategoryServiceImpl
 * @Description 管理员端-商品管理-分类管理-服务层接口实现类
 * @Author XiongHaoTian
 * @Date 2024年06月13日 12:26
 * @Version 1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    //该函数根据给定的父分类id查询所有子分类数据，并遍历子分类集合，统计每个子分类下子分类的数量，设置是否有子分类的标记，最后返回子分类列表
    @Override
    public List<Category> findByParentId(Long parentId) {
        // 根据分类id查询它下面的所有的子分类数据
        List<Category> categoryList = categoryMapper.selectByParentId(parentId);
        if(!CollectionUtils.isEmpty(categoryList)) {

            // 遍历分类的集合，获取每一个分类数据
            categoryList.forEach(item -> {

                // 查询该分类下子分类的数量
                int count = categoryMapper.countByParentId(item.getId());
                if(count > 0) {
                    item.setHasChildren(true);
                } else {
                    item.setHasChildren(false);
                }

            });
        }
        return categoryList;
    }
}
