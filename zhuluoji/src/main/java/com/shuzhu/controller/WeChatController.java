package com.shuzhu.controller;

import com.shuzhu.result.Result;
import com.shuzhu.result.ResultUtil;
import com.shuzhu.transfer.WeChatLogin;
import com.shuzhu.util.HttpUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@Api(tags = "微信小程序")
@RestController
@RequestMapping("/wx")
public class WeChatController {

    private static final String appid = "wxcfa80ada427f5deb";
    private static final String secret = "0058ba1ae1ba027c7b9e0a161c4a8bcd";
    private static final String code2Session = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";

    @PostMapping("/auth/login_by_weixin")
    @ApiOperation(value = "微信小程序登录", notes="微信登录获取OpenId,SessionKey,unionid")
//    @ApiImplicitParam(name = "sss",example = "123")
    public Result login(@RequestBody WeChatLogin weChatLogin, HttpServletResponse response){
        String url = String.format(code2Session, appid, secret, weChatLogin.getCode());
        String res = HttpUtils.sendGet(url);
        System.out.println(res);


        response.addHeader("token","hello wx login");
        response.setStatus(200);

        System.out.println(weChatLogin);
        return ResultUtil.success();
    }

}
