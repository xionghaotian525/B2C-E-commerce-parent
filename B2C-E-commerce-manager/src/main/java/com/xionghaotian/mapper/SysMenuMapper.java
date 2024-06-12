package com.xionghaotian.mapper;

import com.xionghaotian.entity.system.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName SysMenuMapper
 * @Description 管理员端-权限管理-菜单管理-持久层mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月11日 15:49
 * @Version 1.0
 */
@Mapper
public interface SysMenuMapper {
    public abstract List<SysMenu> selectAll();

    public abstract  void insert(SysMenu sysMenu);

    public abstract void updateById(SysMenu sysMenu);

    //删除菜单
    public abstract int countByParentId(Long id);
    public abstract void deleteById(Long id);

    //动态菜单
    public abstract List<SysMenu> selectListByUserId(Long userId);
}
