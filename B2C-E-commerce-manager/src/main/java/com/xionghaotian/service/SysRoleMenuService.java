package com.xionghaotian.service;

import com.xionghaotian.dto.system.AssignMenuDto;

import java.util.Map;

/**
 * @ClassName SysRoleMenuService
 * @Description 管理员端-权限管理-角色管理-分配菜单-服务层接口
 * @Author XiongHaoTian
 * @Date 2024年06月12日 10:05
 * @Version 1.0
 */
public interface SysRoleMenuService {
    public abstract Map<String, Object> findSysRoleMenuByRoleId(Long roleId);

    public abstract void doAssign(AssignMenuDto assignMenuDto);
}
