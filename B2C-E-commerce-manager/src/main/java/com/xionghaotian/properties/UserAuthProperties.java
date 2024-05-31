package com.xionghaotian.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @ClassName UserAuthProperties
 * @Description 读取配置实体类
 * @Author XiongHaoTian
 * @Date 2024年05月31日 18:14
 * @Version 1.0
 */

@Data
@ConfigurationProperties(prefix = "project.auth")
public class UserAuthProperties {

    // 不进行拦截的路径
    private List<String> noAuthUrls;
}
