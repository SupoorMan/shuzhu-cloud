package com.shuzhu.service.impl;

import com.shuzhu.entity.Orders;
import com.shuzhu.mapper.OrdersMapper;
import com.shuzhu.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 积分商品订单 服务实现类
 * </p>
 *
 * @author Poor
 * @since 2022-12-12
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
