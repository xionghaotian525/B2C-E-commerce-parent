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
     * 分页查询获取角色列表。
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
}
