package com.xionghaotian.mapper;

import com.xionghaotian.entity.base.ProductUnit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName ProductUnitMapper
 * @Description 管理员端-商品管理-商品列表管理-添加商品功能-查询商品单元数据mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月15日 21:08
 * @Version 1.0
 */
@Mapper
public interface ProductUnitMapper {
    public abstract List<ProductUnit> findAll();
}
