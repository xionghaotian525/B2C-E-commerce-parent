package com.xionghaotian.controller;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.product.ProductDto;
import com.xionghaotian.entity.product.Product;
import com.xionghaotian.service.ProductService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName ProductController
 * @Description 管理员端-商品管理-商品列表管理-逻辑控制层
 * @Author XiongHaoTian
 * @Date 2024年06月15日 19:50
 * @Version 1.0
 */
@RestController
@RequestMapping(value="/admin/product/product")
public class ProductController {

    @Autowired
    private ProductService productService ;

    @Operation(summary = "分页查询商品列表")
    @GetMapping(value = "/{page}/{limit}")
    public Result<PageInfo<Product>> findByPage(@PathVariable Integer page, @PathVariable Integer limit, ProductDto productDto) {
        PageInfo<Product> pageInfo = productService.findByPage(page, limit, productDto);
        return Result.build(pageInfo , ResultCodeEnum.SUCCESS) ;
    }

    @Operation(summary = "保存商品信息接口")
    @PostMapping("/save")
    public Result save(@RequestBody Product product) {
        productService.save(product);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

}