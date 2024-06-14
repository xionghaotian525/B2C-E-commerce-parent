package com.xionghaotian.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xionghaotian.entity.product.Brand;
import com.xionghaotian.mapper.BrandMapper;
import com.xionghaotian.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BrandServiceImpl
 * @Description 管理员端-商品管理-品牌管理-服务层接口实现类
 * @Author XiongHaoTian
 * @Date 2024年06月14日 9:31
 * @Version 1.0
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public PageInfo<Brand> findByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Brand> brandList = brandMapper.findByPage() ;
        return new PageInfo(brandList);
    }

    //添加品牌
    @Override
    public void saveBrand(Brand brand) {
        brandMapper.saveBrand(brand);
    }

    //修改品牌
    @Override
    public void updateById(Brand brand) {
        brandMapper.updateById(brand);
    }
}
