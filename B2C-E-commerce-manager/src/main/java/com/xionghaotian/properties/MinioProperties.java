package com.xionghaotian.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName MinioProperties
 * @Description 构建minioClient所需参数实体类
 * @Author XiongHaoTian
 * @Date 2024年06月09日 16:24
 * @Version 1.0
 */

@Data
@ConfigurationProperties(prefix = "project.minio")
public class MinioProperties {
    private String endpointUrl;
    private String accessKey;
    private String secureKey;
    private String bucketName;
}
