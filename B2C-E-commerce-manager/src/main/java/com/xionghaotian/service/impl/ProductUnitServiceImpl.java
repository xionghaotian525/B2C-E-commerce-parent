package com.xionghaotian.service.impl;

import com.xionghaotian.entity.base.ProductUnit;
import com.xionghaotian.mapper.ProductUnitMapper;
import com.xionghaotian.service.ProductUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductUnitServiceImpl
 * @Description 管理员端-商品管理-商品列表管理-添加商品功能-查询商品单元数据服务层实现类
 * @Author XiongHaoTian
 * @Date 2024年06月15日 21:09
 * @Version 1.0
 */
@Service
public class ProductUnitServiceImpl implements ProductUnitService {

    @Autowired
    private ProductUnitMapper productUnitMapper;

    @Override
    public List<ProductUnit> findAll() {
        return productUnitMapper.findAll();
    }
}
