package com.xionghaotian.service;

import com.xionghaotian.entity.base.ProductUnit;

import java.util.List;

/**
 * @ClassName ProductUnitService
 * @Description 管理员端-商品管理-商品列表管理-添加商品功能-查询商品单元数据服务层接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 21:09
 * @Version 1.0
 */
public interface ProductUnitService {
    public abstract List<ProductUnit> findAll();
}
