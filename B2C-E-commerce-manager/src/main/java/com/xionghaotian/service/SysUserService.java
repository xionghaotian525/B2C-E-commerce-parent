package com.xionghaotian.service;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.system.AssignRoleDto;
import com.xionghaotian.dto.system.LoginDto;
import com.xionghaotian.dto.system.SysUserDto;
import com.xionghaotian.entity.system.SysUser;
import com.xionghaotian.vo.system.LoginVo;

/**
 * @ClassName SysUserService
 * @Description SysUserService接口
 * @Author XiongHaoTian
 * @Date 2024年05月19日 21:19
 * @Version 1.0
 */
public interface SysUserService {
    /**
     * 根据用户名查询用户数据
     */
    public abstract LoginVo login(LoginDto loginDto) ;

    /**
     * 根据token获取用户信息
     */
    SysUser getUserInfo(String token);

    /**
     * 用户登出功能。
     */
    void logout(String token);

    /**
     * 分页查询获取用户列表接口(搜索功能)
     */
    public abstract PageInfo<SysUser> findByPage(SysUserDto sysUserDto, Integer pageNum, Integer pageSize);

    /**
     * 添加用户
     */
    public abstract void saveSysUser(SysUser sysUser);

    /**
     * 修改用户
     */
    public abstract void updateSysUser(SysUser sysUser);

    /**
     * 删除用户
     */
    public abstract void deleteById(Long userId);

    /**
     * 保存为用户分配的角色信息
     */
    public abstract void doAssign(AssignRoleDto assignRoleDto);
}

