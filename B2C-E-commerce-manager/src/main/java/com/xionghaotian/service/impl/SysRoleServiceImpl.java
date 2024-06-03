package com.xionghaotian.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.system.SysRoleDto;
import com.xionghaotian.entity.system.SysRole;
import com.xionghaotian.mapper.SysRoleMapper;
import com.xionghaotian.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SysRoleServiceImpl
 * @Description 管理员端-权限管理-角色管理-服务层实现类
 * @Author XiongHaoTian
 * @Date 2024年06月03日 20:11
 * @Version 1.0
 */

// 接口实现类
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper ;

    /**
     * 根据条件分页查询系统角色信息。
     *
     * 本方法实现了对系统角色数据的分页查询，根据提供的条件对象SysRoleDto和分页参数pageNum和pageSize，
     * 调用SysRoleMapper的findByPage方法进行查询，并返回查询结果的分页信息。
     *
     * @param sysRoleDto 查询条件对象，包含对系统角色的查询条件。
     * @param pageNum 当前页码，用于指定查询的页数。
     * @param pageSize 每页显示的数量，用于指定分页的大小。
     * @return PageInfo<SysRole> 分页信息对象，包含查询到的系统角色列表和分页相关信息。
     */
    @Override
    public PageInfo<SysRole> findByPage(SysRoleDto sysRoleDto, Integer pageNum, Integer pageSize) {
        // 初始化分页插件，指定当前页码和每页显示的记录数
        PageHelper.startPage(pageNum , pageSize) ;

        // 根据查询条件和分页参数，调用SysRoleMapper的findByPage方法查询系统角色列表
        List<SysRole> sysRoleList = sysRoleMapper.findByPage(sysRoleDto) ;

        // 将查询结果封装成PageInfo对象，用于返回分页信息
        PageInfo<SysRole> pageInfo = new PageInfo(sysRoleList) ;

        return pageInfo;
    }
}
