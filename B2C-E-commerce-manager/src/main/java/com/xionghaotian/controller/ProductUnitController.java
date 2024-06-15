package com.xionghaotian.controller;

import com.xionghaotian.entity.base.ProductUnit;
import com.xionghaotian.service.ProductUnitService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ProductUnitController
 * @Description 管理员端-商品管理-商品列表管理-添加商品功能-查询商品单元数据逻辑控制层
 * @Author XiongHaoTian
 * @Date 2024年06月15日 21:05
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/product/productUnit")
public class ProductUnitController {

    @Autowired
    private ProductUnitService productUnitService;

    @Operation(summary = "查询商品单元数据接口")
    @GetMapping("/findAll")
    public Result<List<ProductUnit>> findAll() {
        List<ProductUnit> productUnitList = productUnitService.findAll();
        return Result.build(productUnitList , ResultCodeEnum.SUCCESS) ;
    }
}
