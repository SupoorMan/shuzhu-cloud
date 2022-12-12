package com.shuzhu.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.*;


@SpringBootConfiguration
public class WebMvcConfig implements WebMvcConfigurer {


    /**
     * 设置拦截规则
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns：添加拦截规则
        // excludePathPatterns： 排除拦截规则
        // login 是 用户登录接口，不拦截
        // /sender/code是用户手机验证码登录时发送短信验证码的接口，不拦截
        // /account/register 是企业账号申请注册的接口，不拦截
        // /account/sender/code 是企业账号申请注册时的短信验证码 不拦截。
        // error 是 spring boot中的默认处理异常的url，所以排除掉，不拦截。
        // file 是企业账号注册是上传的企业资质，不拦截。
        registry.addInterceptor(new HttpHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login")
                .excludePathPatterns("/sender/code")
                .excludePathPatterns("/account/register")
                .excludePathPatterns("/account/sender/code")
                .excludePathPatterns("/error")
                .excludePathPatterns("/file")
                .excludePathPatterns("/backUp/**")
        ;
    }

    /**
     * 设置跨域规则
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//设置允许跨域的路径
                //设置允许跨域请求的域名 allowedOriginPatterns
                .allowedOriginPatterns("*")
                .allowedOrigins("Access-Control-Allow-Origin")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "OPTIONS", "DELETE", "PUT")//设置允许的方法
                .allowedHeaders("*")
                .exposedHeaders("*")
                .maxAge(36000);//跨域允许时间,秒
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**", "/swagger-ui/**")
                .addResourceLocations("file:" + System.getProperty("user.dir") + "/",
                        "classpath:/META-INF/resources/webjars/springfox-swagger-ui/",
                        "doc.html")
                .resourceChain(false);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/swagger-ui/")
                .setViewName("forward:/swagger-ui/index.html");
    }

}
