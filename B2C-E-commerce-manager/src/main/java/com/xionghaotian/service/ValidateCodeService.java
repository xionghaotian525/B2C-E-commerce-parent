package com.xionghaotian.service;

import com.xionghaotian.vo.system.ValidateCodeVo;

/**
 * @ClassName ValidateCodeService
 * @Description 图片验证码服务层接口
 * @Author XiongHaoTian
 * @Date 2024年05月27日 17:57
 * @Version 1.0
 */
public interface ValidateCodeService {
    // 获取验证码图片
    public abstract ValidateCodeVo generateValidateCode();
}
