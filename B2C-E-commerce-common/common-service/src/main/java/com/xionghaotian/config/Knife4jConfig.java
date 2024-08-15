package com.xionghaotian.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName Knife4jConfig
 * @Description Knife4j所需配置类
 * @Author XiongHaoTian
 * @Date 2024年05月18日 18:00
 * @Version 1.0
 */
@Configuration
public class Knife4jConfig {

    @Bean
    public GroupedOpenApi userApi() {      // 创建了一个api接口的分组
        return GroupedOpenApi.builder()
                .group("user-api")         // 分组名称
                .pathsToMatch("/api/**")  // 接口请求路径规则
                .build();
    }

    @Bean
    public GroupedOpenApi adminApi() {      // 创建了一个api接口的分组
        return GroupedOpenApi.builder()
                .group("admin-api")         // 分组名称
                .pathsToMatch("/admin/**")  // 接口请求路径规则
                .build();
    }

    /***
     * @description 自定义接口信息
     */
    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("B2C-E-commerce项目API接口文档")
                        .version("1.0")
                        .description("B2C-E-commerce项目API接口文档")
                        .contact(new Contact().name("xionghaotian"))); // 设定作者
    }

}