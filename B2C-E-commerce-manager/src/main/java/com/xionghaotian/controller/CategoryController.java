package com.xionghaotian.controller;

import com.xionghaotian.entity.product.Category;
import com.xionghaotian.service.CategoryService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CategoryController
 * @Description 管理员端-商品管理-分类管理-逻辑控制层
 * @Author XiongHaoTian
 * @Date 2024年06月13日 12:27
 * @Version 1.0
 */
@RestController
@RequestMapping(value="/admin/product/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Operation(summary = "根据parentId获取下级节点")
    @GetMapping(value = "/findByParentId/{parentId}")
    public Result<List<Category>> findByParentId(@PathVariable Long parentId) {
        List<Category> list = categoryService.findByParentId(parentId);
        return Result.build(list , ResultCodeEnum.SUCCESS) ;
    }
}
