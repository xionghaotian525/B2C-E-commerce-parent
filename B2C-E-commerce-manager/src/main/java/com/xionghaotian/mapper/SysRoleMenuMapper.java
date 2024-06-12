package com.xionghaotian.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName SysRoleMenuMapper
 * @Description 管理员端-权限管理-角色管理-分配菜单-mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月12日 10:02
 * @Version 1.0
 */
@Mapper
public interface SysRoleMenuMapper {
    public abstract List<Long> findSysRoleMenuByRoleId(Long roleId);
}
