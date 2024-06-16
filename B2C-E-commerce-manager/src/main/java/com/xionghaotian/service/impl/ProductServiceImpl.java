package com.xionghaotian.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.product.ProductDto;
import com.xionghaotian.entity.product.Product;
import com.xionghaotian.entity.product.ProductDetails;
import com.xionghaotian.entity.product.ProductSku;
import com.xionghaotian.mapper.ProductDetailsMapper;
import com.xionghaotian.mapper.ProductMapper;
import com.xionghaotian.mapper.ProductSkuMapper;
import com.xionghaotian.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description 管理员端-商品管理-商品列表管理-服务层实现类
 * @Author XiongHaoTian
 * @Date 2024年06月15日 19:49
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper ;

    @Autowired
    private ProductSkuMapper productSkuMapper ;

    @Autowired
    private ProductDetailsMapper productDetailsMapper ;

    @Override
    public PageInfo<Product> findByPage(Integer page, Integer limit, ProductDto productDto) {
        PageHelper.startPage(page , limit) ;
        List<Product> productList =  productMapper.findByPage(productDto) ;
        return new PageInfo<>(productList);
    }

    //这是一个保存商品信息的方法，包括商品基本信息、SKU列表和详情信息。
    //它使用事务处理确保操作一致性，先保存商品基本信息，再循环保存每个SKU细节，并最后保存商品的详情描述。
    @Transactional
    @Override
    public void save(Product product) {

        // 保存商品数据
        product.setStatus(0);              // 设置上架状态为0
        product.setAuditStatus(0);         // 设置审核状态为0
        productMapper.save(product);

        // 保存商品sku数据
        List<ProductSku> productSkuList = product.getProductSkuList();
        for(int i=0,size=productSkuList.size(); i<size; i++) {

            // 获取ProductSku对象
            ProductSku productSku = productSkuList.get(i);
            productSku.setSkuCode(product.getId() + "_" + i);       // 构建skuCode

            productSku.setProductId(product.getId());               // 设置商品id
            productSku.setSkuName(product.getName() + productSku.getSkuSpec());
            productSku.setSaleNum(0);                               // 设置销量
            productSku.setStatus(0);
            productSkuMapper.save(productSku);                    // 保存数据

        }

        // 保存商品详情数据
        ProductDetails productDetails = new ProductDetails();
        productDetails.setProductId(product.getId());
        productDetails.setImageUrls(product.getDetailsImageUrls());
        productDetailsMapper.save(productDetails);

    }

    //修改功能-查询商品详情
    @Override
    public Product getById(Long id) {
        // 根据id查询商品数据
        Product product = productMapper.selectById(id);

        // 根据商品的id查询sku数据
        List<ProductSku> productSkuList = productSkuMapper.selectByProductId(id);
        product.setProductSkuList(productSkuList);

        // 根据商品的id查询商品详情数据
        ProductDetails productDetails = productDetailsMapper.selectByProductId(product.getId());
        product.setDetailsImageUrls(productDetails.getImageUrls());

        // 返回数据
        return product;
    }

    @Transactional
    @Override
    public void updateById(Product product) {
        // 修改商品基本数据
        productMapper.updateById(product);

        // 修改商品的sku数据
        List<ProductSku> productSkuList = product.getProductSkuList();
        productSkuList.forEach(productSku -> {
            productSkuMapper.updateById(productSku);
        });

        // 修改商品的详情数据
        ProductDetails productDetails = productDetailsMapper.selectByProductId(product.getId());
        productDetails.setImageUrls(product.getDetailsImageUrls());
        productDetailsMapper.updateById(productDetails);
    }

}
