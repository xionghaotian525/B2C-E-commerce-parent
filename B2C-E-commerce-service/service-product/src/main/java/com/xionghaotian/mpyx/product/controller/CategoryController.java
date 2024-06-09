package com.xionghaotian.mpyx.product.controller;

import com.xionghaotian.entity.product.Category;
import com.xionghaotian.mpyx.product.service.CategoryService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings({"unchecked", "rawtypes"})
@CrossOrigin//解决跨域问题
@RestController
@RequestMapping(value="/api/product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    //查询所有分类，树形封装
    @GetMapping("findCategoryTree")
    public Result findCategoryTree(){
        List<Category> list = categoryService.findCategoryTree();
        return Result.build(list,  ResultCodeEnum.SUCCESS);
    }
}
