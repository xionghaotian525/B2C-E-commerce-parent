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
}