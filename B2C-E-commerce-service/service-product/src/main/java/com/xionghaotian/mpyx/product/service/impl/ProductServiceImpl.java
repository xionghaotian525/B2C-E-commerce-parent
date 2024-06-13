package com.xionghaotian.mpyx.product.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.h5.ProductSkuDto;
import com.xionghaotian.entity.product.Product;
import com.xionghaotian.entity.product.ProductDetails;
import com.xionghaotian.entity.product.ProductSku;
import com.xionghaotian.mpyx.product.mapper.ProductDetailsMapper;
import com.xionghaotian.mpyx.product.mapper.ProductMapper;
import com.xionghaotian.mpyx.product.mapper.ProductSkuMapper;
import com.xionghaotian.mpyx.product.service.ProductService;
import com.xionghaotian.mpyx.product.service.ProductSkuService;
import com.xionghaotian.vo.h5.ProductItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductSkuMapper productSkuMapper;

    // 接口实现类
    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDetailsMapper productDetailsMapper;

    @Override
    public PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto) {
        PageHelper.startPage(page, limit);
        List<ProductSku> productSkuList = productSkuMapper.findByPage(productSkuDto);
        return new PageInfo<>(productSkuList);
    }

    @Override
    public ProductItemVo item(Long skuId) {
       ProductItemVo productItemVo = new ProductItemVo();
        //当前sku信息
        ProductSku productSku = productSkuMapper.getById(skuId);

        Long productId = productSku.getProductId();
        //当前商品信息
        Product product = productMapper.getById(productSku.getProductId());

        //商品详情信息
        ProductDetails productDetails = productDetailsMapper.getByProductId(productSku.getProductId());

        Map<String,Object> skuSpecValueMap = new HashMap<>();
        List<ProductSku> productSkuList = productSkuMapper.findByProductId(productSku.getProductId());

        productSkuList.forEach(item -> {
            skuSpecValueMap.put(item.getSkuSpec(), item.getId());
        });

        productItemVo.setProduct(product);
        productItemVo.setProductSku(productSku);
        productItemVo.setSkuSpecValueMap(skuSpecValueMap);

        productItemVo.setDetailsImageUrlList(Arrays.asList(productDetails.getImageUrls().split(",")));
        productItemVo.setSliderUrlList(Arrays.asList(product.getSliderUrls().split(",")));
        productItemVo.setSpecValueList(JSON.parseArray(product.getSpecValue()));
        productItemVo.setSkuSpecValueMap(skuSpecValueMap);
        return productItemVo;
    }

}
