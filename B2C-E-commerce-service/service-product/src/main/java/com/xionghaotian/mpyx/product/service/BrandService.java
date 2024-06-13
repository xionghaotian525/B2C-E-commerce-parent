package com.xionghaotian.mpyx.product.service;

import com.xionghaotian.entity.product.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BrandService {
    List<Brand> findAll();

}
