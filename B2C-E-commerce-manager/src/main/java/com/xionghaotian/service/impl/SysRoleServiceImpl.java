package com.xionghaotian.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.system.SysRoleDto;
import com.xionghaotian.entity.system.SysRole;
import com.xionghaotian.mapper.SysRoleMapper;
import com.xionghaotian.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * 根据条件分页查询系统角色信息（搜索功能）。
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

    /**
     * 添加系统角色信息。
     *
     * 本方法通过调用sysRoleMapper的saveSysRole方法，来实现系统角色的保存操作。
     * 主要用于将系统角色对象持久化到数据库中。
     *
     * @param sysRole 待保存的系统角色对象，包含角色的相关信息。
     */
    @Override
    public void saveSysRole(SysRole sysRole) {
        sysRoleMapper.saveSysRole(sysRole) ;
    }

    /**
     * 更新系统角色信息。
     * 通过调用SysRoleMapper的updateSysRole方法，更新传入的SysRole对象的信息。
     * 此方法用于更新系统中已存在的角色信息，对角色的相关属性进行修改。
     *
     * @param sysRole 待更新的系统角色对象，包含新的角色信息。
     */
    @Override
    public void updateSysRole(SysRole sysRole) {
        sysRoleMapper.updateSysRole(sysRole) ;
    }

    /**
     * 根据角色ID删除角色信息(逻辑删除)。
     * 该方法通过调用sysRoleMapper的ById方法，传入角色ID来删除相应的角色数据。
     * 删除操作是基于数据库的，因此需要确保传入的ID有效，且对应的角色数据存在。
     *
     * @param roleId 要删除的角色的ID。这是一个长整型的数值，代表了角色的唯一标识。
     */
    @Override
    public void deleteSysRole(Long roleId) {
        sysRoleMapper.deleteById(roleId) ;
    }

    /**
     * 查询所有角色信息(权限管理-用户管理-分配角色-查询所有角色信息)
     *
     * 本方法通过调用sysRoleMapper的findAllRoles方法，获取系统中的所有角色列表。
     * 将获取到的角色列表封装到一个Map中，其中键为"allRolesList"，值为角色列表。
     * 这样做的目的是为了方便在前端展示所有角色的信息。
     *
     * @return Map<String, Object> 包含所有角色信息的Map对象，其中"allRolesList"键对应的值为角色列表。
     */
    @Override
    public Map<String, Object> findAllRoles() {
        // 调用sysRoleMapper的findAllRoles方法获取所有角色列表
        List<SysRole> sysRoleList = sysRoleMapper.findAllRoles() ;
        // 初始化一个Map用于存放结果
        Map<String , Object> resultMap = new HashMap<>() ;
        // 将角色列表放入Map中，键为"allRolesList"
        resultMap.put("allRolesList" , sysRoleList) ;
        // 返回包含所有角色信息的Map
        return resultMap;
    }
}
