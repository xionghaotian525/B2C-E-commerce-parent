package com.xionghaotian.service.impl;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import com.xionghaotian.vo.system.ValidateCodeVo;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ValidateCodeServiceImpl
 * @Description 图片验证码服务层接口实现类
 * @Author XiongHaoTian
 * @Date 2024年05月27日 18:00
 * @Version 1.0
 */
@Service
public class ValidateCodeServiceImpl implements com.xionghaotian.service.ValidateCodeService {

    @Resource
    private RedisTemplate<String , String> redisTemplate ;

    /**
     * 生成验证码并返回其相关信息的Vo对象。
     * 该方法不接受任何参数。
     *
     * @return ValidateCodeVo 验证码信息的Vo对象，包含验证码的key和base64编码的图片数据。
     */
    @Override
    public ValidateCodeVo generateValidateCode() {

        // 使用hutool工具包中的工具类生成图片验证码
        //参数：宽  高  验证码位数 干扰线数量
        CircleCaptcha circleCaptcha = CaptchaUtil.createCircleCaptcha(150, 48, 4, 20);
        String codeValue = circleCaptcha.getCode();
        String imageBase64 = circleCaptcha.getImageBase64();

        // 生成uuid作为图片验证码的key
        String codeKey = UUID.randomUUID().toString().replace("-", "");

        // 将验证码存储到Redis中
        redisTemplate.opsForValue().set("user:login:validatecode:" + codeKey , codeValue , 5 , TimeUnit.MINUTES);

        // 构建响应结果数据
        ValidateCodeVo validateCodeVo = new ValidateCodeVo() ;
        validateCodeVo.setCodeKey(codeKey);
        validateCodeVo.setCodeValue("data:image/png;base64," + imageBase64);

        // 返回数据
        return validateCodeVo;
    }
}
