package com.xionghaotian.mapper;

import com.xionghaotian.entity.order.OrderStatistics;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName OrderInfoMapper
 * @Description 定时任务-OrderInfo-mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月16日 22:28
 * @Version 1.0
 */
@Mapper
public interface OrderInfoMapper {
    // 查询指定日期产生的订单数据
    public abstract OrderStatistics selectOrderStatistics(String creatTime);
}
