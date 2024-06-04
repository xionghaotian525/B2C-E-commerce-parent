package com.xionghaotian.controller;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.dto.system.SysRoleDto;
import com.xionghaotian.entity.system.SysRole;
import com.xionghaotian.service.SysRoleService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName SysRoleController
 * @Description 管理员端-权限管理-角色管理-逻辑控制层
 * @Author XiongHaoTian
 * @Date 2024年06月03日 20:14
 * @Version 1.0
 */

@RestController
@RequestMapping(value = "/admin/system/sysRole")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService ;

    @Operation(summary = "分页查询获取角色列表接口(搜索功能)")
    @PostMapping("/findByPage/{pageNum}/{pageSize}")
    public Result<PageInfo<SysRole>> findByPage(@RequestBody SysRoleDto sysRoleDto ,
                                                @PathVariable(value = "pageNum") Integer pageNum ,
                                                @PathVariable(value = "pageSize") Integer pageSize) {
        PageInfo<SysRole> pageInfo = sysRoleService.findByPage(sysRoleDto , pageNum , pageSize) ;
        return Result.build(pageInfo , ResultCodeEnum.SUCCESS) ;
    }

    @Operation(summary = "新增系统角色接口")
    @PostMapping("/saveSysRole")
    public Result saveSysRole(@RequestBody SysRole sysRole) {
        sysRoleService.saveSysRole(sysRole) ;
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }
}