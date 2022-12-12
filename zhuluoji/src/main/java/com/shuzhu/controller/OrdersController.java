package com.shuzhu.controller;


import com.shuzhu.result.Result;
import com.shuzhu.result.ResultUtil;
import com.shuzhu.service.OrdersService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Target;

/**
 * <p>
 * 积分商品订单 前端控制器
 * </p>
 *
 * @author Poor
 * @since 2022-12-12
 */
@Api(tags = "积分商品订单")
@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;


    @GetMapping("/page")
    public Result page(){

        return ResultUtil.success();
    }

}
