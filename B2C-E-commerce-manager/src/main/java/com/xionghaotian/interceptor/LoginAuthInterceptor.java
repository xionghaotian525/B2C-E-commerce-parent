package com.xionghaotian.interceptor;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.xionghaotian.AuthContextUtil;
import com.xionghaotian.entity.system.SysUser;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName loginAuthInterceptor
 * @Description 拦截器
 * @Author XiongHaoTian
 * @Date 2024年05月31日 17:29
 * @Version 1.0
 */

@Component
public class LoginAuthInterceptor implements HandlerInterceptor {

    @Resource
    private RedisTemplate<String , String> redisTemplate ;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //总体思路
        //1.获取请求方式
        //2.从请求头获取token
        //3.如果token为空，返回错误提示
        //4.如果token不为空拿着，token查询Redis
        //5.如果Redis查询不到，返回错误提示
        //6.如果Redis查询到用户信息，将用户数据存储到ThreadLocal中
        //7.更新Redis中的用户数据过期时间
        //8.放行

        // 获取请求方式
        String method = request.getMethod();
        if("OPTIONS".equals(method)) {      // 如果是跨域预检请求，直接放行
            return true ;
        }

        // 获取token
        String token = request.getHeader("token");
        if(StrUtil.isEmpty(token)) {
            responseNoLoginInfo(response) ;
            return false ;
        }

        // 如果token不为空，那么此时验证token的合法性
        String sysUserInfoJson = redisTemplate.opsForValue().get("user:login:" + token);
        if(StrUtil.isEmpty(sysUserInfoJson)) {
            responseNoLoginInfo(response) ;
            return false ;
        }

        // 将用户数据存储到ThreadLocal中
        SysUser sysUser = JSON.parseObject(sysUserInfoJson, SysUser.class);
        AuthContextUtil.set(sysUser);

        // 重置Redis中的用户数据的有效时间
        redisTemplate.expire("user:login:" + token , 30 , TimeUnit.MINUTES) ;

        // 放行
        return true ;
    }

    //响应208状态码给前端
    private void responseNoLoginInfo(HttpServletResponse response) {
        Result result = Result.build(null, ResultCodeEnum.LOGIN_AUTH);
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(JSON.toJSONString(result));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) writer.close();
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        AuthContextUtil.remove();  // 移除threadLocal中的数据
    }
}
