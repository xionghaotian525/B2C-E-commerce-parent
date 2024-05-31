package com.xionghaotian.config;

import com.xionghaotian.interceptor.LoginAuthInterceptor;
import com.xionghaotian.properties.UserAuthProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebMvcConfiguration
 * @Description 配置类解决跨域问题
 * @Author XiongHaoTian
 * @Date 2024年05月22日 16:14
 * @Version 1.0
 */

@Component
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private LoginAuthInterceptor loginAuthInterceptor;

    @Autowired
    private UserAuthProperties userAuthProperties;

    //解决跨域问题
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      // 添加路径规则
                .allowCredentials(true)               // 是否允许在跨域的情况下传递Cookie
                .allowedOriginPatterns("*")           // 允许请求来源的域规则
                .allowedMethods("*")
                .allowedHeaders("*") ;                // 允许所有的请求头
    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginAuthInterceptor)
                .addPathPatterns("/**")
//                .excludePathPatterns("/admin/system/index/login",
//                        "/admin/system/index/generateValidateCode",
//                        "/admin/system/index/logout");
                .excludePathPatterns(userAuthProperties.getNoAuthUrls());
    }
}
