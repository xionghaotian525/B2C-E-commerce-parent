package com.xionghaotian.service.impl;

import com.xionghaotian.entity.system.SysMenu;
import com.xionghaotian.mapper.SysRoleMenuMapper;
import com.xionghaotian.service.SysMenuService;
import com.xionghaotian.service.SysRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName SysRoleMenuServiceImpl
 * @Description 管理员端-权限管理-角色管理-分配菜单-服务层实现类
 * @Author XiongHaoTian
 * @Date 2024年06月12日 10:06
 * @Version 1.0
 */

@Service
public class SysRoleMenuServiceImpl implements SysRoleMenuService {

    @Autowired
    private SysMenuService sysMenuService;

    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;
    @Override
    public Map<String, Object> findSysRoleMenuByRoleId(Long roleId) {
        // 查询所有的菜单数据
        List<SysMenu> sysMenuList = sysMenuService.findNodes() ;

        // 查询当前角色的菜单数据
        List<Long> roleMenuIds = sysRoleMenuMapper.findSysRoleMenuByRoleId(roleId) ;

        // 将数据存储到Map中进行返回
        Map<String , Object> result = new HashMap<>() ;
        result.put("sysMenuList" , sysMenuList) ;
        result.put("roleMenuIds" , roleMenuIds) ;

        // 返回
        return result;
    }
}
