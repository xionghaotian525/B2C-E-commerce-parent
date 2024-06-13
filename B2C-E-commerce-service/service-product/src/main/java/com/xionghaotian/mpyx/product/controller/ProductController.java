package com.xionghaotian.mpyx.product.controller;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.h5.ProductSkuDto;
import com.xionghaotian.entity.product.ProductSku;
import com.xionghaotian.mpyx.product.service.ProductService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Operation(summary = "分页查询")
    @GetMapping(value = "/{page}/{limit}")
    public Result list(@PathVariable Integer page,
                       @PathVariable Integer limit,
                       ProductSkuDto productSkuDto)
    {
        PageInfo<ProductSku> pageInfo = productService.findByPage(page, limit, productSkuDto);
        return Result.build(pageInfo , ResultCodeEnum.SUCCESS) ;
    }



}
