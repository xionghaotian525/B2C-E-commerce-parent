package com.xionghaotian.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xionghaotian.entity.product.ProductSpec;
import com.xionghaotian.mapper.ProductSpecMapper;
import com.xionghaotian.service.ProductSpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductSpecServiceImpl
 * @Description 管理员端-商品管理-商品规格管理-服务层接口实现类
 * @Author XiongHaoTian
 * @Date 2024年06月15日 16:53
 * @Version 1.0
 */
@Service
public class ProductSpecServiceImpl implements ProductSpecService {

    @Autowired
    private ProductSpecMapper productSpecMapper ;

    @Override
    public PageInfo<ProductSpec> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page , limit) ;
        List<ProductSpec> productSpecList = productSpecMapper.findByPage() ;
        return new PageInfo<>(productSpecList);
    }

    @Override
    public void save(ProductSpec productSpec) {
        productSpecMapper.save(productSpec) ;
    }

    @Override
    public void updateById(ProductSpec productSpec) {
        productSpecMapper.updateById(productSpec) ;
    }

    @Override
    public void deleteById(Long id) {
        productSpecMapper.deleteById(id) ;
    }

    @Override
    public List<ProductSpec> findAll() {
        return productSpecMapper.findAll();
    }

}
