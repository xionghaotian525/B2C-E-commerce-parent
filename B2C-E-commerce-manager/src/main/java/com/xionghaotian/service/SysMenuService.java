package com.xionghaotian.service;

import com.xionghaotian.entity.system.SysMenu;

import java.util.List;

/**
 * @ClassName SysMenuService
 * @Description 管理员端-权限管理-菜单管理-服务层接口
 * @Author XiongHaoTian
 * @Date 2024年06月11日 15:52
 * @Version 1.0
 */
public interface SysMenuService {

    public abstract List<SysMenu> findNodes();

    public abstract void save(SysMenu sysMenu);

    public abstract void updateById(SysMenu sysMenu);

    public abstract void removeById(Long id);
}
