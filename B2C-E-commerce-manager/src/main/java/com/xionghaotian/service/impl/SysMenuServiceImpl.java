package com.xionghaotian.service.impl;

import com.xionghaotian.entity.system.SysMenu;
import com.xionghaotian.helper.MenuHelper;
import com.xionghaotian.mapper.SysMenuMapper;
import com.xionghaotian.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @ClassName SysMenuServiceImpl
 * @Description 管理员端-权限管理-菜单管理-服务层接口实现类
 * @Author XiongHaoTian
 * @Date 2024年06月11日 15:53
 * @Version 1.0
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper ;

    /**
     * 查询所有菜单节点并构建树形结构。
     *
     * 本方法旨在从数据库中检索所有菜单项，并将这些菜单项组织成树形结构，以便于后续的菜单展示或操作。
     * 树形结构的组织通过调用MenuHelper的buildTree方法实现，该方法利用菜单项的父子关系来构建树。
     *
     * @return 返回构建好的菜单树形结构列表。如果查询结果为空，则返回null。
     */
    @Override
    public List<SysMenu> findNodes() {
        // 从数据库中查询所有菜单项
        List<SysMenu> sysMenuList = sysMenuMapper.selectAll() ;
        // 检查查询结果是否为空，为空则直接返回null
        if (CollectionUtils.isEmpty(sysMenuList)) return null;
        // 使用MenuHelper将查询到的菜单项构建为树形结构
        List<SysMenu> treeList = MenuHelper.buildTree(sysMenuList);
        // 返回构建好的树形结构列表
        return treeList;
    }

    /**
     * 保存系统菜单信息。
     *
     * 通过调用SysMenuMapper的insert方法，将SysMenu对象插入到数据库中。
     *
     * @param sysMenu 要保存的系统菜单对象，包含菜单的相关信息。
     */
    @Override
    public void save(SysMenu sysMenu) {
        sysMenuMapper.insert(sysMenu) ;
    }

}
