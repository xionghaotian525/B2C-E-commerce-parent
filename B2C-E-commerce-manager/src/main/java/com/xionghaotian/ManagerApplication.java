package com.xionghaotian;

import com.xionghaotian.properties.UserAuthProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 管理员端后端服务启动类
 *
 */

@SpringBootApplication
@EnableConfigurationProperties(value = {UserAuthProperties.class})
public class ManagerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ManagerApplication.class, args);
    }
}
