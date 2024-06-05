package com.xionghaotian.service;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.system.SysRoleDto;
import com.xionghaotian.entity.system.SysRole;

/**
 * @ClassName SysRoleService
 * @Description 管理员端-权限管理-角色管理-服务层接口
 * @Author XiongHaoTian
 * @Date 2024年06月03日 20:08
 * @Version 1.0
 */
// 业务接口
public interface SysRoleService {
    /**
     * 分页查询获取角色列表（搜索功能）。
     *
     * 本方法为抽象方法，具体实现由子类完成。它提供了一个通用的框架，用于根据SysRoleDto对象中的条件，
     * 以及指定的页码和每页大小来查询SysRole对象的分页信息。
     *
     * @param sysRoleDto 查询条件对象，包含可能的过滤条件和排序规则。
     * @param pageNum 当前页码，用于指定查询的页码。
     * @param pageSize 每页的记录数，用于指定每页返回的SysRole对象数量。
     * @return PageInfo<SysRole> 分页查询结果，包含SysRole对象的列表以及分页信息。
     */
    public abstract PageInfo<SysRole> findByPage(SysRoleDto sysRoleDto, Integer pageNum, Integer pageSize);

    /**
     * 添加系统角色信息。
     *
     * 此方法是一个抽象方法，需要在子类中具体实现添加系统角色的逻辑。
     * 它的目的是为了在系统中保存SysRole对象的信息，可能是插入新角色信息，
     * 或者更新已存在的角色信息。具体的保存逻辑依赖于实现该方法的子类。
     *
     * @param sysRole 待保存的系统角色对象，包含角色的相关信息。
     */
    public abstract void saveSysRole(SysRole sysRole);

    /**
     * 更新系统角色信息。
     *
     * 该方法用于更新数据库中已存在的系统角色的信息。通过接收一个SysRole对象作为参数，
     * 将该对象中包含的角色信息更新到数据库对应的记录中。这涉及到可能的角色名称、权限或其他属性的更改。
     *
     * @param sysRole 包含需要更新的系统角色信息的对象。该对象中的信息将用于更新数据库中的相应记录。
     */
    public abstract void updateSysRole(SysRole sysRole);
}
