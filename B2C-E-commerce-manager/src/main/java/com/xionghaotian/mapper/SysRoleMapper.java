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

    /**
     * 更新系统角色信息。
     *
     * 此方法是一个抽象方法，需要在子类中具体实现更新系统角色的逻辑。
     * 它的目的是为了在系统中更新SysRole对象的信息，可能是更新角色名称，
     * 角色描述等。具体的更新逻辑依赖于实现该方法的子类。
     *
     * @param sysRole 待更新的系统角色对象，包含角色的相关信息。
     */
    public abstract void updateSysRole(SysRole sysRole);

    /**
     * 根据角色ID删除角色信息（逻辑删除）。
     *
     * 本方法是一个抽象方法，具体实现由子类提供。其目的是通过角色的ID来删除相应的角色数据。
     * 删除操作的细节，如如何访问数据库或处理其他资源，将在实现此方法的子类中定义。
     *
     * @param roleId 要删除的角色的ID。作为一个长整型值传递，用于唯一标识一个角色。
     *               删除操作将基于此ID查找并删除相应的角色记录（本质上为逻辑删除，更新is_deleted值为1）。
     */
    public abstract void deleteById(Long roleId);

    /**
     * 查询所有角色信息(权限管理-用户管理-分配角色-查询所有角色信息)
     * @return List<SysRole> 角色列表
     */
    public abstract List<SysRole> findAllRoles();
}