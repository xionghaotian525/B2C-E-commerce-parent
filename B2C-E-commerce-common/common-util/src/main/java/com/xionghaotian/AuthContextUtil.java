package com.xionghaotian;

import com.xionghaotian.entity.system.SysUser;

/**
 * @ClassName AuthContextUtil
 * @Description 对ThreadLocal进行封装，操作ThreadLocal对象
 * @Author XiongHaoTian
 * @Date 2024年05月31日 17:21
 * @Version 1.0
 */
public class AuthContextUtil {
    // 创建一个ThreadLocal对象
    private static final ThreadLocal<SysUser> threadLocal = new ThreadLocal<>() ;

    // 定义存储数据的静态方法
    public static void set(SysUser sysUser) {
        threadLocal.set(sysUser);
    }

    // 定义获取数据的方法
    public static SysUser get() {
        return threadLocal.get() ;
    }

    // 删除数据的方法
    public static void remove() {
        threadLocal.remove();
    }
}
