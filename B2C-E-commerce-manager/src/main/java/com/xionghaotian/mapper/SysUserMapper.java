package com.xionghaotian.mapper;

import com.xionghaotian.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName SysUserMapper
 * @Description SysUserMapper持久层
 * @Author XiongHaoTian
 * @Date 2024年05月19日 21:22
 * @Version 1.0
 */

@Mapper
public interface SysUserMapper {
    /**
     * 根据用户名查询用户数据
     * @param userName
     * @return
     */
    public abstract SysUser selectByUserName(String userName) ;
}
