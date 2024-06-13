package com.xionghaotian.mapper;

import com.xionghaotian.entity.product.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName CategoryMapper
 * @Description 管理员端-商品管理-分类管理-mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月13日 12:24
 * @Version 1.0
 */
@Mapper
public interface CategoryMapper {
    //列表查询
    public abstract List<Category> selectByParentId(Long parentId);
    public abstract int countByParentId(Long id);

    //导出功能
    public abstract List<Category> selectAll();
}
