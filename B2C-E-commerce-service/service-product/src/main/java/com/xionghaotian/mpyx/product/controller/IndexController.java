package com.xionghaotian.mpyx.product.controller;

import com.xionghaotian.entity.product.Category;
import com.xionghaotian.entity.product.ProductSku;
import com.xionghaotian.mpyx.product.service.CategoryService;
import com.xionghaotian.mpyx.product.service.ProductSkuService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import com.xionghaotian.vo.h5.IndexVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "首页接口管理")
@RestController
@RequestMapping(value="/api/product/index")
@CrossOrigin//解决跨域问题
public class IndexController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductSkuService productSkuService;

    @Operation(summary = "获取首页数据")
    @GetMapping
    
    public Result findData(){
        // 所有一级分类
        List<Category> categoryList = categoryService.findOneCategory();
        //根据销量，获取前十条记录
        List<ProductSku> productSkuList = productSkuService.findProductSkuBySale();

        IndexVo indexVo = new IndexVo() ;
        indexVo.setCategoryList(categoryList);
        indexVo.setProductSkuList(productSkuList);
        return Result.build(indexVo , ResultCodeEnum.SUCCESS);
    }

}
