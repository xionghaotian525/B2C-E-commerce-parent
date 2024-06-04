package com.xionghaotian.mapper;

import com.xionghaotian.dto.system.SysRoleDto;
import com.xionghaotian.entity.system.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName SysRoleMapper
 * @Description 管理员端-权限管理-角色管理-mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月03日 20:03
 * @Version 1.0
 */
@Mapper
public interface SysRoleMapper {
    /**
     * 根据条件分页查询系统角色信息（搜索功能）。
     *
     * 本方法是一个抽象方法，具体实现由子类提供。它旨在通过SysRoleDto对象中的条件，
     * 查询数据库中的SysRole对象，并以分页的形式返回查询结果。
     *
     * @param sysRoleDto 查询条件对象，包含角色相关的查询条件。
     * @return 返回符合查询条件的角色列表，列表中的元素类型为SysRole。
     */
    public abstract List<SysRole> findByPage(SysRoleDto sysRoleDto);

    /**
     * 添加系统角色信息。
     *
     * 此方法是一个抽象方法，需要在子类中具体实现保存系统角色的逻辑。
     * 它的目的是为了在系统中保存SysRole对象的信息，可能是插入新角色信息，
     * 或者更新已存在的角色信息。具体的保存逻辑依赖于实现该方法的子类。
     *
     * @param sysRole 待保存的系统角色对象，包含角色的相关信息。
     */
    public abstract void saveSysRole(SysRole sysRole);
}