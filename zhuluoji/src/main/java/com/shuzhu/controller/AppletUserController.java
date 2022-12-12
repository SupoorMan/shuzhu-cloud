package com.shuzhu.controller;


import com.shuzhu.result.Result;
import com.shuzhu.result.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 小程序用户表 前端控制器
 * </p>
 *
 * @author Poor
 * @since 2022-12-09
 */
@Api(tags = "小程序用户")
@RestController
@RequestMapping("/auser")
public class AppletUserController {

    @GetMapping("/test")
    @ApiOperation(value = "测试",notes = "小标题")
    public Result test(){
        System.out.println("OK");
        return ResultUtil.success("OK");
    }

}
