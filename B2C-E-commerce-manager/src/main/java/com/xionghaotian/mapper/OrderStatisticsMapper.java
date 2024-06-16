package com.xionghaotian.mapper;

import com.xionghaotian.dto.order.OrderStatisticsDto;
import com.xionghaotian.entity.order.OrderStatistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName OrderStatisticsMapper
 * @Description 定时任务-OrderStatistics-mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月16日 22:29
 * @Version 1.0
 */
@Mapper
public interface OrderStatisticsMapper {
    public abstract void insert(OrderStatistics orderStatistics);

    //统计查询
    List<OrderStatistics> selectList(OrderStatisticsDto orderStatisticsDto);
}
