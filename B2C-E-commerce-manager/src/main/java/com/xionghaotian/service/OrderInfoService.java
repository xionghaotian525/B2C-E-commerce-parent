package com.xionghaotian.service;

import com.xionghaotian.dto.order.OrderStatisticsDto;
import com.xionghaotian.vo.order.OrderStatisticsVo;

/**
 * @ClassName OrderInfoService
 * @Description 管理员端-订单管理-订单统计-Service层接口
 * @Author XiongHaoTian
 * @Date 2024年06月16日 22:53
 * @Version 1.0
 */
public interface OrderInfoService {
    public abstract OrderStatisticsVo getOrderStatisticsData(OrderStatisticsDto orderStatisticsDto);
}
