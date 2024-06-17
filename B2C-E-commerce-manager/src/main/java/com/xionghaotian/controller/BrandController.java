package com.xionghaotian.controller;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.entity.product.Brand;
import com.xionghaotian.service.BrandService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName BrandController
 * @Description 管理员端-商品管理-品牌管理-逻辑控制层
 * @Author XiongHaoTian
 * @Date 2024年06月14日 9:34
 * @Version 1.0
 */
@Tag(name = "管理员端-商品管理-品牌管理")
@RestController
@RequestMapping(value="/admin/product/brand")
public class BrandController {

    @Autowired
    private BrandService brandService ;

    @Operation(summary = "分页查询品牌列表接口")
    @GetMapping("/findByPage/{pageNum}/{pageSize}")
    public Result<PageInfo<Brand>> findByPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        PageInfo<Brand> pageInfo = brandService.findByPage(pageNum , pageSize);
        return Result.build(pageInfo , ResultCodeEnum.SUCCESS) ;
    }

    @Operation(summary = "添加品牌接口")
    @PostMapping("/saveBrand")
    public Result saveBrand(@RequestBody Brand brand) {
        brandService.saveBrand(brand);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @Operation(summary = "修改品牌接口")
    @PutMapping("/updateById")
    public Result updateById(@RequestBody Brand brand) {
        brandService.updateById(brand);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @Operation(summary = "删除品牌接口")
    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Long id) {
        brandService.deleteById(id);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @Operation(summary = "查询所有品牌接口")
    @GetMapping("/findAll")
    public Result findAll() {
        List<Brand> list = brandService.findAll();
        return Result.build(list , ResultCodeEnum.SUCCESS) ;
    }
}