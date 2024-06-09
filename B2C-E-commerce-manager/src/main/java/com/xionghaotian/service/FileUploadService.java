package com.xionghaotian.service;

import org.springframework.web.multipart.MultipartFile;
/**
 * @ClassName FileUploadService
 * @Description 文件上传接口服务层
 * @Author XiongHaoTian
 * @Date 2024年06月09日 16:20
 * @Version 1.0
 */
public interface FileUploadService {
    String fileUpload(MultipartFile multipartFile);
}
