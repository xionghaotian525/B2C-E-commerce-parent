package com.xionghaotian.mpyx.product.service.impl;

import com.xionghaotian.entity.product.Brand;
import com.xionghaotian.mpyx.product.mapper.BrandMapper;
import com.xionghaotian.mpyx.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
}
