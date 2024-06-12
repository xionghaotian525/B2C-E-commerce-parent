package com.xionghaotian.service.impl;

import com.xionghaotian.AuthContextUtil;
import com.xionghaotian.entity.system.SysMenu;
import com.xionghaotian.entity.system.SysUser;
import com.xionghaotian.exception.GuiguException;
import com.xionghaotian.helper.MenuHelper;
import com.xionghaotian.mapper.SysMenuMapper;
import com.xionghaotian.service.SysMenuService;
import com.xionghaotian.vo.common.ResultCodeEnum;
import com.xionghaotian.vo.system.SysMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.collections.CollectionUtils;

import java.util.LinkedList;
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

    /**
     * 修改系统菜单信息。
     *
     * 通过调用SysMenuMapper的updateById方法，更新SysMenu对象在数据库中的信息。
     *
     * @param sysMenu 要更新的系统菜单对象，包含新的菜单信息。
     */
    @Override
    public void updateById(SysMenu sysMenu) {
        sysMenuMapper.updateById(sysMenu) ;
    }

    /**
     * 根据ID删除菜单项。
     * 此方法首先检查待删除菜单是否有子菜单，如果有，则不允许删除，因为删除可能破坏菜单结构。
     * 如果没有子菜单，则直接删除该菜单项。
     *
     * @param id 要删除的菜单项的ID。
     * @throws GuiguException 如果待删除菜单有子菜单，则抛出此异常，表示删除操作不被允许。
     */
    @Override
    public void removeById(Long id) {
        // 查询待删除菜单项是否有子菜单
        int count = sysMenuMapper.countByParentId(id);

        // 如果有子菜单，则不允许删除，抛出异常
        if (count > 0) {
            throw new GuiguException(ResultCodeEnum.NODE_ERROR);
        }

        // 如果没有子菜单，直接删除该菜单项
        sysMenuMapper.deleteById(id);
    }

    /**
     * 动态菜单获取用户菜单列表
     * 该方法用于根据当前登录用户的ID，查询并构建该用户可访问的菜单树状结构。
     * 菜单数据经过处理，形成树形结构，方便前端展示和操作。
     *
     * @return List<SysMenuVo> 返回当前用户可访问的菜单树状结构列表
     */
    @Override
    public List<SysMenuVo> findUserMenuList() {
        // 通过AuthContextUtil获取当前登录的系统用户
        SysUser sysUser = AuthContextUtil.get();
        // 获取当前登录用户的ID
        Long userId = sysUser.getId();

        List<SysMenu> sysMenuList = sysMenuMapper.selectListByUserId(userId);

        // 使用MenuHelper将查询到的菜单列表构建为树形结构
        // 构建树形数据
        List<SysMenu> sysMenuTreeList = MenuHelper.buildTree(sysMenuList);

        // 将构建好的树形结构转换为前端需要的VO对象列表，并返回
        return this.buildMenus(sysMenuTreeList);
    }


    // 将List<SysMenu>对象转换成List<SysMenuVo>对象
    private List<SysMenuVo> buildMenus(List<SysMenu> menus) {

        List<SysMenuVo> sysMenuVoList = new LinkedList<SysMenuVo>();
        for (SysMenu sysMenu : menus) {
            SysMenuVo sysMenuVo = new SysMenuVo();
            sysMenuVo.setTitle(sysMenu.getTitle());
            sysMenuVo.setName(sysMenu.getComponent());
            List<SysMenu> children = sysMenu.getChildren();
            if (!CollectionUtils.isEmpty(children)) {
                sysMenuVo.setChildren(buildMenus(children));
            }
            sysMenuVoList.add(sysMenuVo);
        }
        return sysMenuVoList;
    }

}
